package cloud.icepan.rbac.model;

import java.sql.Timestamp;

/***
 *@Author lyer
 *@Date 2/10/21 17:45
 *@Description
 *
 ***/
public class BaseModel {
    private Integer id;
    private Timestamp createTime;
    private Timestamp updateTime;
    private Timestamp deleteTime;
    private Boolean status;

    public BaseModel() {
    }

    public BaseModel(Integer id, Timestamp createTime, Timestamp updateTime, Timestamp deleteTime, Boolean status) {
        this.id = id;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.deleteTime = deleteTime;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
