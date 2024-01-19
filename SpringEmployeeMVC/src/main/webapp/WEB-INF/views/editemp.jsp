<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Employee</title>
</head>
<body>

<fieldset>
	<form action="/SpringEmployeeMVC/emp/updateemployee" method="post">
	Enter Employee Id:<input type="number" name="empid" placeholder="Enter eid" value="${e.empid}"} readonly><br><br>
	Enter Employee Name:<input type="text" name="ename" placeholder="Enter Name" value ="${e.ename}"><br><br>
	Enter Employee Quantity:<input type="number" name="sal" placeholder="Enter Salary" value = "${e.sal}"><br><br>
	
	<input type="submit" value="Update Product" id="button" placeholder="Submit">
	</form>
</fieldset>

</body>
</html>