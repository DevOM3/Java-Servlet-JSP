<%-- 
    Document   : output
    Created on : 21 Dec, 2020, 6:47:21 PM
    Author     : r
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Output</title>
        <jsp:scriptlet>
            HttpSession sessionOut = request.getSession();
            String name = (String)sessionOut.getAttribute("name");
            String email = (String)sessionOut.getAttribute("email");
            String phno = (String)sessionOut.getAttribute("phno");
            String age = (String)sessionOut.getAttribute("age");
            String gender = (String)sessionOut.getAttribute("age");
        </jsp:scriptlet>
    </head>
    <body>
        <h1>User Data</h1>
        <h4>Name    : <%= name %></h4>
        <h4>Email   : <%= email%></h4>
        <h4>Ph. no. : <%= phno%></h4>
        <h4>Age     : <%= age%></h4>
        <h4>Gender  : <%= gender%></h4>
    </body>
</html>
