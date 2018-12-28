<%--
  Created by IntelliJ IDEA.
  User: asb75
  Date: 10/10/2018
  Time: 2:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Login</title>
  </head>
  <body>
  <h1> Please sign up using the form below</h1>
  <form action="blahblah" method="post">
    <input type="hidden" name="guess" value="signup" >

    <label for="firstName" >First name:</label>
    <input type="text" name="firstName" id="firstName" required><br>

    <label for="lastName" >Last name:</label>
    <input type="text" name="lastName" id="lastName" required><br>

    <label for="userN" >User name:</label>
    <input type="text" name="userN" id="userN" required><br>

    <label for="passU" >Password:</label>
    <input type="password" name="passU" id="passU" required><br>

    <input type="submit" value="Sign Up" >
  </form>
  </body>
</html>
