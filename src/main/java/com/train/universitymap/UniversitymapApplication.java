package com.train.universitymap;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.train.universitymap.mapper")
public class UniversitymapApplication {

    public static void main(String[] args) {
        SpringApplication.run(UniversitymapApplication.class, args);
    }

}
