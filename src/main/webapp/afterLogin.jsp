<%--
  Created by IntelliJ IDEA.
  User: hatefpalizgar
  Date: 2019-09-21
  Time: 15:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>After Login</title>
</head>
<body>
UserName: <%= request.getParameter("userInput")%>
Password: <%= request.getParameter("passInput")%>

</body>
</html>
