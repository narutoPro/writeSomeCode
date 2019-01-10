package edu.whut.cs.chende;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("edu.whut.cs.chende.dao") //扫描的mapper
public class ChendeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChendeApplication.class, args);
    }

}

