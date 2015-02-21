<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" 
       uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student deatils view </title>
 <style>
            table, td, th {
    border: 2px solid black;
}

th {
    background-color: green;
    color: white;
}
        </style>
</head>
<body style="align:center"><h1>See Student Data</h1>
    <table border= "1" align="center" style="border-collapse: collapse">
   
  <tr>
    <th>Student Name</th>
<th width="100px">Student Id</th>
<th width="100px">Age</th>
<th width="100px">Branch</th>
 <th width="100px">Grade</th>
 <th width="100px">University</th>
 <th width="100px">Action</th>
  </tr>
 <c:forEach var="listValue" items="${lists}">
  <tr>
 
  <td>${listValue.name}</td>
  <td>${listValue.id}</td>
  <td>${listValue.age}</td>
  <td>${listValue.branch}</td>
  <td>${listValue.grade}</td>
  <td>${listValue.university}</td>
  
  <td><a href="deleteStudent/${listValue.name}">Delete</a>|<a href="updateStudent/${listValue.name}">Update</a></td>
  </tr>
</c:forEach>
</table>
<ul>
			
			
			
		</ul>
</body>
</html>