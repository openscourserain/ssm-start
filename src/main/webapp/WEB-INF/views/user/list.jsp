<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: OpensourceRain
  Date: 2018/2/26
  Time: 16:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/user/list" method="post">
<div style="width: 80%; margin: 0 auto">
    <div>
        <label>用户名:<input type="text" name="userName" value="${user.userName}"></label>
    </div>
<table cellspacing="0" cellpadding="0" border="1" style="width: 100%">
    <tr>
        <td>编号</td>
        <td>用户名</td>
        <td>密码</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${page.list}" var="item" varStatus="S">
        <tr>
            <td>${S.count}</td>
            <td>${item.userName}</td>
            <td>${item.userPsw}</td>
            <td>
                <a href="#">修改</a>
                <a href="#">删除</a>
            </td>
        </tr>
    </c:forEach>
</table>
</div>
</form>
</body>
</html>
