package com.ljs;

import com.ljs.dao.StudentDao;
import com.ljs.entity.Student;
import com.ljs.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * create by ljs on 2020/6/9 17:41
 * <p>
 * description:
 */


public class StudentTest {


    @Test
    public void findAllStudent(){

        SqlSession sqlSession = MybatisUtil.getSqlSession();

        StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
        List<Student> list = studentDao.findAllStudent();

        for (Student student : list) {
            System.out.println(student);
        }

    }


    @Test
    public void findStudentById(){

        SqlSession sqlSession = MybatisUtil.getSqlSession();

        StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
        Student student = studentDao.findStudentById(1);

        System.out.println(student);
        sqlSession.close();
    }


    @Test
    public void insertStudent(){

        SqlSession sqlSession = MybatisUtil.getSqlSession();
        StudentDao studentDao = sqlSession.getMapper(StudentDao.class);

        Student student = new Student();
        student.setName("成渝");
        student.setAge(24);

        studentDao.insertStudent(student);

        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void updateStudent() {

        SqlSession sqlSession = MybatisUtil.getSqlSession();
        StudentDao studentDao = sqlSession.getMapper(StudentDao.class);

        Student student = new Student();
        student.setId(1);
        student.setName("666魔鬼");
        student.setAge(12);

        studentDao.updateStudent(student);

        sqlSession.commit();
        sqlSession.close();

    }


    @Test
    public void deleteStudent(){

        SqlSession sqlSession = MybatisUtil.getSqlSession();
        StudentDao studentDao = sqlSession.getMapper(StudentDao.class);

        studentDao.deleteStudent(6);

        sqlSession.commit();
        sqlSession.close();

    }




}
