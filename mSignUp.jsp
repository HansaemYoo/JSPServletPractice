<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% //자바 코드 삽입
	String m_name; 
	String m_password;
	String[] m_hobby;
	%>
	
	<%
	m_name = request.getParameter("m_name");
	m_password = request.getParameter("m_password");
	m_hobby = request.getParameterValues("m_hobby");
	%>
	
	m_name: <%= m_name %> <br>
	m_password: <%= m_password %> <br>
	m_hobby: 
	<%
	for(int i=0; i<m_hobby.length; i++){
	%> 
	<%=m_hobby[i] %>
	<%
	}
	%>
</body>
</html>