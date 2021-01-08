<%-- 
    Document   : ErrorJSP
    Created on : 30 Dec, 2020, 9:45:21 AM
    Author     : r
--%>

<%@page import="java.io.PrintWriter"%>
<%@page contentType="text/html" pageEncoding="UTF-8" isErrorPage="true" %>
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
            
            pw.print("Exception is " + exception.getMessage());
        %>
    </body>
</html>
