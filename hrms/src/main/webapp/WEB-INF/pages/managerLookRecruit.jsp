<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/4/25
  Time: 14:01
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
            border: 1px solid;
        }
        td{
            border: 1px solid;
        }
    </style>
</head>
<body>
<table>
    <thead>
    <tr>
        <td>招聘编号</td><td>招聘职位</td><td>最小年龄</td><td>性别</td><td>工作地点</td><td>工资</td><td>教育背景</td><td>工作经验</td><td>需求数量</td><td>招聘状态</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${sessionScope.managerLookRecruit}" var="list">
        <tr>
            <form method="post" action="managerUpdateRecruit">
                <td>${list.r_id}</td>
                <input name="r_id" type="hidden" value="${list.r_id}">
                <td><input name="r_vocation" value="${list.r_vocation}"></td>
                <td><input name="r_age" value="${list.r_age}"></td>
                <td><input name="r_sex" value="${list.r_sex}"></td>
                <td><input name="r_city" value="${list.r_city}"></td>
                <td><input name="r_salary" value="${list.r_salary}"></td>
                <td><input name="r_education" value="${list.r_education}"></td>
                <td><input name="r_experience" value="${list.r_experience}"></td>
                <td><input name="r_num" value="${list.r_num}"></td>
                <td>${list.r_state}</td>
                <input type="hidden" name="r_state" value="${list.r_state}">
                <td><input type="submit" value="修改"></td>
            </form>
            <td>
                <form method="post" action="managerUpRecruit">
                    <input name="r_id" type="hidden" value="${list.r_id}">
                    <input type="submit" value="上传招聘">
                </form>
            </td>
            <td>
                <form method="post" action="managerDownRecruit">
                    <input name="r_id" type="hidden" value="${list.r_id}">
                    <input type="submit" value="取消招聘">
                </form>
            </td>
            <td>
                <form method="post" action="managerDeleteRecruit">
                    <input name="r_id" type="hidden" value="${list.r_id}">
                    <input type="hidden" name="r_state" value="${list.r_state}">
                    <input type="submit" value="删除招聘">
                </form>
            </td>
        </tr>
    </c:forEach>
    <tr>
        <form method="post" action="managerSaveRecruit">
            <td></td>
            <td><input name="r_vocation"></td>
            <td><input name="r_age"></td>
            <td><input name="r_sex"></td>
            <td><input name="r_city"></td>
            <td><input name="r_salary"></td>
            <td><input name="r_education"></td>
            <td><input name="r_experience"></td>
            <td><input name="r_num"></td>
            <td><input type="submit" value="添加招聘"></td>
        </form>
    </tr>
    </tbody>
</table>
</body>
</html>