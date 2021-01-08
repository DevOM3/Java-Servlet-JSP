<%-- 
    Document   : StudentREgistration
    Created on : 19 Dec, 2020, 7:46:10 PM
    Author     : r
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="./css/styles.css" rel="stylesheet" type="text/css">
        <title>Student Registration</title>
    </head>
    <body>
        <form action="StudentInfoProcessor" method="GET">
            <b class="container">
                Enter ID <input type="text" name="id" /> <br><br>
                Enter Name <input type="text" name="name" /> <br><br>
                Enter Mobile Number <input type="text" name="phno" /> <br><br>
                Enter Semester <input type="text" name="sem" /> <br><br>
                Enter Total Marks <input type="text" name="marks" /> <br><br>
                Enter Percentage <input type="text" name="percentage" /> <br><br>
                <input type="submit" value="SEND DATA" />
            </b>
        </form>
    </body>
</html>
