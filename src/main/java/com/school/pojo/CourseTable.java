package com.school.pojo;

import java.io.Serializable;
/**
* @Description: 课程表
* @Param:
* @return:
* @Author: Tonghuan
* @Date: 2018/12/26
*/
public class CourseTable implements Serializable {
    private String id;

    private String createBy;

    private String createTime;

    private String updateBy;

    private String updateTime;

    private CourseInfo courId;

    private Class classId;

    private Student stuId;

    private String week;

    private Teacher teachId;

    private String startTime;

    private String endTime;

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

    public CourseInfo getCourseId() {
        return courseId;
    }

    public void setCourseId(CourseInfo courseId) {
        this.courseId = courseId;
    }

    public Class getClassId() {
        return classId;
    }

    public void setClassId(Class classId) {
        this.classId = classId;
    }

    public Student getStuId() {
        return stuId;
    }

    public void setStuId(Student stuId) {
        this.stuId = stuId;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public Teacher getTeachId() {
        return teachId;
    }

    public void setTeachId(Teacher teachId) {
        this.teachId = teachId;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Byte getDelete() {
        return delete;
    }

    public void setDelete(Byte delete) {
        this.delete = delete;
    }
}