<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/4/23
  Time: 17:25
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
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
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
    <table>
        <thead>
            <tr>
                <td>招聘编号</td><td>招聘职位</td><td>最小年龄</td><td>性别</td><td>工作地点</td><td>工资</td><td>教育背景</td><td>工作经验</td><td>需求数量</td><td></td>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${sessionScope.recruitList}" var="list">
                <tr>
                    <td>${list.r_id}</td>
                    <td>${list.r_vocation}</td>
                    <td>${list.r_age}</td>
                    <td>${list.r_sex}</td>
                    <td>${list.r_city}</td>
                    <td>${list.r_salary}</td>
                    <td>${list.r_education}</td>
                    <td>${list.r_experience}</td>
                    <td>${list.r_num}</td>
                    <td>
                        <form method="post" action="">
                            <input type="hidden" name="id" value="${list.r_id}">
                            <input type="submit" value="投递简历">
                        </form>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>