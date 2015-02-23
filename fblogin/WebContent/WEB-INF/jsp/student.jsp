<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@page session="true"%>
<spring:url var="authUrl"
value="/static/j_spring_security_logout" />
<html>
<head>
<style>
.error {
color: #ff0000;
font-weight: bold;
}
</style>
    <title>Spring MVC Form Handling</title>
</head>
<body style="align:center">
<form:form  action="/addStudent">
<form:errors path="*" cssClass="error" />
<h2>Student Information Form </h2>
   <table style="align:center">
    <tr>
        <td><label id="name">Name</label></td>
        
        <td><form:input path="name" /></td>
		<td><form:errors path="name" cssClass="error" /></td>
    </tr>
    <tr>
        <td><label id="age">Age</label></td>
       
        <td><form:input path="age" /></td>
<td><form:errors path="age" cssClass="error" /></td>
    </tr>
    <tr>
        <td><label id="id">id</label></td>
        
        <td><form:input path="id" /></td>
<td><form:errors path="id" cssClass="error" /></td>
    </tr>
     <tr>
        <td><label id="Branch">Branch</label></td>
    
    	<td><form:input path="branch" /></td>
<td><form:errors path="branch" cssClass="error" /></td>
    </tr>
     <tr>
        <td><label id="grade">Grade</label></td>
        
        <td><form:input path="grade" /></td>
<td><form:errors path="grade" cssClass="error" /></td>
    </tr>
     <tr>
        <td><label id="university">University</label></td>
        
    	<td><form:input path="university" /></td>
<td><form:errors path="university" cssClass="error" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Submit"/>
        </td>
    </tr>
</table>  
</form:form>

<c:if test="${pageContext.request.userPrincipal.name != null}">
	   <h2>Welcome : ${pageContext.request.userPrincipal.name} 
           |<a href="${authUrl}"> Logout</a></h2>  
	</c:if>
</body>
</html>