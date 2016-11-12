<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
<title>Using GET and POST Method to Read Form Data</title>
</head>
<body>
<h1>Using GET Method to Read Form Data</h1>
<form:form action="handlePostedForm" method="POST" commandName="command">
Person_ID: <form:input path="pid" />
<br/>
First Name:<form:input path="firstname"/>
<br />
Last Name:<form:input path="lastname" />
<br/>
Address: <form:input path="address" />
<br/>
City: <form:input path="city" />
<br/>
<input type="submit" value="Submit" />
</form:form>
</body>
</html>