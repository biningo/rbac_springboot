package cloud.icepan.rbac.model;

import java.sql.Timestamp;

/***
 *@Author lyer
 *@Date 2/9/21 13:46
 *@Description
 *
 ***/


public class Role extends BaseModel {
    private String title;
    private String roleDescribe;

    public Role() {
    }

    public Role(Integer id, Timestamp createTime, Timestamp updateTime, Timestamp deleteTime, Boolean status, String title, String roleDescribe) {
        super(id, createTime, updateTime, deleteTime, status);
        this.title = title;
        this.roleDescribe = roleDescribe;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRoleDescribe() {
        return roleDescribe;
    }

    public void setRoleDescribe(String roleDescribe) {
        this.roleDescribe = roleDescribe;
    }
}
