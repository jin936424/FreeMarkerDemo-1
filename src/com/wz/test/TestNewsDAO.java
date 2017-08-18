package com.wz.test;

import com.wz.freemarker.News;
import com.wz.freemarker.NewsDAO;
import com.wz.freemarker.Pager;

public class TestNewsDAO {

	public static void main(String[] args) {
		NewsDAO dao = new NewsDAO();
		
		Pager<News> pager = dao.getNews(2);
		System.out.println(pager);
		
	}

}
