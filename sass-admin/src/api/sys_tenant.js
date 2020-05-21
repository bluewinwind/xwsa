import axios from "@/libs/http";

export const getTenantList = data => {
  return axios.request({
    url: "tenant/list",
    data,
    method: "post"
  });
};

export const queryTenant = ({ code }) => {
  return axios.request({
    url: "tenant/query/" + code,
    method: "get"
  });
};

export const delTenant = ({ codes }) => {
  let data = { codes };
  return axios.request({
    url: "tenant/delete",
    data,
    method: "post"
  });
};
export const addTenant = ({
  name,
  corpId,
  state,
  privateKey,
  addressListSecret,
  customerContactSecret,
  chatRecordSecret,
  remark
}) => {
  let data = {
    name,
    corpId,
    state,
    privateKey,
    addressListSecret,
    customerContactSecret,
    chatRecordSecret,
    remark
  };
  return axios.request({
    url: "tenant/create",
    data,
    method: "post"
  });
};
export const updateTenant = ({
  code,
  name,
  corpId,
  state,
  privateKey,
  addressListSecret,
  customerContactSecret,
  chatRecordSecret,
  remark
}) => {
  let data = {
    code,
    name,
    corpId,
    state,
    privateKey,
    addressListSecret,
    customerContactSecret,
    chatRecordSecret,
    remark
  };
  return axios.request({
    url: "tenant/update",
    data,
    method: "post"
  });
};
export const queryTenantConfig = ({ tenantId }) => {
  return axios.request({
    params: {
      tenantId
    },
    url: "tenant/queryConfig",
    method: "get"
  });
};
export const createTenantTask = ({
  taskType,
  cronExpression,
  status,
  countCeiling,
  timeInterval
}) => {
  let data = { taskType, cronExpression, status, countCeiling, timeInterval };
  return axios.request({
    url: "tenant/tenantConfig/create",
    data,
    method: "post"
  });
};
export const updateTenantTask = ({
  id,
  taskType,
  cronExpression,
  status,
  countCeiling,
  timeInterval
}) => {
  let data = {
    id,
    taskType,
    cronExpression,
    status,
    countCeiling,
    timeInterval
  };
  return axios.request({
    url: "tenant/tenantConfig/update",
    data,
    method: "post"
  });
};
export const executeJob = ({ taskType }) => {
  return axios.request({
    params: {
      taskType
    },
    url: "tenant/executeJob",
    method: "get"
  });
};
export const queryTaskLog = data => {
  return axios.request({
    data,
    url: "tenant/jobLog/query",
    method: "post"
  });
};
