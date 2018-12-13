<%--
  Created by IntelliJ IDEA.
  User: blade
  Date: 12/12/18
  Time: 00:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Vue</title>
</head>
<body>
<ul>
    <%String nom = request.getParameter("nom");%>
    <li>nom : <%out.print(nom);%></li>
    <li>protocol : <%out.print(request.getProtocol());%></li>
    <li>adresse : <%out.print(request.getRemoteAddr());%></li>
    <li>port : <%out.print(request.getRemotePort());%></li>
    <li>uri : <%out.print(request.getRequestURI());%></li>
    <li>url : <%out.print(request.getRequestURL());%></li>
    <li>seesionId : <%=request.getRequestedSessionId()%></li>
</ul>
</body>
</html>
