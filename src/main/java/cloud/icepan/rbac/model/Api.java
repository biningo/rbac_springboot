package cloud.icepan.rbac.model;

import java.sql.Timestamp;

/***
 *@Author lyer
 *@Date 2/9/21 13:46
 *@Description
 *
 ***/


public class Api extends BaseModel {
    private String urlPath;
    private String apiDescribe;
    public Api() {
    }

    public Api(Integer id, Timestamp createTime, Timestamp updateTime, Timestamp deleteTime, Boolean status, String urlPath, String apiDescribe) {
        super(id, createTime, updateTime, deleteTime, status);
        this.urlPath = urlPath;
        this.apiDescribe = apiDescribe;
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
}
