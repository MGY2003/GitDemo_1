package com.DMSys.mapper;

import com.DMSys.model.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface StudentMapper {
    // 添加学生
    public int addStudent(Student student);
    // 删除学生
    public int delStudent(@Param("studentId")int studentId, @Param("studentName")String studentName);
    // 更新学生
    public int updateStudent(Map<String, Object> studentMap);
    // 查询所有学生
    public List<Student> getAllStudents();
    // 根据id查询学生
    public List<Student> getStudentById(Student student);
}