<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!doctype html public "-//w3c//dtd html 4.01 transitional//en" 
"http://www.w3c.org/tr/1999/rec-html401-19991224/loose.dtd">
<html>
	<head>
		<title>公交查询系统</title>
	</head>
	<body>
	<% System.out.println("Filter is working");%>
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
							
						
						<s:form action="addOrUpdateStDetail.action" method="post">
		                <tr><td></td><td>请在此修改站台的信息</td></tr>
                       
                        <s:textfield label="站台名称"  name="st.stname" value="%{#request.st.stname}"></s:textfield>
                        <s:textfield label="站间距离"  name="st.distance" value="%{#request.st.distance}"></s:textfield>
                        <s:hidden name="st.stid" value="%{#request.st.stid}"></s:hidden>
                        <s:hidden name="st.bus.busid" value="%{#request.st.bus.busid}"></s:hidden>
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
