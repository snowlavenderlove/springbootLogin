package com.xue;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.xue.repository.dao") //自动扫描com.xue.repository.dao下的文件
public class SpringbootLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootLoginApplication.class, args);
	}

}
