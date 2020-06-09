
### mybatis 入门


#### 主要针对 *SqlSession* 对象的使用

直接调用sqlSession的方法进行数据库的增删改查

    sql = mapper文件的namespace + id

    Student student = sqlSession.selectOne(sql, 1);
    List<Student> list = sqlSession.selectList(sql);
  
    sqlSession.insert(sql, student);
  
    sqlSession.update(sql, student);
    
    sqlSession.delete(sql, 6);

直接使用SqlSession对象, 和 dao接口没有任何关系；一般代码中不会这么使用。


#### 使用dao对象来操作数据库

通过调用Dao对象的方法执行sql；而不是直接调用SqlSession的方法;


通过创建实现Dao接口的类；这个接口的实现方法中，也是委托SqlSession来
完成sql执行。














