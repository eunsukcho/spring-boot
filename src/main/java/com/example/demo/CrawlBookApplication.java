package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.example.demo.bean.SqlSessionFactoryClass;
import com.example.mongo.component.MongoComponent;

@SpringBootApplication
@EnableScheduling
@EnableAutoConfiguration
@ComponentScan({"com.example.demo", "com.example.mongo"})
public class CrawlBookApplication {

	@Autowired
	SqlSessionFactoryClass sqlsession;

	@Autowired
	MongoComponent mongocomponent;
	
	@Autowired
	Command command;
	
	@Autowired
	CronClass cronclass;
	
	public static void main(String[] args) {
		SpringApplication.run(CrawlBookApplication.class, args);
	}
}
