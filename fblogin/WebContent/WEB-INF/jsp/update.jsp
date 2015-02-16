<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" 
       uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
            table, td, th {
    border: 2px solid black;
}

th {
    background-color: green;
    color: white;
}
        </style>
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
<body><h1><center>Upadte Student Record</center></h1><form action="/update" method="post">
    <table border= "1" align="center" style="border-collapse: collapse">
 <tr>
  	<td>Id:</td>
  	<td><input type="text" name="id" value="${student.id}" readonly /></td>
  </tr>
  <tr>
  
  <td>Name:</td>
  <td><input type="text" name="name" value="${student.name}" /></td>
  
  </tr>
 
  <tr>
  <td>Age:</td>
 <td> <input type="text" name="age" value="${student.age}"/>
  </td></tr>
  
  <tr>
  <td>Branch:</td>
  <td><input type="text" name="branch" value="${student.branch}"/></td></tr>
  <tr>
  <td>Grade:</td>
  <td>
  <input type="text" name="grade" value="${student.grade}"/></td></tr>
  <tr>
  <td>University:</td>
  <td><input type="text" name="university" value="${student.university}"/></td></tr>
  
  <tr>
  <td colspan="2"><input type="submit"/></td>
  </tr>
</table>
</form>
</body>
</html>