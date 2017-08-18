package com.wz.freemarker;

import java.util.ArrayList;
import java.util.List;

public class NewsDAO {
	
	private int numOfPage = 4;
	
	/**
	 * 获取总记录数
	 * @return
	 */
	public int  getNewsNum() {
		return Data.newses.size();
	}
	/**
	 * 获取总页数
	 * @return
	 */
	public int getTotalPage()
	{
		if (getNewsNum() % numOfPage == 0) {
			return getNewsNum() / numOfPage;
		}else{
			return getNewsNum() / numOfPage + 1;
		}
	}
	/**
	 * 获取某个页面的数据
	 * @param page
	 * @return
	 */
	public Pager<News> getNews(int page){
		
		Pager<News> pager = new Pager<>();
		pager.setPage(page);
		pager.setNumberOfPage(numOfPage);
		pager.setTotalNums(getNewsNum());
		
		List<News> data = new ArrayList<>();
		int fromIndex = (page - 1) * numOfPage;
		int endIndex = page * numOfPage;
		for (int i = fromIndex; i < endIndex; i++) {
			if (i == getNewsNum()) {
				break;
			}
			data.add(Data.newses.get(i));
		}
		pager.setData(data);
		
		pager.setTotalPage(getTotalPage());
		pager.setCurrentNum(data.size());
		
		return pager;
	}
	
}
