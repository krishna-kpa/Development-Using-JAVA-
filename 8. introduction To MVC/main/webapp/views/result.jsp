<%@page language="java"%>
<html>
<body>
<%-- for add --%>
<h2>Result is : <%=session.getAttribute("result")%></h2>
<%-- for sub and div with model --%>
<h2>Result is : ${result}</h2>
<%-- for mul with modelAttribute --%>
<h2>Result is : ${numComb}</h2>
</body>
</html>