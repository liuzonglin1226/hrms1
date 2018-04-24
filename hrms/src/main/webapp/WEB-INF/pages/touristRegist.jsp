<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/4/23
  Time: 13:43
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
</head>
<body>
    <fieldset>
        <legend>游客注册</legend>
        <form method="post" action="touristRegist1">
            请输入帐号：<input name="t_name" required="required"></br>
            请输入密码：<input name="t_pass" type="password" required="required"><br>
            <a href="tourist">返回</a>
            <input type="submit" value="注册">
        </form>
    </fieldset>
</body>
</html>