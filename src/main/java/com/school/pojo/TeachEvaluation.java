package com.school.pojo;

import java.io.Serializable;
/**
* @Description: 教学考评
* @Param:
* @return:
* @Author: Tonghuan
* @Date: 2018/12/27
*/
public class TeachEvaluation implements Serializable {
    private String id;

    private String createBy;

    private String createTime;

    private String updateBy;

    private String updateTime;

    private CourseInfo courId;

    private CourseInfo courName;

    private Teacher teachId;

    private Teacher teachName;

    private Integer please;

    private Byte flag;

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

    public CourseInfo getCourId() {
        return courId;
    }

    public void setCourId(CourseInfo courId) {
        this.courId = courId;
    }

    public CourseInfo getCourName() {
        return courName;
    }

    public void setCourName(CourseInfo courName) {
        this.courName = courName;
    }

    public Teacher getTeachId() {
        return teachId;
    }

    public void setTeachId(Teacher teachId) {
        this.teachId = teachId;
    }

    public Teacher getTeachName() {
        return teachName;
    }

    public void setTeachName(Teacher teachName) {
        this.teachName = teachName;
    }

    public Integer getPlease() {
        return please;
    }

    public void setPlease(Integer please) {
        this.please = please;
    }

    public Byte getFlag() {
        return flag;
    }

    public void setFlag(Byte flag) {
        this.flag = flag;
    }

    public Byte getDelete() {
        return delete;
    }

    public void setDelete(Byte delete) {
        this.delete = delete;
    }
}