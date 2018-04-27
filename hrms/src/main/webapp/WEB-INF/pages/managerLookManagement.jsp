<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/4/25
  Time: 17:20
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
                <td>部门编号</td><td>部门名称</td><td>部门创建时间</td><td>部门总人数</td>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${sessionScope.managerLookManagement}" var="list">
                <tr>
                    <td>${list.ma_id}</td>
                    <td>${list.ma_name}</td>
                    <td>${list.ma_time}</td>
                    <td>${list.ma_num}</td>
                    <td>
                        <form method="post" action="managerDeleteManagement">
                            <input type="hidden" name="ma_id" value="${list.ma_id}">
                            <input type="hidden" name="ma_num" value="${list.ma_num}">
                            <input type="submit" value="删除部门">
                        </form>
                    </td>
                    <td>
                        <form method="post" action="managerLookVocation">
                            <input type="hidden" name="v_managementid" value="${list.ma_id}">
                            <input type="submit" value="管理部门">
                        </form>
                    </td>
                </tr>
            </c:forEach>
            <tr>
                <td></td>
                <td>
                    <form method="post" action="managerCreateManagement">
                        <input name="ma_name" required="required">
                        <input type="submit" value="创建部门">
                    </form>
                </td>
            </tr>
        </tbody>
    </table>
</body>
</html>