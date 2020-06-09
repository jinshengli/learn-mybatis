package com.ljs;


import com.ljs.entity.Student;
import com.ljs.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) throws IOException {


        SqlSession sqlSession = MybatisUtil.getSqlSession();

        String sql = "com.ljs.dao.StudentDao.findAllStudent";

        List<Student> list = sqlSession.selectList(sql);

        for (Student student : list) {
            System.out.println(student);
        }


    }
}
