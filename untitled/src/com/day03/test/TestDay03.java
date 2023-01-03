package com.day03.test;

import com.day03.config.SpringConfig;
import com.day03.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


//完全注解开发，不用xml注入
public class TestDay03 {
    //此测试（testService）存在问题
    @Test
    public void testService(){
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean("user_service", UserService.class);//user_service就是注解中的value值
        System.out.println(userService);
        userService.add();
    }

}
