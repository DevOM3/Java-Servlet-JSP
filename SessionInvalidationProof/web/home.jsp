<%-- 
    Document   : home
    Created on : 23 Dec, 2020, 6:12:43 PM
    Author     : r
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Session Invalidation Proof</title>
    </head>
    <body>
        <h1>Enter your Data</h1>
        <form method="GET" action="Servlet1">
            Name &nbsp;&nbsp;&nbsp;: <input type="text" name="name"/>
            En. No.: <input type="number" name="enroll"/>
            <button type="submit" >Submit</button>
        </form>
    </body>
</html>
