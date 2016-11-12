
<%@page import="com.swayam.demo.web.rest.model.Person"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
   
<body>
 <table style="width:100%" border="1">
 <tr>
    <th>Firstname</th>
    <th>Lastname</th> 
    <th>PID</th>
  </tr>
 
		<c:forEach var="person" items="${persons}">

<tr>
	
    <td>${person.firstname}</td>
    <td>${person.lastname}</td> 
    <td>${person.pid}</td>
    <td> <a href="personform.html?id=${person.pid}">Update</a></td>
  </tr>
  </c:forEach>

  
</table>
</body>
</html>