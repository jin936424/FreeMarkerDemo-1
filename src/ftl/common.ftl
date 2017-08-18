<#-- 自定义指令 -->
<#macro page totalPage url currPage=1>
	<#list 1..totalPage as p>
		<#if p == currPage>
			${p}
		<#else>
			<a href="${url}_${p}.html">${p}</a>
		</#if>
	</#list>
</#macro>