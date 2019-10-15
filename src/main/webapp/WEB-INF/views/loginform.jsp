<%--
  Created by IntelliJ IDEA.
  User: OY
  Date: 10/15/2019
  Time: 9:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>login page</title>
</head>
<body>
<h4>login page</h4>
<form action="login" method="post">
    <font color="red">${requestScope.message}</font>
    <table>
        <tr>
            <td>name:<input type="text" name="name" />
        </tr>
        <tr>
            <td>password:<input type="password" name="password" />
        </tr>
        <tr>
            <td><input type="submit" value="login" />
        </tr>
    </table>
</form>
</body>
</html>
