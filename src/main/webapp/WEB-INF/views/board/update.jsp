<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../header.jsp" %>


<form method="POST">
	<p><input name="title" value="${row.title }" placeholder="제목" required></p>
	<p><textarea name="contents" placeholder="내용" required>${row.contents }</textarea></p>
	
	<button>수정</button>
</form>

</body>
</html>