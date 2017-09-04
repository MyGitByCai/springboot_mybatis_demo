<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="https://ss1.bdstatic.com/5eN1bjq8AAUYm2zgoY3K/r/www/cache/static/protocol/https/jquery/jquery-1.10.2.min_65682a2.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.line-div{ float:Left; width:100%;line-height: 35px;height:35px;}
</style>
</head>
<body>
	<form name='loginForm' id="loginForm" action="<%=request.getContextPath()%>/login" method='post'>
             <div>  
             	 登录名称：                     
                 <input type="text" name="username" id="username"  placeholder="请输入邮箱或者手机号码" />                         
             </div>
             <div>     
             	登录密码：                   
                <input type="password" name="password" placeholder="请输入登录密码" id="password" />                      		
             </div>
             <input type="hidden" name="${_csrf.parameterName}"  value="${_csrf.token}" />
             <div class="form-actions">
                <button type="submit" class="btn">Log in</button>
            </div>
         </form>
</body>
<script type="text/javascript">
		function ajaxLogin_post(){
			var userName = $("#username").val();
			var password = $("#password").val();
			if(userName == null || userName == "" || userName == "请输入邮箱登陆"){
				alert("用户名不能为空");
				$("#username").focus();
				return;
			}
			if(password == null || password == ""){
				alert("密码不能为空");
				$("#password").focus();
				return;
			}
			$("#loginForm").submit();
		}
</script>
</html>