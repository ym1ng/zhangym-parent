package com.zhangym;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 启动项
 *
 * @author zym
 * @create 2020-04-13 16:51
 **/
 @SpringBootApplication
 @EnableSwagger2                 //开启swagger
 @MapperScan("com.zhangym.mapper")
 @EnableCaching
 public class SpringbootApplication {
 public static void main(String[] args) {
  SpringApplication.run(SpringbootApplication.class, args);
 }

}
