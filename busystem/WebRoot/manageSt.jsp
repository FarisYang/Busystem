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
					<div class=info_bk1>
						<div align="center" >
	                    <s:iterator value="#request.sts" id="st">
				        <div >
	                    <form action="stAction" method="post">
						<s:property value="#st.stname" />&nbsp;&nbsp;
						<s:property value="#st.distance" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	                   <input type="hidden" name="stid" value="<s:property value="#st.stid" />">				
		              <input type="submit" value="修改" onclick="this.form.action='manageOneSt'"/>
                       <input type="submit" value="删除" onclick="this.form.action='deleteOneSt'"/>
                       </form>
						</div>
						</s:iterator>
					</div>
				</div>
			</div>
		</div>
		</div>
		<jsp:include page="foot.jsp"></jsp:include>
	</body>
</html>
