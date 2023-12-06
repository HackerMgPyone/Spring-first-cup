package com.demo;

import com.demo.bean.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    //inversion of control


    public static void main(String[] args) {
        ApplicationContext context=
                new AnnotationConfigApplicationContext(AppConfig.class);
        Student student=context.getBean(Student.class);
        System.out.println(student.getName());
        System.out.println(student.getSchool());

    }
}