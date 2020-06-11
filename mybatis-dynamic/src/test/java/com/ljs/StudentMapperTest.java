package com.ljs;

import com.github.pagehelper.PageHelper;
import com.ljs.dao.StudentMapper;
import com.ljs.entity.Student;
import com.ljs.entity.StudentDemo;
import com.ljs.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * create by ljs on 2020/6/10 22:40
 * <p>
 * description:
 */
public class StudentMapperTest {

    private SqlSession sqlSession = null;
    private StudentMapper mapper = null;

    @Before
    public void setUp(){
        sqlSession = MybatisUtil.getSqlSession();
        mapper = sqlSession.getMapper(StudentMapper.class);
        System.out.println("生成sqlSession; mybatis生成StudentMapper动态代理对象");
    }

    @After
    public void tearDown() {
        sqlSession.close();
    }


    @Test
    public void testFindStudentIfHasName() {
        String name = "广州";
        List<Student> list = mapper.findStudentByIf(name);
        for (Student student : list) {
            System.out.println(student);
        }
    }


    @Test
    public void findUserByObject(){

        Student student = new Student();
        student.setId(1);
        student.setName("ljs");
        student.setAge(23);
        List<Student> list = mapper.findStudentByObject(student);
        for (Student s : list) {
            System.out.println(s);
        }

    }

    @Test
    public void findStudentByObject1(){
        Student student = new Student();
        student.setId(17);
        student.setName("ljs");
        student.setAge(23);
        List<Student> list = mapper.findStudentByObject1(student);
        for (Student s : list) {
            System.out.println(s);
        }
    }


    @Test
    public void findStudentByIds(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); list.add(2); list.add(3);
        List<Student> list2 = mapper.findStudentByIds(list);
        for (Student s : list2) {
            System.out.println(s);
        }
    }


    @Test
    public void findStudentByIds1(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); list.add(2); list.add(3);
        List<Student> list2 = mapper.findStudentByIds01(list);
        for (Student s : list2) {
            System.out.println(s);
        }
    }

    @Test
    public void findStudentByIds2(){
        int [] arr = {1,2,3,4,5};
        List<Student> list2 = mapper.findStudentByIds02(arr);
        for (Student s : list2) {
            System.out.println(s);
        }
    }

    @Test
    public void getStudentDemo(){
        PageHelper.startPage(1,2);
        List<StudentDemo> studentDemo = mapper.getStudentDemo();
        for (StudentDemo demo : studentDemo) {
            System.out.println(demo);
        }
    }




}
