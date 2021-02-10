package cloud.icepan.rbac.model;

import java.sql.Timestamp;

/***
 *@Author lyer
 *@Date 2/9/21 13:46
 *@Description
 *
 ***/


public class User extends BaseModel {
    private String username;
    private String password;
    private String avatarUrl;
    private String userDescribe;
    private Integer roleId;

    public User() {
    }

    public User(Integer id, Timestamp createTime, Timestamp updateTime, Timestamp deleteTime, Boolean status, String username, String password, String avatarUrl, String userDescribe, Integer roleId) {
        super(id, createTime, updateTime, deleteTime, status);
        this.username = username;
        this.password = password;
        this.avatarUrl = avatarUrl;
        this.userDescribe = userDescribe;
        this.roleId = roleId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getUserDescribe() {
        return userDescribe;
    }

    public void setUserDescribe(String userDescribe) {
        this.userDescribe = userDescribe;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}
