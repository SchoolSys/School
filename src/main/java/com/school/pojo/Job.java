package com.school.pojo;

import java.io.Serializable;
/**
* @Description: 职务
* @Param:
* @return:
* @Author: Tonghuan
* @Date: 2018/12/26
*/
public class Job implements Serializable {
    private String id;

    private String createBy;

    private String createTime;

    private String updateBy;

    private String updateTime;

    private Teacher teachId;

    private Academy acaId;

    private String job;

    private Academy acaName;

    private Byte delete;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Teacher getTeaId() {
        return teaId;
    }

    public void setTeaId(Teacher teaId) {
        this.teaId = teaId;
    }

    public Academy getAcaId() {
        return acaId;
    }

    public void setAcaId(Academy acaId) {
        this.acaId = acaId;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Academy getAcaName() {
        return acaName;
    }

    public void setAcaName(Academy acaName) {
        this.acaName = acaName;
    }

    public Byte getDelete() {
        return delete;
    }

    public void setDelete(Byte delete) {
        this.delete = delete;
    }
}