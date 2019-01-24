package com.u3.test;

import com.u3.entity.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_1 {
    public static void main(String[] args) {
        //1 加载核心配置文件 创建Spring容器
        ApplicationContext app;
        app = new ClassPathXmlApplicationContext("applicationContext.xml");

        //2 根据id属性从Spring容器中获取bean的实例
        Person person = (Person) app.getBean("person");

        //3 输出展示
        System.out.println("姓名: " + person.getName() + ", 年龄: " + person.getAge());
    }
}
