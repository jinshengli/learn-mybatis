
### mybatis 入门


#### Mybatis动态代理对象


mybatis会通过动态代理为我们创建dao对象；
我们直接调用该代理对象的方法即可对数据库进行操作。

获取Dao的动态代理对象：

    StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
    
    sqlSession.getMapper(接口.class)




#### mybaits传参的情况

##### 1）只有一个简单类型参数
    不需要特殊的处理
##### 2）多个简单类型参数
    需要在Dao接口的方法参数中使用@Param()进行参数声明
##### 3）非常多参数；封装在一个对象中
    在Mapper文件中通过 parameterType 指定特定的参数类型
##### 4） 多个简单类型；Dao方法没有特殊处理
    在Mapper中 arg0 代表第一个参数；arg1、arg2
##### 5) 传Map类型的参数；
    和传对象差不多；缺点不明确key是啥。


#### 动态SQL

根据标签判断表达式，动态拼接where后面的判断条件。


1. if判断
2. where 
3. foreach

参考: studentMapper


  
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


需要注意传参

    动态sql中，where后面的判断条件不能有 <, >=
    ; 这些符号替换成&lt...


 

JUnit测试：

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
