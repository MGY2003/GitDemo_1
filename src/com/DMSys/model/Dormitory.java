package com.DMSys.model;

public class Dormitory {
    // 宿舍的唯一标识
    private int id;
    // 宿舍号
    private String dormitoryNumber;
    // 宿舍所在的楼名
    private String buildingName;

    // 无参构造函数
    public Dormitory() {
    }

    @Override
    public String toString() {
        return "Dormitory{" +
                "id=" + id +
                ", dormitoryNumber='" + dormitoryNumber + '\'' +
                ", buildingName='" + buildingName + '\'' +
                '}';
    }

    // Getter和Setter方法
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDormitoryNumber() {
        return dormitoryNumber;
    }

    public void setDormitoryNumber(String dormitoryNumber) {
        this.dormitoryNumber = dormitoryNumber;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }
}