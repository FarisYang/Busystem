<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3c.org/TR/1999/REC-html401-19991224/loose.dtd">
<html>
<head>
	<title>公交查询系统</title>
		<link href="css/busystem.css" rel="stylesheet" type="text/css">
	</head>
	<body>
		<jsp:include page="head.jsp"></jsp:include>
		<div class=content>
		<div class=left >
			<div class=list_box>
				<div class=list_bk>
					<font size="3">通知公告：</font><br>
					<font size="2">......停运</font><br>
					<font size="2">线路更改......</font><br>
					<font size="2">新增线路......</font><br>
				</div>
			</div>
			</div>
		<div class=right>
			<div class=right_box>
				<font face=宋体></font><font face=宋体></font><font face=宋体></font><font
					face=宋体></font>
				<div class=banner></div>
		<div align="center">
			<s:action name="newBook" executeResult="true" /></div>
		</div>
		</div>
	</div>
	<jsp:include page="foot.jsp"></jsp:include>
</body>
</html>
