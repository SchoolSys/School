package com.school.pojo;

import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
/**
* @Description:  成绩
* @Param:
* @return:
* @Author: Tonghuan
* @Date: 2018/12/27
*/
public class Score implements Serializable {
    private String id;

    private String createBy;

    private String createTime;

    private String updateBy;

    private String updateTime;

    private Student stuId;

    private CourseInfo courId;

    private Integer peaGrade;

    private Integer pndGrade;

    private Integer synGrade;

    private Byte state;

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

    public Student getStuId() {
        return stuId;
    }

    public void setStuId(Student stuId) {
        this.stuId = stuId;
    }

    public CourseInfo getCourId() {
        return courId;
    }

    public void setCourId(CourseInfo courId) {
        this.courId = courId;
    }

    public Integer getPeaGrade() {
        return peaGrade;
    }

    public void setPeaGrade(Integer peaGrade) {
        this.peaGrade = peaGrade;
    }

    public Integer getPndGrade() {
        return pndGrade;
    }

    public void setPndGrade(Integer pndGrade) {
        this.pndGrade = pndGrade;
    }

    public Integer getSynGrade() {
        return synGrade;
    }

    public void setSynGrade(Integer synGrade) {
        this.synGrade = synGrade;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public Byte getDelete() {
        return delete;
    }

    public void setDelete(Byte delete) {
        this.delete = delete;
    }
}