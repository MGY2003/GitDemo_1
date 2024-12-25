package com.DMSys.test;

import com.DMSys.mapper.StudentMapper;
import com.DMSys.model.Student;
import org.apache.ibatis.session.SqlSession;

public class StudentTest {
    private static SqlSession sqlSession = com.beiyou.util.MybatisUtil.openSession();
    public static void main(String[] args) {
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

//        // 查询
//        List<Student> studentList = studentMapper.getAllStudents();
//        for(Student student:studentList){
//            System.out.println(student.toString());
//        }

        // 添加
        Student student = new Student();
        student.setName("周森");
        student.setAge(2);
        student.setGender("2");
        student.setDormitoryId(2);
        int result = studentMapper.addStudent(student);
        sqlSession.commit();
        if(result > 0){
            System.out.println("添加成功！");
        }
    }
}
