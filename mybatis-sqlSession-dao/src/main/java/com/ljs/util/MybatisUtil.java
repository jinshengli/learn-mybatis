package com.ljs.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * create by ljs on 2020/6/9 17:34
 *
 * description:  工具类；创建 sqlSession对象
 *
 * SqlSessionFactory 单例；
 *
 */


public class MybatisUtil {

    private static SqlSessionFactory sqlSessionFactory;

    static {

        String resource = "mybatis.xml";
        try {
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {

            e.printStackTrace();
            System.out.println("创建SqlSessionFactory失败");

        }

    }

    public static SqlSession getSqlSession() {
        SqlSession sqlSession = null;
        if ( sqlSessionFactory != null )
            sqlSession = sqlSessionFactory.openSession();
        return sqlSession;
    }





}
