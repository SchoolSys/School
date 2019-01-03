package com.school.pojo;

import java.io.Serializable;
/**
* @Description: 课程-老师
* @Param:
* @return:
* @Author: Tonghuan
* @Date: 2018/12/26
*/
public class CourseTeacher implements Serializable {
    private String id;

    private String createBy;

    private String createTime;

    private String updateBy;

    private String updateTime;

    private CourseInfo courId;

    private Teacher teachId;

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

    public Teacher getTeachId() {
        return teachId;
    }

    public void setTeachId(Teacher teachId) {
        this.teachId = teachId;
    }

    public Byte getDelete() {
        return delete;
    }

    public void setDelete(Byte delete) {
        this.delete = delete;
    }
}