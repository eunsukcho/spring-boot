package com.example.demo.domain;

public class ChoiCrawlVo {
	int RID;
	String fileName;
	String filePath;
	String viewUrl;
	String crawlTime;
	String fileExt;
	
	public ChoiCrawlVo() {
		// TODO Auto-generated constructor stub
	}
	
	public ChoiCrawlVo(int RID, String fileName, String filePath, String viewUrl, String crawlTime, String fileExt) {
		this.RID = RID;
		this.fileName = fileName;
		this.filePath = filePath;
		this.viewUrl = viewUrl;
		this.crawlTime = crawlTime;
		this.fileExt = fileExt;
	}

	public int getRID() {
		return RID;
	}

	public void setRID(int rID) {
		RID = rID;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getViewUrl() {
		return viewUrl;
	}

	public void setViewUrl(String viewUrl) {
		this.viewUrl = viewUrl;
	}

	public String getCrawlTime() {
		return crawlTime;
	}

	public void setCrawlTime(String crawlTime) {
		this.crawlTime = crawlTime;
	}

	public String getFileExt() {
		return fileExt;
	}

	public void setFileExt(String fileExt) {
		this.fileExt = fileExt;
	}
	
	
	
}
