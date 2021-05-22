package com.springboot.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringbootSampleAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSampleAppApplication.class, args);
	}

}
