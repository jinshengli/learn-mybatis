
### mybatis 入门


#### Mybatis动态代理对象


mybatis会通过动态代理为我们创建dao对象；
我们直接调用该代理对象的方法即可对数据库进行操作。

获取Dao的动态代理对象：

StudentDao studentDao = sqlSession.getMapper(StudentDao.class);

sqlSession.getMapper(xxx.class)












