package com.ljs;

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
        String sql = "com.ljs.dao.StudentDao.findAllStudent";

        List<Student> list = sqlSession.selectList(sql);

        for (Student student : list) {
            System.out.println(student);
        }

    }


    @Test
    public void findStudentById(){

        SqlSession sqlSession = MybatisUtil.getSqlSession();
        String sql = "com.ljs.dao.StudentDao.findStudentById";

        Student student = sqlSession.selectOne(sql, 1);
        System.out.println(student);
        sqlSession.close();
    }


    @Test
    public void insertStudent(){

        SqlSession sqlSession = MybatisUtil.getSqlSession();
        String sql = "com.ljs.dao.StudentDao.insertStudent";

        Student student = new Student();
        student.setName("成渝");
        student.setAge(24);
        sqlSession.insert(sql, student);

        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void updateStudent() {

        SqlSession sqlSession = MybatisUtil.getSqlSession();
        String sql = "com.ljs.dao.StudentDao.updateStudent";

        Student student = new Student();
        student.setId(1);
        student.setName("666魔鬼");
        student.setAge(12);
        sqlSession.update(sql, student);

        sqlSession.commit();
        sqlSession.close();

    }


    @Test
    public void deleteStudent(){

        SqlSession sqlSession = MybatisUtil.getSqlSession();
        String sql = "com.ljs.dao.StudentDao.deleteStudent";


        sqlSession.delete(sql, 6);

        sqlSession.commit();
        sqlSession.close();

    }




}
