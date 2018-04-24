<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/4/23
  Time: 13:08
  To change this template use File | Settings | File Templates.
--%>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/12 0012
  Time: 13:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>"/>
    <title></title>
    <style type="text/css">
        a{
            text-decoration: none;
        }
    </style>
</head>
<body>
    <fieldset>
        <legend>界面</legend>
        <a href="tourist">我是游客</a>
        <a href="employee">我是员工</a>
        <a href="manager">我是管理员</a>
    </fieldset>
</body>
</html>