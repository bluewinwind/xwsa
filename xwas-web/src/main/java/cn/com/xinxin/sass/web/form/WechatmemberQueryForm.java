package cn.com.xinxin.sass.web.form;

import cn.com.xinxin.sass.api.base.ToString;

/**
 * @author: zhouyang
 * @created: 13/07/2018.
 * @updater:
 * @description: 组织创建数据转换对象
 */
public class WechatmemberQueryForm extends ToString {

    private static final long serialVersionUID = -3821494142512774077L;


    private Integer pageSize;

    private Integer pageIndex;

    private String userId;

    private String memberName;

    private String mobile;

    private String deptId;


    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }
}