/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50549
Source Host           : localhost:3306
Source Database       : school

Target Server Type    : MYSQL
Target Server Version : 50549
File Encoding         : 65001

Date: 2018-12-25 12:26:44
*/

SET FOREIGN_KEY_CHECKS=0;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`school` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `school`;
-- ----------------------------
-- Table structure for `dict_type`
-- ----------------------------
DROP TABLE IF EXISTS `dict`;
CREATE TABLE `dict_type` (
  `dict_id` varchar(36) NOT NULL COMMENT '数据字典类型Id|李童欢|2018-12-20',
  `dict_create_by` varchar(36) DEFAULT NULL COMMENT '创建人|李童欢|2018-12-20',
  `dict_create_time` varchar(25) DEFAULT NULL COMMENT '创建时间|李童欢|2018-12-20',
  `dict_update_by` varchar(36) DEFAULT NULL COMMENT '更新人|李童欢|2018-12-20',
  `dict_update_time` varchar(25) DEFAULT NULL COMMENT '更新时间|李童欢|2018-12-20',
  `dict_code` varchar(20) NOT NULL COMMENT '数据字典编码Id|李童欢|2018-12-20',
  `dict_value` varchar(36) DEFAULT NULL COMMENT '数据字典值|李童欢|2018-12-20',
  `dict_name` varchar(36) NOT NULL COMMENT '字典名称|李童欢|2018-12-20',
  `dict_delete` tinyint(4) DEFAULT NULL COMMENT '是否删除 0:删除 1:不删除 ||杨德石|2018-12-25',
  PRIMARY KEY (`dict_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='数据字典类型表|李童欢|2018-12-20';

-- ----------------------------
-- Records of dict_type
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_academy`
-- ----------------------------
DROP TABLE IF EXISTS `sys_academy`;
CREATE TABLE `sys_academy` (
  `acad_id` varchar(36) NOT NULL COMMENT '学院id|李童欢|2018-12-20',
  `acad_create_by` varchar(36) DEFAULT NULL COMMENT '创建人|李童欢|2018-12-20',
  `acad_create_time` varchar(25) DEFAULT NULL COMMENT '创建时间|李童欢|2018-12-20',
  `acad_update_by` varchar(36) DEFAULT NULL COMMENT '更新人|李童欢|2018-12-20',
  `acad_update_time` varchar(25) DEFAULT NULL COMMENT '更新时间|李童欢|2018-12-20',
  `acad_name` varchar(36) NOT NULL COMMENT '学院名字||李童欢|2018-12-20',
  `acad_address` mediumtext NOT NULL COMMENT '地点|李童欢|2018-12-20',
  `acad_school_id` varchar(36) NOT NULL COMMENT '所属学校|李童欢|2018-12-20',
  `acad_delete` tinyint(4) DEFAULT NULL COMMENT '是否删除 0:删除 1:不删除 ||李童欢|2018-12-20',
  PRIMARY KEY (`acad_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='基本模块|学院|李童欢|2018-12-20';

-- ----------------------------
-- Records of sys_academy
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_channel`
-- ----------------------------
DROP TABLE IF EXISTS `sys_channel`;
CREATE TABLE `sys_channel` (
  `channel_id` varchar(36) NOT NULL COMMENT 'ID',
  `channel_create_by` varchar(36) DEFAULT NULL COMMENT '创建人|李童欢|2018-12-20',
  `channel_create_time` varchar(25) DEFAULT NULL COMMENT '创建时间|李童欢|2018-12-20',
  `channel_update_by` varchar(36) DEFAULT NULL COMMENT '更新人|李童欢|2018-12-20',
  `channel_update_time` varchar(25) DEFAULT NULL COMMENT '更新时间|李童欢|2018-12-20',
  `channel_name` varchar(100) DEFAULT NULL COMMENT '频道名称',
  `channel_state` varchar(1) DEFAULT NULL COMMENT '状态',
  `channel_delete` tinyint(4) DEFAULT NULL COMMENT '是否删除 0:删除 1:不删除 |李童欢|2018-12-20',
  PRIMARY KEY (`channel_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='频道';

-- ----------------------------
-- Records of sys_channel
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_class`
-- ----------------------------
DROP TABLE IF EXISTS `sys_class`;
CREATE TABLE `sys_class` (
  `class_id` varchar(36) NOT NULL COMMENT '班级id|李童欢|2018-12-20',
  `class_create_by` varchar(36) DEFAULT NULL COMMENT '创建人|李童欢|2018-12-20',
  `class_create_time` varchar(25) DEFAULT NULL COMMENT '创建时间|李童欢|2018-12-20',
  `class_update_by` varchar(36) DEFAULT NULL COMMENT '更新人|李童欢|2018-12-20',
  `class_update_tmie` varchar(25) DEFAULT NULL COMMENT '更新时间|李童欢|2018-12-20',
  `class_preceptor_id` varchar(36) NOT NULL COMMENT '班主任id|李童欢|2018-12-20',
  `class_coach_id` varchar(36) NOT NULL COMMENT '辅导员id||李童欢|2018-12-20',
  `class_name` varchar(50) NOT NULL COMMENT '班级名称|李童欢|2018-12-20',
  `class_number` int(11) NOT NULL COMMENT '班级人数|李童欢|2018-12-20',
  `class_aca_id` varchar(36) NOT NULL COMMENT '学院id|李童欢|2018-12-20',
  `class_session` int(11) NOT NULL COMMENT '届数|李童欢|2018-12-20',
  `class_delete` tinyint(4) DEFAULT NULL COMMENT '是否删除 0:删除 1:不删除 ||李童欢|2018-12-20',
  PRIMARY KEY (`class_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='基本信息|班级|李童欢|2018-12-20';

-- ----------------------------
-- Records of sys_class
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_classroom_config`
-- ----------------------------
DROP TABLE IF EXISTS `sys_class_config`;
CREATE TABLE `sys_classroom_config` (
  `config_id` varchar(36) NOT NULL COMMENT '教室配置||李童欢|2018-12-20',
  `config_create_by` varchar(36) DEFAULT NULL COMMENT '创建人|李童欢|2018-12-20',
  `config_create_time` varchar(36) DEFAULT NULL COMMENT '创建时间|李童欢|2018-12-20',
  `config_update_by` varchar(36) DEFAULT NULL COMMENT '更新人|李童欢|2018-12-20',
  `config_update_time` varchar(36) DEFAULT NULL COMMENT '更新时间|李童欢|2018-12-20',
  `config_start_time` varchar(36) NOT NULL COMMENT '上课开始时间|李童欢|2018-12-20',
  `config_end_time` varchar(36) NOT NULL COMMENT '上课结束时间|李童欢|2018-12-20',
  `config_course_id` varchar(36) NOT NULL COMMENT '课程Id|李童欢|2018-12-20',
  `config_class_id` varchar(36) NOT NULL COMMENT '上课地点id|李童欢|2018-12-20',
  `config_delete` tinyint(4) DEFAULT NULL COMMENT '是否删除 0:删除 1:不删除 |李童欢|2018-12-20',
  PRIMARY KEY (`config_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='教务管理|教室配置 |李童欢|2018-12-20';

-- ----------------------------
-- Records of sys_classroom_config
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_classinfo`
-- ----------------------------
DROP TABLE IF EXISTS `sys_course_info`;
CREATE TABLE `sys_course_info` (
  `cinfo_id` varchar(36) NOT NULL COMMENT '课程信息id|李童欢|2018-12-20',
  `cinfo_create_by` varchar(36) DEFAULT NULL COMMENT '创建人|李童欢|2018-12-20',
  `cinfo_create_time` varchar(25) DEFAULT NULL COMMENT '创建时间|李童欢|2018-12-20',
  `cinfo_update_by` varchar(36) DEFAULT NULL COMMENT '更新人人|李童欢|2018-12-20',
  `cinfo_update_time` varchar(25) DEFAULT NULL COMMENT '更新时间|李童欢|2018-12-20',
  `cinfo_name` varchar(50) NOT NULL COMMENT '课程名称|李童欢|2018-12-20',
  `cinfo_period` varchar(36) NOT NULL COMMENT '课程学时李童欢|2018-12-20',
  `cinfo_type` varchar(36) NOT NULL COMMENT '课程类别||李童欢|2018-12-20',
  `cinfo_credit` int(11) NOT NULL COMMENT '课程学分|李童欢|2018-12-20',
  `cinfo_aca_id` varchar(36) NOT NULL COMMENT '所属学院|李童欢|2018-12-20',
  `cinfo_delete` tinyint(4) DEFAULT NULL COMMENT '是否删除 0:删除 1:不删除 ||李童欢|2018-12-20',
  PRIMARY KEY (`cinfo_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='教学管理|课程信息表|李童欢|2018-12-20';

-- ----------------------------
-- Records of sys_course_info
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_lesson_address`
-- ----------------------------
DROP TABLE IF EXISTS `sys_lesson_address`;
CREATE TABLE `sys_lesson_address` (
  `addr_id` varchar(36) NOT NULL COMMENT '上课地点id|李童欢|2018-12-20',
  `addr_create_by` varchar(36) DEFAULT NULL COMMENT '创建人|李童欢|2018-12-20',
  `addr_create_time` varchar(25) DEFAULT NULL COMMENT '创建时间|李童欢|2018-12-20',
  `addr_update_by` varchar(36) DEFAULT NULL COMMENT '更新人|李童欢|2018-12-20',
  `addr_update_time` varchar(25) DEFAULT NULL COMMENT '更新时间|李童欢|2018-12-20',
  `addr_cour_id` varchar(36) NOT NULL COMMENT '课程id',
  `addr_cr_id` varchar(36) NOT NULL COMMENT '教室id',
  `addr_class_id` varchar(36) NOT NULL COMMENT '班级id',
  `addr_delete` tinyint(4) DEFAULT NULL COMMENT '是否删除 0:删除 1:不删除 |李童欢|2018-12-20',
  PRIMARY KEY (`addr_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='教学模块|上课地点|李童欢|2018-12-20';

-- ----------------------------
-- Records of sys_lesson_address
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_class_teacher`
-- ----------------------------
DROP TABLE IF EXISTS `sys_class_teacher`;
CREATE TABLE `sys_class_teacher` (
  `cteach_id` varchar(36) NOT NULL COMMENT '主键|李童欢|2018-12-20',
  `cteach_create_by` varchar(36) DEFAULT NULL COMMENT '创建人|李童欢|2018-12-20',
  `cteach_create_time` varchar(25) DEFAULT NULL COMMENT '创建时间|李童欢|2018-12-20',
  `cteach_update_by` varchar(36) DEFAULT NULL COMMENT '更新人|李童欢|2018-12-20',
  `cteach_update_time` varchar(25) DEFAULT NULL COMMENT '更新时间|李童欢|2018-12-20',
  `cteach_class_id` varchar(36) NOT NULL COMMENT '班级id|李童欢|2018-12-20',
  `cteach_teach_id` varchar(36) NOT NULL COMMENT '教师id|李童欢|2018-12-20',
  `cteach_delete` tinyint(4) DEFAULT NULL COMMENT '是否删除 0:删除 1:不删除 |李童欢|2018-12-20',
  PRIMARY KEY (`cteach_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='教务管理|班级-教师表|李童欢|2018-12-20';

-- ----------------------------
-- Records of sys_class_teacher
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_column`
-- ----------------------------
DROP TABLE IF EXISTS `sys_column`;
CREATE TABLE `sys_column` (
  `column_id` varchar(36) NOT NULL COMMENT '专栏ID|李童欢|2018-12-20',
  `column_create_by` varchar(36) DEFAULT NULL COMMENT '创建人|李童欢|2018-12-20',
  `column_create_time` varchar(25) DEFAULT NULL COMMENT '创建时间|李童欢|2018-12-20',
  `column_update_by` varchar(36) DEFAULT NULL COMMENT '更新人|李童欢|2018-12-20',
  `column_update_time` varchar(25) DEFAULT NULL COMMENT '更新时间|李童欢|2018-12-20',
  `column_name` varchar(100) DEFAULT NULL COMMENT '专栏名称|李童欢|2018-12-20',
  `column_summary` varchar(1000) DEFAULT NULL COMMENT '专栏简介|李童欢|2018-12-20',
  `column_user_id` varchar(36) DEFAULT NULL COMMENT '用户ID|李童欢|2018-12-20',
  `column_apply_time` datetime DEFAULT NULL COMMENT '申请日期|李童欢|2018-12-20',
  `column_check_time` datetime DEFAULT NULL COMMENT '审核日期|李童欢|2018-12-20',
  `column_state` tinyint(4) DEFAULT NULL COMMENT '状态, 0 :审核中 1 审核通过 2 审核失败|李童欢|2018-12-20',
  `column_delete` tinyint(4) DEFAULT NULL COMMENT '是否删除 0:删除 1:不删除 |李童欢|2018-12-20',
  PRIMARY KEY (`column_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='专栏';

-- ----------------------------
-- Records of sys_column
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_courseroom`
-- ----------------------------
DROP TABLE IF EXISTS `sys_course_room`;
CREATE TABLE `sys_course_room` (
  `croom_id` varchar(36) NOT NULL COMMENT '主键|李童欢|2018-12-20',
  `croom_create_by` varchar(36) DEFAULT NULL COMMENT '创建人|李童欢|2018-12-20',
  `croom_create_time` varchar(25) DEFAULT NULL COMMENT '创建时间|李童欢|2018-12-20',
  `croom_update_by` varchar(36) DEFAULT NULL COMMENT '更新人|李童欢|2018-12-20',
  `croom_update_time` varchar(25) DEFAULT NULL COMMENT '更新时间|李童欢|2018-12-20',
  `croom_name` varchar(36) NOT NULL COMMENT '课室名称|李童欢|2018-12-20',
  `croom_state` tinyint(4) NOT NULL COMMENT '状态, 0 :上课 1 借出 2 空闲 |李童欢|2018-12-20',
  `croom_delete` tinyint(4) DEFAULT NULL COMMENT '是否删除 0:删除 1:不删除 |李童欢|2018-12-20',
  PRIMARY KEY (`croom_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='教务管理表|课程教室表|李童欢|2018-12-20';

-- ----------------------------
-- Records of sys_course_room
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_coursetable`
-- ----------------------------
DROP TABLE IF EXISTS `sys_course_table`;
CREATE TABLE `sys_course_table` (
  `ctable_id` varchar(36) NOT NULL COMMENT '课程表|李童欢|2018-12-20',
  `ctable_create_by` varchar(36) DEFAULT NULL COMMENT '创建人|李童欢|2018-12-20',
  `ctable_create_time` varchar(25) DEFAULT NULL COMMENT '创建时间|李童欢|2018-12-20',
  `ctable_update_by` varchar(36) DEFAULT NULL COMMENT '更新人|李童欢|2018-12-20',
  `ctable_update_time` varchar(25) DEFAULT NULL COMMENT '更新时间|李童欢|2018-12-20',
  `ctable_course_id` varchar(36) NOT NULL COMMENT '课程id|李童欢|2018-12-20',
  `ctable_class_id` varchar(36) NOT NULL COMMENT '所属班级id|李童欢|2018-12-20',
  `ctable_stu_id` varchar(36) NOT NULL COMMENT '学生id|李童欢|2018-12-20',
  `ctable_week` varchar(25) NOT NULL COMMENT '星期|李童欢|2018-12-20',
  `ctable_teach_id` varchar(36) NOT NULL COMMENT '任课教师id|李童欢|2018-12-20',
  `ctable_start_time` varchar(25) NOT NULL COMMENT '开始时间|李童欢|2018-12-20',
  `ctable_end_time` varchar(25) NOT NULL COMMENT '结束时间|李童欢|2018-12-20',
  `ctable_delete` tinyint(4) DEFAULT NULL COMMENT '是否删除 0:删除 1:不删除 ||李童欢|2018-12-20',
  PRIMARY KEY (`ctable_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='教学管理模块|课程表表|李童欢|2018-12-20';

-- ----------------------------
-- Records of sys_coursetable
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_course_class`
-- ----------------------------
DROP TABLE IF EXISTS `sys_course_class`;
CREATE TABLE `sys_course_class` (
  `cclass_id` varchar(36) NOT NULL COMMENT '主键|李童欢|2018-12-20',
  `cclass_create_by` varchar(36) DEFAULT NULL COMMENT '创建人|李童欢|2018-12-20',
  `cclass_create_time` varchar(36) DEFAULT NULL COMMENT '创建时间|李童欢|2018-12-20',
  `cclass_update_by` varchar(36) DEFAULT NULL COMMENT '更新人|李童欢|2018-12-20',
  `cclass_update_time` varchar(36) DEFAULT NULL COMMENT '更新时间|李童欢|2018-12-20',
  `cclass_cour_id` varchar(36) NOT NULL COMMENT '课程id|李童欢|2018-12-20',
  `cclass_clas_id` varchar(36) NOT NULL COMMENT '班级id|李童欢|2018-12-20',
  `cclass_delete` tinyint(4) DEFAULT NULL COMMENT '是否删除 0:删除 1:不删除 |李童欢|2018-12-20',
  PRIMARY KEY (`cclass_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='教务管理|课程-班级表|李童欢|2018-12-20';

-- ----------------------------
-- Records of sys_course_class
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_course_student`
-- ----------------------------
DROP TABLE IF EXISTS `sys_course_student`;
CREATE TABLE `sys_course_student` (
  `cstudent_id` varchar(36) NOT NULL COMMENT '主键|李童欢|2018-12-20',
  `cstudent_create_by` varchar(36) DEFAULT NULL COMMENT '创建人|李童欢|2018-12-20',
  `cstudent_create_time` varchar(36) DEFAULT NULL COMMENT '创建时间|李童欢|2018-12-20',
  `cstudent_update_by` varchar(36) DEFAULT NULL COMMENT '更新人|李童欢|2018-12-20',
  `cstudent_update_time` varchar(36) DEFAULT NULL COMMENT '更新时间|李童欢|2018-12-20',
  `cstudent_cour_id` varchar(36) NOT NULL COMMENT '课程id|李童欢|2018-12-20',
  `cstudent_stu_id` varchar(36) NOT NULL COMMENT '学生id|李童欢|2018-12-20',
  `cstudent_delete` tinyint(4) DEFAULT NULL COMMENT '是否删除 0:删除 1:不删除 |李童欢|2018-12-20',
  PRIMARY KEY (`cstudent_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='教务管理|课程-学生表|李童欢|2018-12-20';

-- ----------------------------
-- Records of sys_course_student
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_course_teacher`
-- ----------------------------
DROP TABLE IF EXISTS `sys_course_teacher`;
CREATE TABLE `sys_course_teacher` (
  `coteach_id` varchar(36) NOT NULL COMMENT '主键|李童欢|2018-12-20',
  `coteach_create_by` varchar(36) DEFAULT NULL COMMENT '创建人|李童欢|2018-12-20',
  `coteach_create_time` varchar(25) DEFAULT NULL COMMENT '创建时间|李童欢|2018-12-20',
  `coteach_update_by` varchar(36) DEFAULT NULL COMMENT '更新人|李童欢|2018-12-20',
  `coteach_update_time` varchar(25) DEFAULT NULL COMMENT '更新时间|李童欢|2018-12-20',
  `coteach_cour_id` varchar(36) NOT NULL COMMENT '课程id|李童欢|2018-12-20',
  `coteach_teach_id` varchar(36) NOT NULL COMMENT '教师id|李童欢|2018-12-20',
  `coteach_delete` tinyint(4) DEFAULT NULL COMMENT '是否删除 0:删除 1:不删除 |李童欢|2018-12-20',
  PRIMARY KEY (`coteach_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='教务管理|课程-教师表|李童欢|2018-12-20';

-- ----------------------------
-- Records of sys_course_teacher
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_examinationhall_info`
-- ----------------------------
DROP TABLE IF EXISTS `sys_examinationhall_info`;
CREATE TABLE `sys_examinationhall_info` (
  `exinfo_id` varchar(36) NOT NULL COMMENT '考场信息id|李童欢|2018-12-20',
  `exinfo_create_by` varchar(25) DEFAULT NULL COMMENT '创建时间|李童欢|2018-12-20',
  `exinfo_create_time` varchar(36) DEFAULT NULL COMMENT '创建人|李童欢|2018-12-20',
  `exinfo_update_by` varchar(36) DEFAULT NULL COMMENT '更新人|李童欢|2018-12-20',
  `exinfo_update_time` varchar(25) DEFAULT NULL COMMENT '更新时间|李童欢|2018-12-20',
  `exinfo_stu_id` varchar(36) NOT NULL COMMENT '学生id|李童欢|2018-12-20',
  `exinfo_stu_name` varchar(25) NOT NULL COMMENT '学生姓名|李童欢|2018-12-20',
  `exinfo_test_info_id` varchar(36) NOT NULL COMMENT '考试信息id|李童欢|2018-12-20',
  `exinfo_seat` int(11) NOT NULL COMMENT '座位号|李童欢|2018-12-20',
  `exinfo_delete` tinyint(4) DEFAULT NULL COMMENT '是否删除 0:删除 1:不删除 |李童欢|2018-12-20',
  PRIMARY KEY (`exinfo_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='教学管理|考场信息|李童欢|2018-12-20';

-- ----------------------------
-- Records of sys_examinationhall_info
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_follow`
-- ----------------------------
DROP TABLE IF EXISTS `sys_follow`;
CREATE TABLE `sys_follow` (
  `follow_id` varchar(36) NOT NULL COMMENT '主键|李童欢|2018-12-20',
  `follow_create_by` varchar(36) DEFAULT NULL COMMENT '创建人|李童欢|2018-12-20',
  `follow_create_time` varchar(25) DEFAULT NULL COMMENT '创建时间|李童欢|2018-12-20',
  `follow_update_by` varchar(36) DEFAULT NULL COMMENT '更新人|李童欢|2018-12-20',
  `follow_update_time` varchar(25) DEFAULT NULL COMMENT '更新时间|李童欢|2018-12-20',
  `follow_user_id` varchar(36) NOT NULL COMMENT '用户id|李童欢|2018-12-20',
  `follow_target_user_id` varchar(36) NOT NULL COMMENT '关注用户id|李童欢|2018-12-20',
  `follow_delete` tinyint(4) DEFAULT NULL COMMENT '是否删除 0:删除 1:不删除 |李童欢|2018-12-20',
  PRIMARY KEY (`follow_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户|关注表|李童欢|2018-12-20';

-- ----------------------------
-- Records of sys_follow
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_friend`
-- ----------------------------
DROP TABLE IF EXISTS `sys_friend`;
CREATE TABLE `sys_friend` (
  `friend_id` varchar(36) NOT NULL COMMENT '主键|李童欢|2018-12-20',
  `friend_create_by` varchar(36) DEFAULT NULL COMMENT '创建人|李童欢|2018-12-20',
  `friend_create_time` varchar(25) DEFAULT NULL COMMENT '创建时间|李童欢|2018-12-20',
  `friend_update_by` varchar(36) DEFAULT NULL COMMENT '更新人|李童欢|2018-12-20',
  `friend_update_time` varchar(25) DEFAULT NULL COMMENT '更新时间|李童欢|2018-12-20',
  `friend_user_id` varchar(36) NOT NULL COMMENT '用户id|李童欢|2018-12-20',
  `friend_target_user_id` varchar(36) NOT NULL COMMENT '好友id|李童欢|2018-12-20',
  `friend_state` tinyint(4) NOT NULL COMMENT '状态 0:非好友 1 好友|李童欢|2018-12-20',
  `friend_delete` tinyint(4) DEFAULT NULL COMMENT '是否删除 0:删除 1:不删除 |李童欢|2018-12-20',
  PRIMARY KEY (`friend_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户|好友表|李童欢|2018-12-20';

-- ----------------------------
-- Records of sys_friend
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_items`
-- ----------------------------
DROP TABLE IF EXISTS `sys_items`;
CREATE TABLE `sys_items` (
  `item_id` varchar(36) NOT NULL COMMENT '学期时间id|李童欢|2018-12-20',
  `item_create_by` varchar(25) NOT NULL COMMENT '创建人|李童欢|2018-12-20',
  `item_create_time` varchar(25) NOT NULL COMMENT '创建时间|李童欢|2018-12-20',
  `item_update_by` varchar(25) NOT NULL COMMENT '更新人|李童欢|2018-12-20',
  `item_update_time` varchar(25) NOT NULL COMMENT '更新时间|李童欢|2018-12-20',
  `item_name` varchar(36) NOT NULL COMMENT '学期名称|李童欢|2018-12-20',
  `item_start_time` varchar(25) DEFAULT NULL COMMENT '学期开始时间|李童欢|2018-12-20',
  `item_end_time` varchar(25) DEFAULT NULL COMMENT '学期结束时间|李童欢|2018-12-20',
  `item_state` tinyint(4) NOT NULL COMMENT '学期状态 0:在线 1不在线|李童欢|2018-12-20',
  `item_delete` tinyint(4) DEFAULT NULL COMMENT '是否删除 0:删除 1:不删除 ||李童欢|2018-12-20'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='教学模块|学期时间表|李童欢|2018-12-20';

-- ----------------------------
-- Records of sys_items
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_job`
-- ----------------------------
DROP TABLE IF EXISTS `sys_job`;
CREATE TABLE `sys_job` (
  `job_id` varchar(36) NOT NULL COMMENT '职务id|李童欢|2018-12-20',
  `job_create_by` varchar(36) DEFAULT NULL COMMENT '创建人|李童欢|2018-12-20',
  `job_create_time` varchar(25) DEFAULT NULL COMMENT '创建时间|李童欢|2018-12-20',
  `job_update_by` varchar(36) DEFAULT NULL COMMENT '更新人|李童欢|2018-12-20',
  `job_update_time` varchar(25) DEFAULT NULL COMMENT '更新时间|李童欢|2018-12-20',
  `job_teach_id` varchar(36) NOT NULL COMMENT '教师id|李童欢|2018-12-20',
  `job_aca_id` varchar(36) NOT NULL COMMENT '所属学院id|李童欢|2018-12-20',
  `job_job` varchar(50) NOT NULL COMMENT '职务|李童欢|2018-12-20',
  `job_aca_name` varchar(36) NOT NULL COMMENT '学院名称|李童欢|2018-12-20',
  `job_delete` tinyint(4) DEFAULT NULL COMMENT '是否删除 0:删除 1:不删除 ||李童欢|2018-12-20',
  PRIMARY KEY (`job_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='基本模块|职务|李童欢|2018-12-20';

-- ----------------------------
-- Records of sys_job
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_major`
-- ----------------------------
DROP TABLE IF EXISTS `sys_major`;
CREATE TABLE `sys_major` (
  `major_id` varchar(36) NOT NULL COMMENT '专业id|李童欢|2018-12-20',
  `major_create_by` varchar(36) DEFAULT NULL COMMENT '创建人|李童欢|2018-12-20',
  `major_create_time` varchar(25) DEFAULT NULL COMMENT '创建时间|李童欢|2018-12-20',
  `major_update_by` varchar(36) DEFAULT NULL COMMENT '更新人|李童欢|2018-12-20',
  `major_update_time` varchar(25) DEFAULT NULL COMMENT '更新时间|李童欢|2018-12-20',
  `major_name` varchar(50) NOT NULL COMMENT '专业名称|李童欢|2018-12-20',
  `major_aca_id` varchar(36) NOT NULL COMMENT '所属学院id|李童欢|2018-12-20',
  `major_delete` tinyint(4) DEFAULT NULL COMMENT '是否删除 0:删除 1:不删除 ||李童欢|2018-12-20',
  PRIMARY KEY (`major_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='基本模块|专业|李童欢|2018-12-20';

-- ----------------------------
-- Records of sys_major
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_power`
-- ----------------------------
DROP TABLE IF EXISTS `sys_power`;
CREATE TABLE `sys_power` (
  `power_id` varchar(36) NOT NULL COMMENT '主键|李童欢|2018-12-20',
  `power_create_by` varchar(36) DEFAULT NULL COMMENT '创建人|李童欢|2018-12-20',
  `power_create_time` varchar(25) DEFAULT NULL COMMENT '创建时间|李童欢|2018-12-20',
  `power_update_by` varchar(36) DEFAULT NULL COMMENT '更新人|李童欢|2018-12-20',
  `power_update_time` varchar(25) DEFAULT NULL COMMENT '更新时间|李童欢|2018-12-20',
  `power_name` varchar(50) NOT NULL COMMENT '权限级别||李童欢|2018-12-20',
  `power_delete` tinyint(4) DEFAULT NULL COMMENT '是否删除 0:删除 1:不删除 |李童欢|2018-12-20',
  PRIMARY KEY (`power_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户|权限表|李童欢|2018-12-20';

-- ----------------------------
-- Records of sys_power
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_resource`
-- ----------------------------
DROP TABLE IF EXISTS `sys_resource`;
CREATE TABLE `sys_resource` (
  `resource_id` varchar(36) NOT NULL COMMENT 'ID',
  `resource_create_by` varchar(36) DEFAULT NULL COMMENT '创建人|李童欢|2018-12-20',
  `resource_create_time` varchar(25) DEFAULT NULL COMMENT '创建时间、发表日期|李童欢|2018-12-20',
  `resource_update_by` varchar(36) DEFAULT NULL COMMENT '更新人|李童欢|2018-12-20',
  `resource_update_time` varchar(25) DEFAULT NULL COMMENT '更新时间、修改日期|李童欢|2018-12-20',
  `resource_column_id` varchar(36) DEFAULT NULL COMMENT '专栏ID|李童欢|2018-12-20',
  `resource_user_id` varchar(36) DEFAULT NULL COMMENT '用户ID|李童欢|2018-12-20',
  `resource_title` varchar(100) DEFAULT NULL COMMENT '标题|李童欢|2018-12-20',
  `resource_content` mediumtext COMMENT '文章正文|李童欢|2018-12-20',
  `resource_image` varchar(100) DEFAULT NULL COMMENT '文章封面|李童欢|2018-12-20',
  `resource_ispublic` varchar(1) DEFAULT NULL COMMENT '是否公开|李童欢|2018-12-20',
  `resource_istop` varchar(1) DEFAULT NULL COMMENT '是否置顶|李童欢|2018-12-20',
  `resource_visits` int(20) DEFAULT NULL COMMENT '浏览量|李童欢|2018-12-20',
  `resource_thumbup` int(20) DEFAULT NULL COMMENT '点赞数|李童欢|2018-12-20',
  `resource_comment` int(20) DEFAULT NULL COMMENT '评论数|李童欢|2018-12-20',
  `resource_state` varchar(1) DEFAULT NULL COMMENT '审核状态|李童欢|2018-12-20',
  `resource_channel_id` varchar(36) DEFAULT NULL COMMENT '所属频道|李童欢|2018-12-20',
  `resource_url` varchar(100) DEFAULT NULL COMMENT 'URL|李童欢|2018-12-20',
  `resource_type` varchar(1) DEFAULT NULL COMMENT '类型|李童欢|2018-12-20',
  `resource_delete` tinyint(4) DEFAULT NULL COMMENT '是否删除 0:删除 1:不删除 |李童欢|2018-12-20',
  PRIMARY KEY (`resource_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='文章';

-- ----------------------------
-- Records of sys_resource
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_role`
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `role_id` varchar(36) NOT NULL COMMENT '主键|李童欢|2018-12-20',
  `role_create_by` varchar(36) DEFAULT NULL COMMENT '创建人|李童欢|2018-12-20',
  `role_create_time` varchar(25) DEFAULT NULL COMMENT '创建时间|李童欢|2018-12-20',
  `role_update_by` varchar(36) DEFAULT NULL COMMENT '更新人|李童欢|2018-12-20',
  `role_update_time` varchar(25) DEFAULT NULL COMMENT '更新时间|李童欢|2018-12-20',
  `role_role` varchar(50) NOT NULL COMMENT '角色||李童欢|2018-12-20',
  `role_delete` tinyint(4) DEFAULT NULL COMMENT '是否删除 0:删除 1:不删除 |李童欢|2018-12-20',
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户|角色表|李童欢|2018-12-20';

-- ----------------------------
-- Records of sys_role
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_role_power`
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_power`;
CREATE TABLE `sys_role_power` (
  `rpower_id` varchar(36) NOT NULL COMMENT '主键|李童欢|2018-12-20',
  `rpower_create_by` varchar(36) DEFAULT NULL COMMENT '创建人|李童欢|2018-12-20',
  `rpower_create_time` varchar(25) DEFAULT NULL COMMENT '创建时间|李童欢|2018-12-20',
  `rpower_update_by` varchar(36) DEFAULT NULL COMMENT '更新人|李童欢|2018-12-20',
  `rpower_update_time` varchar(25) DEFAULT NULL COMMENT '更新时间|李童欢|2018-12-20',
  `rpower_power_id` varchar(36) NOT NULL COMMENT '权限id|李童欢|2018-12-20',
  `rpower_role_id` varchar(36) NOT NULL COMMENT '角色id|李童欢|2018-12-20',
  `rpower_delete` tinyint(4) DEFAULT NULL COMMENT '是否删除 0:删除 1:不删除 |李童欢|2018-12-20',
  PRIMARY KEY (`rpower_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户|角色-权限表|李童欢|2018-12-20';

-- ----------------------------
-- Records of sys_role_power
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_score`
-- ----------------------------
DROP TABLE IF EXISTS `sys_score`;
CREATE TABLE `sys_score` (
  `score_id` varchar(36) NOT NULL COMMENT '成绩id|李童欢|2018-12-20',
  `score_create_by` char(10) DEFAULT NULL COMMENT '创建人|李童欢|2018-12-20',
  `score_create_name` char(10) DEFAULT NULL COMMENT '创建时间|李童欢|2018-12-20',
  `score_update_by` char(10) DEFAULT NULL COMMENT '更新人|李童欢|2018-12-20',
  `score_update_time` char(10) DEFAULT NULL COMMENT '更新时间|李童欢|2018-12-20',
  `score_stu_id` varchar(36) NOT NULL COMMENT '|李童欢|2018-12-20',
  `score_cour_id` varchar(36) NOT NULL COMMENT '|李童欢|2018-12-20',
  `score_pea_grade` int(11) NOT NULL COMMENT '|李童欢|2018-12-20',
  `score_pnd_grade` int(11) NOT NULL COMMENT '|李童欢|2018-12-20',
  `score_syn_grade` int(11) NOT NULL COMMENT '|李童欢|2018-12-20',
  `score_state` tinyint(4) NOT NULL COMMENT '是否挂科 0:挂科 1:没挂科 ||李童欢|2018-12-20',
  `score_delete` tinyint(4) DEFAULT NULL COMMENT '是否删除 0:删除 1:不删除 ||李童欢|2018-12-20'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='选课成绩|李童欢|2018-12-20';

-- ----------------------------
-- Records of sys_score
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_student`
-- ----------------------------
DROP TABLE IF EXISTS `sys_student`;
CREATE TABLE `sys_student` (
  `stu_id` varchar(36) NOT NULL COMMENT 'id||李童欢|2018-12-20',
  `stu_create_by` varchar(36) DEFAULT NULL COMMENT '创建人|李童欢|2018-12-20',
  `stu_create_time` varchar(25) DEFAULT NULL COMMENT '创建时间|李童欢|2018-12-20',
  `stu_update_time` varchar(25) DEFAULT NULL COMMENT '更新时间|李童欢|2018-12-20',
  `stu_update_by` varchar(36) DEFAULT NULL COMMENT '更新人|李童欢|2018-12-20',
  `stu_name` varchar(50) NOT NULL COMMENT '名字|李童欢|2018-12-20',
  `stu_number` bigint(20) NOT NULL COMMENT '学号|李童欢|2018-12-20',
  `stu_sex` tinyint(4) NOT NULL COMMENT '记录性别 0:男 1:女 2:保密 |李童欢||2018-12-20',
  `stu_moblie` bigint(20) NOT NULL COMMENT '手机号|李童欢|2018-12-20',
  `stu_nation` varchar(50) NOT NULL COMMENT '民族|李童欢|2018-12-20',
  `stu_birthday` varchar(25) NOT NULL COMMENT '出生日期|李童欢|2018-12-20',
  `stu_aca_id` varchar(36) NOT NULL COMMENT '学院|李童欢|2018-12-20',
  `stu_admission_time` varchar(25) NOT NULL COMMENT '入校时间|李童欢|2018-12-20',
  `stu_departure_time` varchar(25) NOT NULL COMMENT '离校时间|李童欢|2018-12-20',
  `stu_class_id` varchar(36) NOT NULL COMMENT '班级id|李童欢|2018-12-20',
  `stu_major_id` varchar(36) NOT NULL COMMENT '专业|李童欢|2018-12-20',
  `stu_identity` varchar(20) NOT NULL COMMENT '省份证|李童欢|2018-12-20',
  `stu_delete` tinyint(4) DEFAULT NULL COMMENT '是否删除 0:删除 1:不删除 ||李童欢|2018-12-20',
  PRIMARY KEY (`stu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='基本信息|学生信息|李童欢|2018-12-20';

-- ----------------------------
-- Records of sys_student
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_teacher`
-- ----------------------------
DROP TABLE IF EXISTS `sys_teacher`;
CREATE TABLE `sys_teacher` (
  `teach_id` varchar(36) NOT NULL COMMENT '教师Id|李童欢|2018-12-20',
  `teach_create_by` varbinary(36) DEFAULT NULL COMMENT '创建人|李童欢|2018-12-20',
  `teach_create_time` varchar(25) DEFAULT NULL COMMENT '创建时间|李童欢|2018-12-20',
  `teach_update_by` varchar(36) DEFAULT NULL COMMENT '更新人|李童欢|2018-12-20',
  `teach_update_time` varchar(25) DEFAULT NULL COMMENT '更新时间|李童欢|2018-12-20',
  `teach_name` varchar(50) NOT NULL COMMENT '名字|李童欢|2018-12-20',
  `teach_sex` tinyint(4) NOT NULL COMMENT '记录性别 0:男 1:女 2:保密 |李童欢||2018-12-20',
  `teach_mobile` bigint(20) NOT NULL COMMENT '手机号|李童欢|2018-12-20',
  `teach_aca_id` varchar(36) NOT NULL COMMENT '学院id|李童欢|2018-12-20',
  `teach_email` varchar(32) NOT NULL COMMENT '邮箱|李童欢|2018-12-20',
  `teach_nation` varchar(50) NOT NULL COMMENT '民族|李童欢|2018-12-20',
  `teach_birthday` varchar(25) NOT NULL COMMENT '生日|李童欢|2018-12-20',
  `teach_admission_time` varchar(25) NOT NULL COMMENT '入职时间|李童欢|2018-12-20',
  `teach_identity` varchar(20) NOT NULL COMMENT '身份证|李童欢|2018-12-20',
  `teach_positional` varchar(36) NOT NULL COMMENT '职称|李童欢|2018-12-20',
  `teach_office` varchar(32) NOT NULL COMMENT '办公地点||李童欢|2018-12-20',
  `teach_delete` tinyint(4) DEFAULT NULL COMMENT '是否删除 0:删除 1:不删除 ||李童欢|2018-12-20',
  PRIMARY KEY (`teach_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='基本模块|教师信息表||李童欢|2018-12-20';

-- ----------------------------
-- Records of sys_teacher
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_attence_info`
-- ----------------------------
DROP TABLE IF EXISTS `sys_attence_info`;
CREATE TABLE `sys_attence_info` (
  `attence_info_id` varchar(36) NOT NULL COMMENT '考勤信息id李童欢|2018-12-20',
  `attence_info_create_by` varchar(36) DEFAULT NULL COMMENT '创建人|李童欢|2018-12-20',
  `attence_info_create_time` varchar(25) DEFAULT NULL COMMENT '创建时间|李童欢|2018-12-20',
  `attence_info_update_by` varchar(36) DEFAULT NULL COMMENT '更新人|李童欢|2018-12-20',
  `attence_info_update_time` varchar(25) DEFAULT NULL COMMENT '更新时间李童欢|2018-12-20',
  `attence_info_cour_id` varchar(36) NOT NULL COMMENT '考勤课程id|李童欢|2018-12-20',
  `attence_info_stu_id` varchar(36) NOT NULL COMMENT '考勤学生id|李童欢|2018-12-20',
  `attence_info_time` varchar(25) NOT NULL COMMENT '考勤时间|李童欢|2018-12-20',
  `attence_info_flag` tinyint(4) NOT NULL COMMENT '考勤状态:缺课 请假 |李童欢|2018-12-20',
  `attence_info_delete` tinyint(4) DEFAULT NULL COMMENT '是否删除 0:删除 1:不删除 |李童欢|2018-12-20',
  PRIMARY KEY (`attence_info_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='教务管理|考勤信息表|李童欢|2018-12-20';

-- ----------------------------
-- Records of sys_attence_info
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_teach_evaluation`
-- ----------------------------
DROP TABLE IF EXISTS `sys_teach_evaluation`;
CREATE TABLE `sys_teach_evaluation` (
  `eval_id` varchar(36) NOT NULL COMMENT '教学考评id|李童欢|2018-12-20',
  `eval_creaeval_by` varchar(36) DEFAULT NULL COMMENT '创建人|李童欢|2018-12-20',
  `eval_creaeval_time` varchar(25) DEFAULT NULL COMMENT '创建时间|李童欢|2018-12-20',
  `eval_updaeval_by` varchar(36) DEFAULT NULL COMMENT '更新人|李童欢|2018-12-20',
  `eval_updaeval_time` varchar(25) DEFAULT NULL COMMENT '更新时间|李童欢|2018-12-20',
  `eval_cour_id` varchar(36) NOT NULL COMMENT '课程id|李童欢|2018-12-20',
  `eval_cour_name` varchar(36) NOT NULL COMMENT '课程名|李童欢|2018-12-20',
  `eval_teach_id` varchar(36) NOT NULL COMMENT '教师id|李童欢|2018-12-20',
  `eval_teach_name` varchar(36) NOT NULL COMMENT '教师名|李童欢|2018-12-20',
  `eval_please` int(11) NOT NULL COMMENT '满意度|李童欢|2018-12-20',
  `eval_flag` tinyint(4) NOT NULL COMMENT '是否点评,0:点评 1未点评|李童欢|2018-12-20',
  `eval_delete` tinyint(4) DEFAULT NULL COMMENT '是否删除 0:删除 1:不删除|李童欢|2018-12-20',
  PRIMARY KEY (`eval_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='教务管理|教学考评表|李童欢|2018-12-20';

-- ----------------------------
-- Records of sys_teach_evaluation
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_testinfo`
-- ----------------------------
DROP TABLE IF EXISTS `sys_test_info`;
CREATE TABLE `sys_test_info` (
  `test_info_id` varchar(36) NOT NULL COMMENT '考试信息id|李童欢|2018-12-20',
  `test_info_create_by` varchar(36) DEFAULT NULL COMMENT '创建人|李童欢|2018-12-20',
  `test_info_create_time` varchar(25) DEFAULT NULL COMMENT '创建时间|李童欢|2018-12-20',
  `test_info_update_by` varchar(36) DEFAULT NULL COMMENT '更新人|李童欢|2018-12-20',
  `test_info_update_time` varchar(25) DEFAULT NULL COMMENT '更新时间|李童欢|2018-12-20',
  `test_info_cour_id` varchar(36) NOT NULL COMMENT '考试课程id|李童欢|2018-12-20',
  `test_info_cour_name` varchar(50) NOT NULL COMMENT '考试课程名|李童欢|2018-12-20',
  `test_info_start_time` varchar(25) NOT NULL COMMENT '开始时间|李童欢|2018-12-20',
  `test_info_end_time` varchar(25) NOT NULL COMMENT '结束时间|李童欢|2018-12-20',
  `test_info_cr_id` varchar(36) NOT NULL COMMENT '教室id|李童欢|2018-12-20',
  `test_info_delete` tinyint(4) DEFAULT NULL COMMENT '是否删除 0:删除 1:不删除 |李童欢|2018-12-20',
  PRIMARY KEY (`test_info_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='教学管理|考试信息|李童欢|2018-12-20';

-- ----------------------------
-- Records of sys_testinfo
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_user`
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `user_id` varchar(36) NOT NULL COMMENT '主键|李童欢|2018-12-20',
  `user_create_by` varchar(25) DEFAULT NULL COMMENT '创建人|李童欢|2018-12-20',
  `user_create_time` varchar(25) DEFAULT NULL COMMENT '创建时间|李童欢|2018-12-20',
  `user_update_by` varchar(25) DEFAULT NULL COMMENT '更新人|李童欢|2018-12-20',
  `user_update_time` varchar(25) DEFAULT NULL COMMENT '更新时间|李童欢|2018-12-20',
  `user_school_id` varchar(36) NOT NULL COMMENT '学校id|李童欢|2018-12-20',
  `user_wxid` varchar(100) NOT NULL COMMENT '微信Id|李童欢|2018-12-20',
  `user_accout` varchar(20) NOT NULL COMMENT '账号|李童欢|2018-12-20',
  `user_password` varchar(20) NOT NULL COMMENT '密码|李童欢|2018-12-20',
  `user_role_id` varchar(36) NOT NULL COMMENT '角色id|李童欢|2018-12-20',
  `user_nickname` varchar(50) NOT NULL COMMENT '昵称|李童欢|2018-12-20',
  `user_sex` tinyint(4) NOT NULL COMMENT '性别 0 : 男 1 女|李童欢|2018-12-20',
  `user_interest` varchar(100) NOT NULL COMMENT '兴趣|李童欢|2018-12-20',
  `user_fans_count` int(11) NOT NULL COMMENT '粉丝数|李童欢|2018-12-20',
  `user_follow_count` int(11) NOT NULL COMMENT '关注数|李童欢|2018-12-20',
  `user_regdate` varchar(25) NOT NULL COMMENT '注册时间|李童欢|2018-12-20',
  `user_delete` tinyint(4) DEFAULT NULL COMMENT '是否删除 0:删除 1:不删除 |李童欢|2018-12-20',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户模块|用户表|李童欢|2018-12-20';

-- ----------------------------
-- Records of sys_user
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_user_role`
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role` (
  `urole_id` varchar(36) NOT NULL COMMENT '主键|李童欢|2018-12-20',
  `urole_create_by` varchar(36) DEFAULT NULL COMMENT '创建人|李童欢|2018-12-20',
  `urole_create_time` varchar(25) DEFAULT NULL COMMENT '创建时间|李童欢|2018-12-20',
  `urole_update_by` varchar(36) DEFAULT NULL COMMENT '更新人|李童欢|2018-12-20',
  `urole_update_time` varchar(25) DEFAULT NULL COMMENT '更新时间|李童欢|2018-12-20',
  `urole_user_id` varchar(36) NOT NULL COMMENT '用户id|李童欢|2018-12-20',
  `urole_role_id` varchar(36) DEFAULT NULL COMMENT '角色id|李童欢|2018-12-20',
  `urole_delete` tinyint(4) DEFAULT NULL COMMENT '是否删除 0:删除 1:不删除 |李童欢|2018-12-20',
  PRIMARY KEY (`urole_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户|用户-角色表|李童欢|2018-12-20';

-- ----------------------------
-- Records of sys_user_role
-- ----------------------------

drop table if exists sys_school;

/*==============================================================*/
/* Table: sys_school                                            */
/*==============================================================*/
create table sys_school
(
   school_id            varchar(36) not null comment '学校Id|李童欢|2018-12-20',
   school_create_by     varchar(36) comment '创建人|李童欢|2018-12-20',
   school_create_time   varchar(25) comment '创建时间|李童欢|2018-12-20',
   school_update_by     varchar(36) comment '更新人|李童欢|2018-12-20',
   school_update_time   varchar(25) not null comment '更新时间|李童欢|2018-12-20',
   school_name          varchar(50) NOT NULL COMMENT '名称|李童欢|2018-12-20',
   school_address       mediumtext not null comment '地址|李童欢|2018-12-20',
   school_province      varchar(50) not null comment '省份|李童欢|2018-12-20',
   school_city          varchar(50) not null comment '城市|李童欢|2018-12-20',
   school_delete        tinyint comment '是否删除 0:删除 1 不删除|李童欢|2018-12-20',
   
   primary key (school_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='基本信息|学校表|李童欢|2018-12-20';
