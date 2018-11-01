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
	<div>
		<p><a href="${context}/create">Create</a></p>
	</div>
 	<c:forEach items="${students}" var="student">
 		<div>
 			<p>Name : ${student.name}</p>
 			<p>Age : ${student.age}</p>
 			<p><a href="${context}/update/${student.id}">Update</a><br/>
 			<a href="${context}/delete/${student.id}">Delete</a></p>
 			<p>==========================</p>
 		</div>
 	</c:forEach>
</body>
</html>