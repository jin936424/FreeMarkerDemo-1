package com.wz.freemarker;

import java.io.File;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;

public class NewsProcess {

	public static void main(String[] args) throws Exception {
		
		Configuration cfg = new Configuration(Configuration.VERSION_2_3_26);
		cfg.setDirectoryForTemplateLoading(new File("src/ftl"));
		Template template = cfg.getTemplate("news_list.ftl");
		
		
		NewsDAO dao = new NewsDAO();
		//产生多个静态页面
		int totalPage = dao.getTotalPage();
		for (int i = 1; i <= totalPage; i++) {
			Pager<News> pager = dao.getNews(i);
			Map<String, Pager<News>> root = new HashMap<>();
			root.put("pager", pager);
			Writer writer = new FileWriter(new File("news_list_"+i+".html"));
			template.process(root, writer);
			writer.flush();
		}
		
	}

}
