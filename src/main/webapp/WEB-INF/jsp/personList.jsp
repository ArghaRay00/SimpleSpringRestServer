
<%@page import="com.swayam.demo.web.rest.model.Person"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
   
<body>
 <table style="width:100%" border="1">
 <tr>
    <th>PID</th>
    <th>FirstName</th> 
    <th>LastName</th>
    <th>Address</th>
    <th>City</th>
    <th>Update</th>
    <th>Delete</th>
  </tr>
 
		<c:forEach var="person" items="${persons}">

<tr>
	 <td>${person.pid}</td>
    <td>${person.firstname}</td>
    <td>${person.lastname}</td> 
     <td>${person.address}</td>
      <td>${person.city}</td>
   
    <td> <a href="personform.html?id=${person.pid}">Update</a></td>
    <td> <a href="handleDeletion?id=${person.pid}">Delete</a></td>
  </tr>
  </c:forEach>

  
</table>
<form action="personform.html">
    <input type="submit" value="Create New" />
</form>
</body>
</html>