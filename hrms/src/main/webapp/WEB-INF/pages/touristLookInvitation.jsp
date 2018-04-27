<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/4/25
  Time: 11:34
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
<table>
    <thead>
    <tr>
        <td>面试编号</td><td>用户ID</td><td>面试时间</td><td>面试地点</td><td>面试状态</td>
    </thead>
    <tbody>
    <c:choose>
        <c:when test="${sessionScope.touristLookInvitation.size()!=0}">
            <c:forEach items="${sessionScope.touristLookInvitation}" var="list">
                <c:choose>
                    <c:when test="${list.i_state=='通知面试'}">
                        <tr>
                            <td>${list.i_id}</td>
                            <td>${list.i_touristid}</td>
                            <td>${list.i_time}</td>
                            <td>${list.i_address}</td>
                            <td>${list.i_state}</td>
                            <td>
                                <form method="post" action="touristInviting">
                                    <input type="hidden" name="i_id" value="${list.i_id}">
                                    <input type="hidden" name="i_resumeid" value="${list.i_resumeid}">
                                    <input type="submit"value="面试">
                                </form>
                            </td>
                        </tr>
                    </c:when>
                </c:choose>
            </c:forEach>
        </c:when>
    </c:choose>
    </tbody>
</table>
</body>
</html>