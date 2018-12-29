package com.school.pojo;

import java.io.Serializable;
/**
* @Description: 考场信息
* @Param:
* @return:
* @Author: Tonghuan
* @Date: 2018/12/26
*/
public class ExaminationhallInfo implements Serializable {
    private String id;

    private String createBy;

    private String createTime;

    private String updateBy;

    private String updateTime;

    private Student stuId;

    private Student stuName;

    private TestInfo testInfoId;

    private Integer seat;

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

    public Student getStuName() {
        return stuName;
    }

    public void setStuName(Student stuName) {
        this.stuName = stuName;
    }

    public TestInfo getTestInfoId() {
        return testInfoId;
    }

    public void setTestInfoId(TestInfo testInfoId) {
        this.testInfoId = testInfoId;
    }

    public Integer getSeat() {
        return seat;
    }

    public void setSeat(Integer seat) {
        this.seat = seat;
    }

    public Byte getDelete() {
        return delete;
    }

    public void setDelete(Byte delete) {
        this.delete = delete;
    }
}