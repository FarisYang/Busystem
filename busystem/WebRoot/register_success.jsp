<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>公交查询系统</title>
	</head>
	<body>
		<jsp:include page="head.jsp"></jsp:include>
		<div class=content>
			<div class=left>
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
					<div class=banner>
					</div>
					<div class=info_bk1>
						<div align="center">
							您好! 用户
							<s:property value="user.username" />
							欢迎您注册成功!
							<a href="login.jsp">登录</a>
						</div>
					</div>
				</div>
			</div>
		</div>
		<jsp:include page="foot.jsp"></jsp:include>
	</body>
</html>
