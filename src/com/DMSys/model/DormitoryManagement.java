package com.DMSys.model;

import java.util.Date;

public class DormitoryManagement {
    // 宿舍管理记录的唯一标识
    private int id;
    // 管理的宿舍的ID
    private int dormitoryId;
    // 检查日期
    private Date inspectionDate;
    // 卫生情况
    private String hygieneCondition;
    // 寝室长
    private String dormitoryLeader;

    // 无参构造函数
    public DormitoryManagement() {
    }

    @Override
    public String toString() {
        return "DormitoryManagement{" +
                "id=" + id +
                ", dormitoryId=" + dormitoryId +
                ", inspectionDate=" + inspectionDate +
                ", hygieneCondition='" + hygieneCondition + '\'' +
                ", dormitoryLeader='" + dormitoryLeader + '\'' +
                '}';
    }

    // Getter和Setter方法
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDormitoryId() {
        return dormitoryId;
    }

    public void setDormitoryId(int dormitoryId) {
        this.dormitoryId = dormitoryId;
    }

    public Date getInspectionDate() {
        return inspectionDate;
    }

    public void setInspectionDate(Date inspectionDate) {
        this.inspectionDate = inspectionDate;
    }

    public String getHygieneCondition() {
        return hygieneCondition;
    }

    public void setHygieneCondition(String hygieneCondition) {
        this.hygieneCondition = hygieneCondition;
    }

    public String getDormitoryLeader() {
        return dormitoryLeader;
    }

    public void setDormitoryLeader(String dormitoryLeader) {
        this.dormitoryLeader = dormitoryLeader;
    }
}