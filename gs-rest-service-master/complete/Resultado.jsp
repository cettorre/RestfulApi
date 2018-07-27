<%@page import="hello.GreetingController"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

https://www.mkyong.com/spring-boot/spring-boot-hello-world-example-jsp/
src/main/webapp/WEB-INF/jsp/welcome.jsp
option0:<%= GreetingController.getResult().getOption0() %>
option1:<%= GreetingController.getResult().getOption1() %>
option2:<%= GreetingController.getResult().getOption2() %>
option3:<%= GreetingController.getResult().getOption3() %>
option4:<%= GreetingController.getResult().getOption4() %>
option5:<%= GreetingController.getResult().getOption5() %>
option6:<%= GreetingController.getResult().getOption6() %>
option7:<%= GreetingController.getResult().getOption7() %>
option8:<%= GreetingController.getResult().getOption8() %>
option9:<%= GreetingController.getResult().getOption9() %>
option10:<%= GreetingController.getResult().getOption10() %>


</body>
</html>