<%-- 
    Document   : Result
    Created on : 22 Dec, 2020, 2:04:01 PM
    Author     : r
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="styles.css" rel="stylesheet" />
        <jsp:scriptlet>
            HttpSession httpSession = request.getSession();
            String number = String.valueOf(httpSession.getAttribute("number"));
            String sum = String.valueOf(httpSession.getAttribute("sum"));
        </jsp:scriptlet>
        <title>SumDigit</title>
    </head>
    <body>
        <div class="container">
            <p>Result for <h3><%= number %></h3></p>
            <h1><%= sum %></h1>
            <form action="Sum" method="GET">
                <button type=submit" name="back" id="back">Back</button>
            </form>
        </div>
    </body>
</html>
