package com.wz.freemarker;

import java.util.Date;

/**
 * 新闻实体类
 * @author Miller
 *
 */
public class News {
	private int id;
	private String title;
	private Date postTime;
	private String author;
	
	public News() {
	}
	
	public News(int id, String title, Date postTime, String author) {
		super();
		this.id = id;
		this.title = title;
		this.postTime = postTime;
		this.author = author;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getPostTime() {
		return postTime;
	}
	public void setPostTime(Date postTime) {
		this.postTime = postTime;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "News [id=" + id + ", title=" + title + ", postTime=" + postTime + ", author=" + author + "]";
	}
	
	
}
