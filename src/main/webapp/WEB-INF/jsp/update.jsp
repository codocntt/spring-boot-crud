<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="context" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
This is create student page.

<form action="${context}/create" method="post" modelAttribute="student">
	<input name="id" type="text" value="${student.id}" readonly="readonly"/><br/>
	<input name="name" type="text" value="${student.name}"/><br/>
	<input name="age" type="number" value="${student.age}"/><br/>
	<input value="Submit" type="submit"/>
</form>

</body>
</html>