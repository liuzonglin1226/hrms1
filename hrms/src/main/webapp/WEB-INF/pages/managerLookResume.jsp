<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/4/25
  Time: 10:24
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
        <td>简历编号</td><td>姓名</td><td>年龄</td><td>性别</td><td>职位</td><td>电话</td><td>地址</td><td>学历</td><td>经验</td><td>简历状态</td><td>用户ID</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${sessionScope.managerLookResume}" var="list">
        <tr>
            <td>${list.re_id}</td>
            <td>${list.re_name}</td>
            <td>${list.re_age}</td>
            <td>${list.re_sex}</td>
            <td>${list.re_vocation}</td>
            <td>${list.re_phone}</td>
            <td>${list.re_address}</td>
            <td>${list.re_education}</td>
            <td>${list.re_experience}</td>
            <td>${list.re_receive}</td>
            <td>${list.re_touristid}</td>
            <c:choose>
                <c:when test="${list.re_receive=='等待检阅简历'}">
                    <td>
                        <form method="post" action="managerInvite">
                            <input type="hidden" name="re_touristid" value="${list.re_touristid}">
                            <input type="hidden" name="re_id" value="${list.re_id}">
                            <input type="submit" value="填写面试邀请">
                        </form>
                    </td>
                </c:when>
            </c:choose>
            <c:choose>
                <c:when test="${list.re_receive=='等待面试结果'}">
                    <td>
                        <form method="post" action="managerEmploy">
                            <input type="hidden" name="re_id" value="${list.re_id}">
                            <input type="hidden" name="re_phone" value="${list.re_phone}">
                            <input type="hidden" name="re_vocation" value="${list.re_vocation}">
                            <input type="hidden" name="re_recruitid" value="${list.re_recruitid}">
                            <input type="hidden" name="re_name" value="${list.re_name}">
                            <input type="hidden" name="re_age" value="${list.re_age}">
                            <input type="hidden" name="re_address" value="${list.re_address}">
                            <input type="submit" value="录用该用户">
                        </form>
                    </td>
                </c:when>
            </c:choose>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>