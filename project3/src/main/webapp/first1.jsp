<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <%
 
 String name=request.getParameter("username");
 String pass=request.getParameter("password");
 
 
 if(name.equals("admin") && pass.equals("password")){
	 out.println("<h1> login sucessfulll </h1>");
	 out.println("<h1><a href='second.jsp'>");
	 out.println("<h4>CLICK HERE TO ENTER</h4>");
	 out.println("</a></h1>");
 }
 
 else{
	 
	 out.println("login failed ! try againg....");
			out.println("<a href='index.html' >");
			 out.println("<h4>GO TO HOME PAGE </h4>");
			 out.println("</a>");
			 response.sendRedirect("index.html");
			 
 }
 
 
 
 
 
 
 %>

</body>
</html>