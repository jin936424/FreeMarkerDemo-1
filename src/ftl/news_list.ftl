<!DOCTYPE html>
<html>
<#include "common.ftl">
<head>
<meta charset="utf-8">
<title>文档标题</title>
</head>
 
<body>
	<table border="1" align="center" width="50%">
		<tr>
			<td width="400">标题</td>
			<td width="100">发布时间</td>
			<td>作者</td>
			
			<#list pager.data as d>
				<tr>
					<td><a href="${d.id}">${d.title}</a></td>
					<td>${d.postTime?date}</td>
					<td>${d.author}</td>
				</tr>
			</#list>
		</tr>
	</table>
	<div style="margin:0 auto; text-align:center;">
		<@page totalPage=pager.totalPage url="news_list" currPage=pager.page />
	</div>
</body>
 
</html>