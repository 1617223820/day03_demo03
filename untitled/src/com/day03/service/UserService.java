package com.day03.service;

import com.day03.dao.userDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service(value = "user_service")
public class UserService {
    @Value(value = "张学友")//可以注入普通类型属性
    private String uname;
    //定义dao类型属性
    //选择自动装配后不需要添加set方法
//    @Autowired//根据类型自动装配属性
//    @Qualifier(value = "userDaoImpl01")//根据名称进行装配，必须和Autowired一起使用。value值与dao实现类注解中的value值相对应

    //可以根据类型或者名称注入
//    @Resource//类型方式
    @Resource(name = "userDaoImpl01")//名称注入，name值与dao实现类注解中的value值相对应
    private userDao userDaoImpl;
    public void add(){
        System.out.println("this is service--------"+uname);
        userDaoImpl.addDao();
    }
}
