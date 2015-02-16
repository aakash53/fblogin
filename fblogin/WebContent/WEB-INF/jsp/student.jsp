<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>
<body>

<center><h2>Student Information Form </h2></center>
<form method="POST" action="/addStudent">
   <table align="center">
    <tr>
        <td><label id="name">Name</label></td>
        <td><input type="text" name="name"/></td>
    </tr>
    <tr>
        <td><label id="age">Age</label></td>
        <td><input type="text" name="age" /></td>
    </tr>
    <tr>
        <td><label id="id">id</label></td>
        <td><input type="text" name="id" /></td>
    </tr>
     <tr>
        <td><label id="Branch">Branch</label></td>
        <td><input type="text" name="branch" /></td>
    </tr>
     <tr>
        <td><label id="grade">Grade</label></td>
        <td><input type="text" name="grade" /></td>
    </tr>
     <tr>
        <td><label id="university">University</label></td>
        <td><input type="text" name="university" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Submit"/>
        </td>
    </tr>
</table>  
</form>
</body>
</html>