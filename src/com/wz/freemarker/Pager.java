package com.wz.freemarker;

import java.util.List;
/**
 * 封装分页数据
 * @author Miller
 *
 * @param <E>
 */
public class Pager<E> {
	//分页数据
	private List<E> data;
	//当前页码
	private int page;
	//每页显示多少条记录
	private int numberOfPage;
	//总记录数
	private int totalNums;
	//总页数
	private int totalPage;
	//当期页面的记录数
	private int currentNum;
	
	public List<E> getData() {
		return data;
	}
	public void setData(List<E> data) {
		this.data = data;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getNumberOfPage() {
		return numberOfPage;
	}
	public void setNumberOfPage(int numberOfPage) {
		this.numberOfPage = numberOfPage;
	}
	public int getTotalNums() {
		return totalNums;
	}
	public void setTotalNums(int totalNums) {
		this.totalNums = totalNums;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getCurrentNum() {
		return currentNum;
	}
	public void setCurrentNum(int currentNum) {
		this.currentNum = currentNum;
	}
	@Override
	public String toString() {
		return "Pager [data=" + data + ", page=" + page + ", numberOfPage=" + numberOfPage + ", totalNums=" + totalNums
				+ ", totalPage=" + totalPage + ", currentNum=" + currentNum + "]";
	}
	
	
}
