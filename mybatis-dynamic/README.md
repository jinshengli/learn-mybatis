
### mybatis 入门


#### Mybatis动态代理对象


mybatis会通过动态代理为我们创建dao对象；
我们直接调用该代理对象的方法即可对数据库进行操作。

获取Dao的动态代理对象：

StudentDao studentDao = sqlSession.getMapper(StudentDao.class);

sqlSession.getMapper(xxx.class)




#### mybaits传参的情况

##### 1）只有一个简单类型参数
不需要特殊的处理
##### 2）多个简单类型参数
需要在Dao接口的方法参数中使用@Param()进行参数声明
##### 3）非常多参数；封装在一个对象中
在Mapper文件中通过 ParamType 指定特定的参数类型
##### 4） 多个简单类型；Dao方法没有特殊处理
在Mapper中 arg0 代表第一个参数；arg1、arg2
##### 5) 传Map类型的参数；
和传对象差不多；缺点不明确key是啥。








