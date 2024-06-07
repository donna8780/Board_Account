<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

	<h4>${ver }</h4>
	
	
	<table>
		<tr>
			<th>글 번호</th>
			<th>제목</th>
			<th>닉네임</th>
			<th>조회수</th>
			<th>작성일</th>
			<th>수정</th>
			<th>삭제</th>
		</tr>
		
		<c:forEach var="row" items="${list }">
		<tr>
			<td>${row.idx }</td>
			<td>${row.title }</td>
			<td>${row.nick }</td>
			<td>${row.v_count }</td>
			<td>${row.w_date }</td>
			<td><a href="${cpath }/board/update/${row.idx}">클릭</a></td>
			<td><a href="${cpath }/board/delete/${row.idx}">클릭</a></td>
		</tr>
		</c:forEach>	
		
		<!-- 수정 -->
		
		
		<!-- 삭제 -->
	</table>
</body>
</html>