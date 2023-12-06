package com.demo;

import com.demo.bean.Student;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
public class AppConfig {
//    @Bean
//    public PrettyTime prettyTime(){
//        return new PrettyTime();
//    }

    @Bean
    public  Student student(){
        return new Student();
    }
}