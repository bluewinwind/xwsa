const path = require("path");

const resolve = dir => {
  return path.join(__dirname, dir);
};
const BASE_URL = process.env.NODE_ENV === "production" ? "./" : "/";
module.exports = {
  publicPath: BASE_URL,
  css: {
    loaderOptions: {
      less: {
        javascriptEnabled: true
      }
    }
  },
  chainWebpack: config => {
    config.plugins.delete("prefetch");
    config.resolve.alias.set("@", resolve("src"));
  },
  // 本地运行代理设置
  // devServer: {
  //   proxy: 'localhost:3000'
  // }
  devServer: {
    proxy: "http://172.27.0.16:8080"
  }
};
