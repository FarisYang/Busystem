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
		<script type="text/javascript" src="dwr/engine.js"></script>
	<script type="text/javascript" src="dwr/util.js"></script>
	<script type="text/javascript" src="dwr/interface/UserDAOAjax.js"></script>
	<script type="text/javascript">
    function show(boolean)
    {
     	 if(boolean)
     	 {
       	 alert("用户已经存在!");
     	 }
		}
    function validate(){
      var name=document.all.name.value;
      if(name == ""){
      	alert("用户名不能为空！");
      	return;
      }
      UserDAOAjax.exitUser(name,show);
    }
  </script>
		
	</head>
	<body>
		<!--导入head.jsp-->
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
			</div><div class=right>
				<div class=right_box>
					<div class=info_bk1>
					<div align="center">
						<form action="register.action" method="post" name="form1">
							用户注册
							<br>
							用户名:<input type="text" id="name" name="user.username" size=20  onblur="validate()" />
							<br>
							密&nbsp;&nbsp;&nbsp;&nbsp;码:
							<input type="password" name="user.password" size=21>
							<br>
							性&nbsp;&nbsp;&nbsp;&nbsp;别:
							<input type="text" name="user.sex" size=20 />
							<br>
							年&nbsp;&nbsp;&nbsp;&nbsp;龄:
							<input type="text" name="user.age" size=20 />
							<br>
							<s:hidden name="user.role" value="customer"></s:hidden>
							<input type="submit" value="注册">
						</Form>
					</div>
					</div>
				</div>
			</div>
		</div>
		<jsp:include page="foot.jsp"></jsp:include>
	</body>
</html>
