package com.nmefc.observe_service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.nmefc.observe_service.mapper")
public class ObserveServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ObserveServiceApplication.class, args);
    }

}
