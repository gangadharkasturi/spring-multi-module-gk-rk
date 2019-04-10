package com.springboot.demo.modulethree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages="com.springboot.demo.*")
@SpringBootApplication
public class ThirdmoduleApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(ThirdmoduleApplication.class, args);
    }

}
