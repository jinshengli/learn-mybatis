package com.ljs.dao;


import com.ljs.entity.Student;

import java.util.List;

/**
 * create by ljs on 2020/6/9 8:55
 */
public interface StudentDao {

    List<Student> findAllStudent();

    Student findStudentById(Integer id);

    int insertStudent(Student student);

    int updateStudent(Student student);

    int deleteStudent(Integer id);

}
