<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Employee </title>
</head>
<body>
	
	<h1>Employee Details</h1>
	<hr>
<table border="2" align="center">
  <tr >
     <th>Employee Id</th>
     <th>Employee Name</th>
     <th>Employee Salary </th>
     <th>action</th>
  </tr>
  <c:forEach var="e" items="${elist}">
     <tr>
       <td>${e.empid}</td>
       <td>${e.ename}</td>
       <td>${e.sal}</td>
       <td><a href="delete/${e.empid}">delete</a>
       /
       <a href="edit/${e.empid}">edit</a></td>
     </tr>
  </c:forEach>
</table>
<center><a href="addemployee">Add New Employee </a></center>

</body>
</html>