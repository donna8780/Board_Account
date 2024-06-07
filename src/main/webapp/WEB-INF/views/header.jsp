<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>${cpath }</h1>
	<ul>
		<li><a href="${cpath }">home</a></li>
		<li><a href="${cpath }/board">board</a></li>
		<li><a href="${cpath }/account">account</a></li>
		<li><a href="${cpath }/account/login">login</a></li>
		<li><a href="${cpath }/account/signUp">signUp</a></li>
	</ul>
