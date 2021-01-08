<%-- 
    Document   : JSP1
    Created on : 30 Dec, 2020, 9:45:08 AM
    Author     : r
--%>

<%@page import="java.io.PrintWriter"%>
<%@page contentType="text/html" pageEncoding="UTF-8" errorPage="ErrorJSP.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            PrintWriter pw = response.getWriter();
            
            int a = 10;
            int b = 0;
            
            int c = a / b;
            
            pw.println("Quotient is " +  c);
        %>
    </body>
</html>
