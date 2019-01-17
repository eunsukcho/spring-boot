package com.example.demo.mapper;

import java.util.List;

import com.example.demo.domain.ChoiCrawlVo;
import com.example.demo.domain.FileVO;

public interface CrawlMapper {
	
	public List<FileVO> fileInfo(String day) throws Exception;
	
	public int fileCount(String day) throws Exception;
	
	public String filePath(String day)throws Exception;
	
	public List<ChoiCrawlVo> selectTargetCrawlVo(String day) throws Exception;
}
