<%--
  Created by IntelliJ IDEA.
  User: u
  Date: 6/5/20
  Time: 10:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Login</title>
  </head>
  <body>
  <form action="/login" method="post">
    Username: <input type="text" name="username">
    Password: <input type="password" name="password">
    <input type="submit" value="Submit">
  </form>
  <p style="color:red;">${errorMessage}</p>
  </body>
</html>
