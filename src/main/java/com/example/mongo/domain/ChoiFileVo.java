package com.example.mongo.domain;

public class ChoiFileVo {
	String keyValue;
	String book_rank;
	String book_store;
	String name;
	String writer;
	String sale_price;
	String detail;
	String publish_day;
	
	public String getKeyValue() {
		return keyValue;
	}
	public void setKeyValue(String keyValue) {
		this.keyValue = keyValue;
	}
	public String getBook_rank() {
		return book_rank;
	}
	public void setBook_rank(String book_rank) {
		this.book_rank = book_rank;
	}
	public String getBook_store() {
		return book_store;
	}
	public void setBook_store(String book_store) {
		this.book_store = book_store;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getSale_price() {
		return sale_price;
	}
	public void setSale_price(String sale_price) {
		this.sale_price = sale_price;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getPublish_day() {
		return publish_day;
	}
	public void setPublish_day(String publish_day) {
		this.publish_day = publish_day;
	}
	public ChoiFileVo(String keyValue, String book_rank, String book_store, String name, String writer,
			String sale_price, String detail, String publish_day) {
		this.keyValue = keyValue;
		this.book_rank = book_rank;
		this.book_store = book_store;
		this.name = name;
		this.writer = writer;
		this.sale_price = sale_price;
		this.detail = detail;
		this.publish_day = publish_day;
	}
	
	public ChoiFileVo() {
		// TODO Auto-generated constructor stub
	}
}
