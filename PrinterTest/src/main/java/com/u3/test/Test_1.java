package com.u3.test;

import com.u3.entity.printer.Printer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_1 {
    public static void main(String[] args) {
        //创建Spring容器
        ApplicationContext app;
        app = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取实例
        Printer printer = (Printer) app.getBean("printer");
        //打印内容
        printer.print("一十一年无晴雨, 雁子崖前静听风。");
    }
}
