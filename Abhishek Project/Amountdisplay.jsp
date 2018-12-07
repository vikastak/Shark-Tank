<%@page language="java" import="connectionpackage.*,servletpackage.*,java.util.*" contentType="text/html;charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Frameset//EN" "http://www.w3.org/TR/html4/frameset.dtd">
<html>
<head>
<meta http-equiv="Content-Type"content="text/html; charset=ISO-8859-1">
<title>Display the Amount</title>
</head>
<body>
<%
ArrayList Alist1=(ArrayList) request.getAttribute("Alist");
for(int i=0;i<Alist1.size();i++){
	Amount s1 = (Amount) Alist1.get(i);
%>
<table >
<tr>
<th>Row</th>
<th>Season</th>
<th>Series</th>
<th>Company</th>
<th>Deal</th>
<th>Industry</th>
<th>Gender</th>
<th>Amount</th>
</tr>
<tr>
<td><%=s1.getRow() %></td>
<td><%=s1.getSeason() %></td>
<td><%=s1.getSeries() %></td>
<td><%=s1.getCompany()%></td>
<td><%=s1.getDeal() %></td>
<td><%=s1.getIndustory() %></td>
<td><%=s1.getGender() %></td>
<td><%=s1.getAmount() %></td>
</tr>
</table>
<%} %>

</body>
</html>