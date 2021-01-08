<%-- 
    Document   : home
    Created on : 21 Dec, 2020, 7:27:15 PM
    Author     : r
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <h1>FIll the form</h1>
        <form action="DataProcessor" method="GET">
            Enter your Name: <input type="text" name="name" />
            Enter your Email: <input type="email" name="email" />
            Enter your Ph. No.: <input type="number" name="phno" />
            Enter your Age: <input type="number" name="age" />
            Enter your Gender: <input type="text" name="gender" />
            <button type="submit" >Submit</button>
        </form>
    </body>
</html>
