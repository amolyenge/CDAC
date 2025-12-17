<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <form action="/employee/updateemployee" method="post">
  Employee Id:<input type="text" name="eid" id="eid" value="${emp.eid}" readonly>
  Employee Name:<input type="text" name="ename" id="ename" value="${emp.ename}">
  Employee Salary:<input type="text" name="sal" id="sal" value="${emp.sal}">
  Employee HDate:<input type="date" name="hdate" id="hdate" value="${emp.hdate}" readonly>
  Employee Dept:<input type="text" name="dept" id="dept" value="${emp.dept}">
  <button type="submit" name="btn" id="btn">Update</button>
 </form>
</body>
</html>