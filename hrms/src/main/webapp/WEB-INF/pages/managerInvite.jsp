<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/4/25
  Time: 12:38
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
        tr{
            border:1px solid;
        }
        td{
            border:1px solid;
        }
    </style>
</head>
<body>
    <fieldset>
        <legend>面试填写</legend>
        <form method="post" action="managerInviteTourist">
            面试时间：<input type="date" name="i_time" required="required">
            面试地点：<input name="i_address" required="required">
            <input type="submit" value="邀请面试">
        </form>
    </fieldset>
</body>
</html>