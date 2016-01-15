<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!doctype html public "-//w3c//dtd html 4.01 transitional//en" 
"http://www.w3c.org/tr/1999/rec-html401-19991224/loose.dtd">
<html>
	<head>
		<title>公交查询系统</title>
	</head>
	<body>
		<jsp:include page="head.jsp"></jsp:include>
		<div class=content>
			<div class=right>
				<div class=right_box>
					<font face=宋体></font><font face=宋体></font><font face=宋体></font><font
						face=宋体></font>
					<div class=banner>
					</div>
					<div class=info_bk1>
						<div align="center">
							
						
						<s:form action="addOrUpdateBusDetail.action" method="post">
		                <tr><td></td><td>请在此修改公交的信息</td></tr>
  
                        <s:textfield label="公交线路"  name="bus.busname" value="%{#request.bus.busname}"></s:textfield>
                        <s:textfield label="运行时间"  name="bus.time" value="%{#request.bus.time}"></s:textfield>
                        <s:hidden name="bus.busid" value="%{#request.bus.busid}"></s:hidden>
                        
                        <s:submit value="修改"></s:submit>
  
                        </s:form> 
						</div>
					</div>
				</div>
			</div>
		</div>
		<jsp:include page="foot.jsp"></jsp:include>
	</body>
</html>
