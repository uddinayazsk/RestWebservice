package com.tringapps.Sample.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement //for XML conversion jaxab jar
public class MessagesModel {
	private long id;
	private String message;
	private Date created;
	private String author;
	
	 public MessagesModel(long id, String message, String author) {
		// TODO Auto-generated constructor stub
		 	this.id = id;
			this.message = message;
			this.created = new Date();
			this.author = author;
	}

	public  MessagesModel(){
	
	}
	
	/*public void MessagesModel(long id, String message , String author) {
		this.id = id;
		this.message = message;
		this.created = new Date();
		this.author = author;
	}*/
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	

}
