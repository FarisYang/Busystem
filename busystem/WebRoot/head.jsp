<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3c.org/TR/1999/REC-html401-19991224/loose.dtd">
<html>
	<head>
		<title>公交查询系统</title>
		<link href="css/busystem.css" rel="stylesheet" type="text/css">
	</head>
	<body>
		<div class=head>
			<div class=head_left>
				<a href="#"><img hspace=11 src="picture/buslogo.jpg" height="100" width="150" vspace=5>
				</a><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font size="5">公交查询系统</font>
			</div>
			<div class=head_right>
				<div class=head_right_nei>
					<div class=head_top>
						<div class=head_user>
							<a href="admin.jsp"><font size="2">管理员</font></a>
						</div>
					</div>
					<div class=head_middle>
						<a class="title01" href="index.jsp" target=_top> 
								 <span>&nbsp;&nbsp;<font size="3">首页</font>&nbsp;&nbsp;</span>
						 </a>
						<s:if test="#session.user==null">
							<a class=title01 href="login.jsp"> 
								<span>&nbsp;&nbsp;<font size="3">登录</font>&nbsp;&nbsp;</span></a>
							</s:if>
						<s:else>
							<a class=title01 href="logout.action"> 
								<span>&nbsp;&nbsp;<font size="3">注销</font>&nbsp;&nbsp;</span> </a>
						</s:else>
						<a class=title01 href="register.jsp" target=_top>
							<span>&nbsp;&nbsp;<font size="3">注册</font>&nbsp;&nbsp;</span> </a>
						<a class=title01 href="browseBus.action" target=_top><span
								class="style3"><font size="3">查公交</font>&nbsp;&nbsp;&nbsp;</span> </a>
						<a class=title01 href="map.jsp" target=_top><span
								class="style3">&nbsp;<font size="3">地图</font>&nbsp;&nbsp;&nbsp;</span>
						</a>
					</div>
					</div>
			</div>
		</div>
	</body>
</html>
