<%-- 
    Document   : home
    Created on : 22 Dec, 2020, 5:17:04 PM
    Author     : r
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="style.css" rel="stylesheet"/>
        <title>Student Data</title>
    </head>
    <body>
        <div>
            <h1>Student Form</h1>
            <form method="GET" action="Servlet1">
                <input type="number" name="enroll" placeholder="Enrollment Number"/>
                <input type="text" name="name" placeholder="Name"/>
                <input type="number" name="subject1" placeholder="Marks for Subject 1"/>
                <input type="number" name="subject2" placeholder="Marks for Subject 2"/>
                <input type="number" name="subject3" placeholder="Marks for Subject 3"/>
                <input type="number" name="subject4" placeholder="Marks for Subject 4"/>
                <input type="number" name="subject5" placeholder="Marks for Subject 5"/>
                <button type="submit">SUBMIT</button>
            </form>
        </div>
    </body>
</html>
