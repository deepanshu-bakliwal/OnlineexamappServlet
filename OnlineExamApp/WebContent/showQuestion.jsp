<%@page import="com.lti.training.exam.servletjsp.Question"%>
<%@page import="com.lti.training.exam.servletjsp.Option"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>	
<form action="CalculateScoreServlet" method="post">
<%
		Question q = (Question) session.getAttribute("currentQs");
		Integer qNo = (Integer) session.getAttribute("qNo");
%>
	<h1>Q.<%=qNo +1%><%=q.getQuestion()%></h1>
<%
	    int opNo = 0;
		List<Option> options = q.getOptions();
		for(Option  op:options){
%>  <input type="radio" name="op" value="<%= opNo++ %>"/>
	   <%= op.getOption() %></br>
<% 
}
%>
<button type ="submit"  >Next</button>
</form>
</body>
</html>