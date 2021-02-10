package cloud.icepan.rbac.model;

import java.sql.Timestamp;

/***
 *@Author lyer
 *@Date 2/9/21 13:46
 *@Description
 *
 ***/


public class Permission extends BaseModel {
    private String title;
    private String permissionDescribe;


    public Permission() {
    }

    public Permission(Integer id, Timestamp createTime, Timestamp updateTime, Timestamp deleteTime, Boolean status, String title, String permissionDescribe) {
        super(id, createTime, updateTime, deleteTime, status);
        this.title = title;
        this.permissionDescribe = permissionDescribe;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPermissionDescribe() {
        return permissionDescribe;
    }

    public void setPermissionDescribe(String permissionDescribe) {
        this.permissionDescribe = permissionDescribe;
    }
}
