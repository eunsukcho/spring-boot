package com.example.demo.Repository;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.ChoiCrawlVo;
import com.example.demo.mapper.CrawlMapper;
import com.example.mongo.domain.ChoiFileVo;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@Repository
public class mysqlRepository {
	
	@Autowired
	private CrawlMapper mapper;
	
	static SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
	static String day = format.format(new Date());
	
	public List<ChoiFileVo> parsingFileVoList = new ArrayList<>();
	
	public List<ChoiFileVo> getCrawlData() throws Exception {
		Gson gson = new GsonBuilder().setPrettyPrinting().create(); 
		
		//1. DB데이터 가져오기
		List<ChoiCrawlVo> crawlVoList = mapper.selectTargetCrawlVo(day); //오늘 날짜의 파일이름, 파일 위치, url, 날짜, 파일 타입을 가져옴
		
		//2. 파일 접근하여 Json데이터 만들기
		parsingFileVoList = makeFileVo(crawlVoList);
		
		return parsingFileVoList;
	}
	
	public List<ChoiFileVo> makeFileVo(List<ChoiCrawlVo> choiCrawlVoList) throws Exception{
		List<ChoiFileVo>choiFileVoList = new ArrayList();
		Gson gson = new GsonBuilder().setPrettyPrinting().create(); 
		
		for(ChoiCrawlVo choiCrawlVo : choiCrawlVoList) {
			String tmpFilePath = choiCrawlVo.getFilePath()+"/"+choiCrawlVo.getFileName()+"."+choiCrawlVo.getFileExt();
			String tmpJsonFile = FileUtils.readFileToString(new File(tmpFilePath), "UTF-8"); // Json 파일 안의 데이터를 가져옴
			choiFileVoList.add(gson.fromJson(tmpJsonFile, new TypeToken<ChoiFileVo>(){}.getType())); // 리스트에 저장
		}
		
		return choiFileVoList;
	}
	

}
