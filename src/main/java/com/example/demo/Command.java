package com.example.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

import com.example.demo.Repository.mysqlRepository;
import com.example.mongo.Repository.mongoRepository;

@Component
public class Command implements CommandLineRunner{

//	@Autowired
//	private mongoRepository mongoRepo;

	@Override
	public void run(String... args) throws Exception {
		//mongoRepo.insertData();
		System.out.println("commandLine");
	}

}
