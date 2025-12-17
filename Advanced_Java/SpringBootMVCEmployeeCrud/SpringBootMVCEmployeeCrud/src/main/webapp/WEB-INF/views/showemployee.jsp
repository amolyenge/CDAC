<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix ="c" uri="jakarta.tags.core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <table border='2'>
   
   <tr>
      <th>Employee ID</th>
      <th>Employee Name</th>
      <th>Employee Salary</th>
      <th>Employee Hire Date</th>
      <th>Employee Department</th>
      <th>Action</th>
   </tr>
   <c:forEach var="emp" items="${elist}">
   <tr>
     <td>${emp.eid}</td>
     <td>${emp.ename}</td>
     <td>${emp.sal}</td>
     <td>${emp.hdate}</td>
     <td>${emp.dept}</td>
     <td><a href="deleteemployee/${emp.eid}">delete</a>/<a href="editemployee/${emp.eid}">edit</a></td>
   </tr>
   </c:forEach>
   
   </table>
   <a href="add">Add new product</a>
</body>
</html>