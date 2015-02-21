<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" 
       uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Main Page</title>

</head>
<body>
<a href="student.html">Click Here</a>
<table style="border-collapse: separate; border-spacing: 2px">
    <tr>
        <td><a th:href="@{/auth/linkedin}" class="..."><i class="..."></i>LinkedIn</a></td>
        <td><a th:href="@{/auth/facebook}" class="..."><i class="..."></i>Facebook</a></td>
    </tr>
    <tr>
        <td><a th:href="@{/auth/twitter}" class="..."><i class="..."></i>Twitter</a></td>
        <td><a th:href="@{/auth/live(scope='wl.signin,wl.basic')}" class="..."><i class="..."></i>Microsoft</a></td>
    </tr>
    <tr>
        <td><a th:href="@{/auth/github}" class="..."><i class="..."></i>Github</a></td>
        <td><a th:href="@{/auth/google(scope='profile')}" class="..."><i class="..."></i>Google+</a></td>
    </tr>
</table>
	
</body>
</html>