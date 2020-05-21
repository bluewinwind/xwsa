import Vue from "vue";
import VueRouter from "vue-router";
import store from "@/store";
import ViewUI from "view-design";
import { setTitle } from "@/libs/tools";
import routes from "./routers";
import config from "@/config";
Vue.use(VueRouter);

const originalPush = VueRouter.prototype.push;
VueRouter.prototype.push = function push(location, onResolve, onReject) {
  if (onResolve || onReject)
    return originalPush.call(this, location, onResolve, onReject);
  return originalPush.call(this, location).catch(err => err);
};
const originalReplace = VueRouter.prototype.replace;
VueRouter.prototype.replace = function repalce(location, onResolve, onReject) {
  if (onResolve || onReject)
    return originalReplace.call(this, location, onResolve, onReject);
  return originalReplace.call(this, location).catch(err => err);
};
const { homeName, loginName } = config;
const NOT_FOUND_ROUTER = {
  path: "*",
  name: "error_404",
  meta: {
    hideInMenu: true
  },
  component: () => import("@/views/error-page/404.vue")
};
const router = new VueRouter({
  routes
});
const initRouters = store => {
  if (store.state.user.hasGetInfo) {
    if (
      !(
        store.state.app.hasGetRouter &&
        store.state.app.routers &&
        store.state.app.routers.length > 0
      )
    ) {
      store
        .dispatch("getMenuInfo")
        .then(routers => {
          const newRouter = new VueRouter({
            routes,
            mode: config.routerModel
          });
          router.matcher = newRouter.matcher;
          router.addRoutes(routers.concat([NOT_FOUND_ROUTER]));
        })
        .finally(() => {});
    }
  }
};
router.beforeEach((to, from, next) => {
  ViewUI.LoadingBar.start();
  const token = store.getters.token;
  if (!token && to.name !== loginName) {
    next({
      name: loginName
    });
  } else if (!token && to.name === loginName) {
    next();
  } else if (token && to.name === loginName) {
    next({
      name: homeName
    });
  } else {
    if (store.state.user.hasGetInfo) {
      initRouters(store);
      next();
    } else {
      store
        .dispatch("getUserInfo")
        .then(() => {
          initRouters(store);
          next();
        })
        .catch(() => {
          store.commit("setToken", "");
          next({
            name: "login"
          });
        });
    }
  }
});
router.afterEach(to => {
  setTitle(to, router.app);
  ViewUI.LoadingBar.finish();
  window.scrollTo(0, 0);
});
export default router;
