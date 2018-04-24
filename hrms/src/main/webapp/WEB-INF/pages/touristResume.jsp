<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/4/24
  Time: 11:15
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
        <legend>简历填写</legend>
        <form method="post" action="touristResume1">
            姓名：<input name="re_name" required="required">
            年龄：<input name="re_age" required="required">
            性别：<input name="re_sex" required="required">
            地址：<input name="re_address" required="required">
            学历：<input name="re_education" required="required">
            经验：<input name="re_experience" required="required">
            <input type="submit" value="提交简历">
        </form>
    </fieldset>
</body>
</html>