package com.example.mongo.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.Repository.mysqlRepository;
import com.example.mongo.domain.ChoiFileVo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@Repository
public class mongoRepository {
	
	@Autowired
	MongoTemplate mongo;
	
	@Autowired
	mysqlRepository repo; // mysql에서 파일의 이름과 저장 위치등을 가져옴
	
	List<ChoiFileVo> fileDetailList = new ArrayList<>();
	
	public void insertData() throws Exception {
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create(); 
		fileDetailList = repo.getCrawlData();
		
		System.out.println(gson.toJson(fileDetailList));
		
		ChoiFileVo vo = new ChoiFileVo();
		
		for (int i = 0; i < fileDetailList.size(); i++) {
			
			vo.setBook_rank(fileDetailList.get(i).getBook_rank());
			vo.setBook_store(fileDetailList.get(i).getBook_store());
			vo.setDetail(fileDetailList.get(i).getDetail());
			vo.setPublish_day(fileDetailList.get(i).getPublish_day());
			vo.setSale_price(fileDetailList.get(i).getSale_price());
			vo.setName(fileDetailList.get(i).getName());
			vo.setWriter(fileDetailList.get(i).getWriter());
			vo.setKeyValue(fileDetailList.get(i).getKeyValue());
			mongo.insert(vo); //몽고 DB에 적재
		}
		
		
	}
	
}
