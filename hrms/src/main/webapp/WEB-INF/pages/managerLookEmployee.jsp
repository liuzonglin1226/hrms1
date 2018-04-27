<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/4/27
  Time: 16:27
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
                <td>员工编号</td><td>姓名</td><td>年龄</td><td>电话</td><td>地址</td>
            </tr>
        </thead>
        <tbody>
            <tr>
                <c:forEach items="employeeList" var="list">
                    <c:choose>
                        <c:when test="${list.e_vocationid==sessionScope.vocationid}">
                            <td>${list.e_id}</td>
                            <td>${list.e_namer}</td>
                            <td>${list.e_age}</td>
                            <td>${list.e_phone}</td>
                            <td>${list.e_address}</td>
                        </c:when>
                    </c:choose>
                </c:forEach>
            </tr>
        </tbody>
    </table>
</body>
</html>