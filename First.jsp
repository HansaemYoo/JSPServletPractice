<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>First Page!</title>
</head>
<body>

	<p>First page!</p>
	<%-- response.sendRedirect("Second.jsp"); "Second.jsp"페이지로 이동 --%>
	<%
	response.sendRedirect("Second.jsp");
	%>
	
</body>
</html>