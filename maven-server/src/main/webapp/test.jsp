<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'test.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="jquery-1.9.1.min.js"></script>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript">
	$(function(){
			var str = "{\"id\": \"888\",\"username\": \"5\","
			+"\"sex\": \"5\",\"email\": \"5\", \"birthday\": \"5\","
			+"\"salary\": \"5\",\"account\": \"5\",}"; 
			$.ajax({  
	            url:"<%=basePath%>rest/server/user/saveUser",
	            type : "POST",  
	         	/* headers: {
                    'Accept': 'application/json',
                    'Content-Type': 'application/json;charset=UTF-8'
                }, */
	             data:str, 
	            dataType: "json",
	            contentType: "application/json;charset=utf-8",
	            success:function(data){  
	                if(data.success==true){  
	                    alert("添加成功！");  
	                }else{  
	                    alert("添加失败！");  
	                }  
	            },  
	        });  
		});
	</script>
  </head> 
  </body>
</html>

 