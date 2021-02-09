package cloud.icepan.rbac.model;

import java.sql.Timestamp;

/***
 *@Author lyer
 *@Date 2/9/21 13:46
 *@Description
 *
 ***/


public class Api {
    private Integer id;
    private String urlPath;
    private String apiDescribe;
    private Boolean status;
    private Timestamp createTime;
    private Timestamp updateTime;
    private Timestamp deleteTime;

    public Api() {
    }

    public Api(String urlPath, String apiDescribe, Boolean status, Timestamp createTime) {
        this.urlPath = urlPath;
        this.apiDescribe = apiDescribe;
        this.status = status;
        this.createTime = createTime;
        this.updateTime = createTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrlPath() {
        return urlPath;
    }

    public void setUrlPath(String urlPath) {
        this.urlPath = urlPath;
    }

    public String getApiDescribe() {
        return apiDescribe;
    }

    public void setApiDescribe(String apiDescribe) {
        this.apiDescribe = apiDescribe;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public Timestamp getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Timestamp deleteTime) {
        this.deleteTime = deleteTime;
    }
}
