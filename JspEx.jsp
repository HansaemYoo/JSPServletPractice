<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<!-- 선언태그: JSP페이지에서 Java의 멤버변수 또는 메서드를 선언 -->
		<%! 
		int num = 10;
		String str = "jsp";
		ArrayList<String> list = new ArrayList<String>();
		
		public void jspMethod(){
			System.out.println("JSP");
		}
		%>
		
		<!-- 주석태그 -->
		<!-- 이것은 html 주석입니다. -->
		<%-- 이것은 jsp 주석입니다. --%>
		
		<!-- 스크립트 태그: JSP페이지에서 Java코드를 넣기 위한 태그 -->
		<%
		if(num > 0){
		%>
			<p>num은 0보다 크다</p>
		<% 
		} else {
		%>
		<p>num은 0보다 작다</p>
		<% 
		} 
		%>
		
		<!-- 표현식 태그: java의 변수 및 메서드의 반환값을 출력하는 태그 -->
		num is <%= num %>		
	</body>
</html>