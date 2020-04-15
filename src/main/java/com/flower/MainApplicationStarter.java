package com.flower;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class MainApplicationStarter extends SpringBootServletInitializer{

    public static void main(String[] args) {
        SpringApplication.run(MainApplicationStarter.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // ע������Ҫָ��ԭ����main����ִ�е�Application������
        return builder.sources(MainApplicationStarter.class);
    }
}
