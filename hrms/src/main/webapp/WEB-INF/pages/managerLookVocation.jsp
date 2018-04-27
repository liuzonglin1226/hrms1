<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/4/27
  Time: 9:54
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
                <td>职位编号</td><td>职位名称</td><td>基本工资</td><td>职员数量</td>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${sessionScope.managerLookVocation}" var="list">
                <c:choose>
                    <c:when test="${sessionScope.managerLookVocationId==list.v_managementid}">
                        <tr>
                            <td>${list.v_id}</td>
                            <td>${list.v_name}</td>
                            <td>${list.v_salary}</td>
                            <td>${list.v_num}</td>
                            <td>
                                <form method="post" action="managerDeleteVocation">
                                    <input type="hidden" name="v_id" value="${list.v_id}">
                                    <input type="hidden" name="v_num" value="${list.v_num}">
                                    <input type="submit" value="删除职位">
                                </form>
                            </td>
                            <td>
                                <form method="post" action="managerLookEmployee">
                                    <input type="hidden" name="v_id" value="${list.v_id}">
                                    <input type="submit" value="管理员工">
                                </form>
                            </td>
                        </tr>
                    </c:when>
                </c:choose>
            </c:forEach>
            <tr>
                <td></td>
                <form method="post" action="managerCreateVocation">
                    <td><input name="v_name" required="required"></td>
                    <td><input name="v_salary" required="required"></td>
                    <td><input type="submit" value="添加职位"></td>
                </form>
            </tr>
            <tr>
                <td><a href="returnManagerLookManagement">返回上一层</a></td>
            </tr>
        </tbody>
    </table>
</body>
</html>