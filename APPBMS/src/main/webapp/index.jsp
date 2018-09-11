<%--
  Created by IntelliJ IDEA.
  User: 邱烨
  Date: 2018/9/3
  Time: 13:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>App信息管理平台</title>
</head>
<style>
    *{
        margin: 0px;
        padding: 0px;
        background-color: #EAEAEA;
    }
    .div{
        margin: auto;
        width: 300px;
        height: 200px;
        position: absolute;
        top: 50%;
        left: 50%;
        -webkit-transform: translate(-50%, -50%);
        -moz-transform: translate(-50%, -50%);
        -ms-transform: translate(-50%, -50%);
        -o-transform: translate(-50%, -50%);
        transform: translate(-50%, -50%);
    }

    a {font-size:16px}
    a:link {color: black; text-decoration:none;}
    a:active{color: red; }
    a:visited {color:black;text-decoration:none;}
    a:hover {color: dodgerblue; text-decoration:none;}

</style>
<body>
<div class="div">
    <h1>APP信息管理平台</h1><br/>
    <a href="#">后台管理系统入口</a><br/><br/>
    <a href="/login.aa">开发者平台入口</a>
</div>
</body>
</html>
