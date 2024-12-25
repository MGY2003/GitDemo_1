package com.DMSys.service.impl;

import com.DMSys.mapper.StudentMapper;
import com.DMSys.model.Student;
import com.DMSys.until.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class StudentServiceImpl {

    @Override
    public List<Student> getAllStudent() {
        // 获取mybatis 数据库会话对象
        SqlSession sqlSession = MybatisUtil.openSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = studentMapper.getAllStudents();
        // 提交事务
        sqlSession.commit();;
        sqlSession.close();
        return studentList;
    }

    @Override
    public int addStudent(Student student) {
        SqlSession sqlSession = MybatisUtil.openSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        int result = studentMapper.addStudent(student);
        // 提交事务
        sqlSession.commit();
        sqlSession.close();
        return result;
    }
}
