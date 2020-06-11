package com.ljs.dao;

import com.ljs.entity.Student;
import com.ljs.entity.StudentDemo;
import org.apache.ibatis.annotations.Param;


import java.util.List;

/**
 * create by ljs on 2020/6/10 22:34
 * <p>
 * description:
 *  主要演示 动态sql
 */
public interface StudentMapper {


    // <if test = " 表达式 " >
    List<Student> findStudentByIf(String name);

    // 使用where  + if
    List<Student> findStudentByObject(@Param("student") Student student);

    // 使用where + if + 不指定参数名
    List<Student> findStudentByObject1(Student student);

    // foreach
    List<Student> findStudentByIds(@Param("ids") List<Integer> ids );


    // foreach 不指定参数名，传递List类型参数
    List<Student> findStudentByIds01(List<Integer> ids);

    // foreach 传递数组 array
    List<Student> findStudentByIds02(int []arr);

    // 返回StudentDemo, 表的列名和属性名不一样。
    List<StudentDemo> getStudentDemo();

}
