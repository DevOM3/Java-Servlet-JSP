<%-- 
    Document   : Home
    Created on : 22 Dec, 2020, 1:36:23 PM
    Author     : r
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="styles.css" rel="stylesheet" />
        <title>SumDigit</title>
    </head>
    <body>
        <div class="container">
            <h1>Enter a Number</h1>
            <form method="GET" action="Sum">
                <input type="number" name="number"/>
                <button type="submit" id="submit">SUBMIT</button>
            </form>
        </div>
    </body>
</html>
