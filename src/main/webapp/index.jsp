<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%
    pageContext.setAttribute("path", request.getContextPath());
%>
<!DOCTYPE HTML>
<html>
<head>
    <title>首页</title>
    <style type="text/css">
        a {
            text-decoration: none;
            color: black;
            font-size: 18px;
        }

        h3 {
            width: 180px;
            height: 38px;
            margin: 100px auto;
            text-align: center;
            line-height: 38px;
            background: deepskyblue;
            border-radius: 4px;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    基于SSM框架的管理系统：简单实现增、删、改、查。
                </h1>
            </div>
        </div>
    </div>
</div>
<br><br>
<form action="" name="userForm">
    用户名：<input type="text" name="name"><br><br><br>
    密码：<input type="text" name="pwd"><br><br><br>
    <input type="button" value="登陆" onclick="login()">
</form>

<script type="text/javascript">
    function login() {
        var form = document.forms[0];
        form.action = "${path}/login";
        form.method = "post";
        form.submit();
    }
</script>
<h3>
    <a href="${path}/paper/allPaper">点击进入管理页面</a>
</h3>
</body>
</html>