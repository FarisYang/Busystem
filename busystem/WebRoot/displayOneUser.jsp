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
							
						
						<s:form action="addOrUpdateUserDetail.action" method="post">
		                <tr><td></td><td>请在此修改用户的信息</td></tr>
  
                        <s:textfield label="用户名"  name="user.username" value="%{#request.user.username}"></s:textfield>
                        <s:textfield label="密码"  name="user.password" value="%{#request.user.password}"></s:textfield>
                        <s:textfield label="性别" name="user.sex" value="%{#request.user.sex}"></s:textfield>
                        <s:textfield label="年龄" name="user.age" value="%{#request.user.age}"></s:textfield>
                         <s:textfield label="身份" name="user.role" value="%{#request.user.role}"></s:textfield>
                        <s:hidden name="user.userid" value="%{#request.user.userid}"></s:hidden>
                        
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
