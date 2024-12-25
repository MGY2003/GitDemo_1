package com.DMSys.model;

public class Student {
    // 学生的唯一标识
    private int id;
    // 学生姓名
    private String name;
    // 学生年龄
    private int age;
    // 学生性别，取值为 'M' 或 'F'
    private String gender;
    // 学生所在宿舍的ID
    private int dormitoryId;

    // 无参构造函数，用于对象的初始化
    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", dormitoryId=" + dormitoryId +
                '}';
    }

    // Getter和Setter方法，用于获取和设置对象的属性
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getDormitoryId() {
        return dormitoryId;
    }

    public void setDormitoryId(int dormitoryId) {
        this.dormitoryId = dormitoryId;
    }
}