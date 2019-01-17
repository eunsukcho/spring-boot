package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.example.mongo.Repository.mongoRepository;

@Component
public class CronClass {

	@Autowired
	private mongoRepository mongoRepo;
	
	@Scheduled(cron = "0 45 23 * * *")
	public void twojob() throws Exception {
		System.out.println("작동 시작");
		mongoRepo.insertData();
	}
}