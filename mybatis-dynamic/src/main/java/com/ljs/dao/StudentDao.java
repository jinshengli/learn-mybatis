package com.ljs.dao;


import com.ljs.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * create by ljs on 2020/6/9 8:55
 */
public interface StudentDao {

    List<Student> findAllStudent(String name);

    Student findStudentById(Integer id);

    int insertStudent(Student student);

    int updateStudent(Student student);

    int deleteStudent(Integer id);

    // 以下为了测试传参的情况

    // 声明参数类型
    List<Student> findStudentByIdOrName(@Param("id") Integer id, @Param("name") String name);
    // 不声明，在映射文件中 需要指定参数顺序。 #{arg0}, #{arg1}
    List<Student> findStudentByNameOrAge(String name, Integer age);
    // 传递map, key需要明确。
    List<Student> findStudentByMap(Map<String, Object> map);

}
