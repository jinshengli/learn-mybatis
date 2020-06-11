# learn-mybatis
mybatis的使用列子


#### 结果映射 resultMap

      <resultMap id="toStudentDemo" type="com.ljs.entity.StudentDemo">
            <id column="id" property="stuId"/>
            <result property="nameS" column="name"/>
            <result property="ages" column="age"/>
        </resultMap>



#### #{} 和 ${} 区别

    1）占位符，#{}变成 ？， ${}是原样替换
    
    2）含有#{}的sql,会被preparedStatement对象执行；
    而${}会被Statement对象执行。
    
    3）#{} 作为列值出现，使用在where中，在列名的右侧；
    ${} 替换列名或表明。
    
    4）#{}没有sql注入的风险，${} 有sql注入风险。



