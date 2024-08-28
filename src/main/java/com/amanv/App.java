package com.amanv;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Dev obj = (Dev) context.getBean("dev");
        Dev obj = context.getBean(Dev.class);
        obj.build();
        // obj.setAge(18);
        // injecting variable using spring - setter injection
//        System.out.println(obj.getAge());
        System.out.println( "Hello World!" );
    }
}