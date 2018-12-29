package com.school.pojo;

import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
/**
* @Description: 班级
* @return:
* @Author: Tonghuan
* @Date: 2018/12/26
*/
public class Class implements Serializable {
    private String id;

    private String createBy;

    private String createTime;

    private String updateBy;

    private String updateTime;

    private Teacher preceptorId;

    private Teacher coachId;

    private String name;

    private Integer number;

    private Academy acaId;

    private Integer session;

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

    public Teacher getPreceptorId() {
        return preceptorId;
    }

    public void setPreceptorId(Teacher preceptorId) {
        this.preceptorId = preceptorId;
    }

    public Teacher getCoachId() {
        return coachId;
    }

    public void setCoachId(Teacher coachId) {
        this.coachId = coachId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Academy getAcaId() {
        return acaId;
    }

    public void setAcaId(Academy acaId) {
        this.acaId = acaId;
    }

    public Integer getSession() {
        return session;
    }

    public void setSession(Integer session) {
        this.session = session;
    }

    public Byte getDelete() {
        return delete;
    }

    public void setDelete(Byte delete) {
        this.delete = delete;
    }
}