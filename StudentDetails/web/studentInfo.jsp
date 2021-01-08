<%-- 
    Document   : studentInfo.jsp
    Created on : 19 Dec, 2020, 7:44:37 PM
    Author     : r
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Info</title>
    </head>
    <body>
        <jsp:scriptlet>
            ServletContext servletContext = request.getServletContext();
            pkg.StudentInfo studentInfo = (pkg.StudentInfo)servletContext.getAttribute("student_info");
        </jsp:scriptlet>
        <p class="container">
            Student ID is <b><%= studentInfo.getId()%></b> <br><br>
            Student Name is <b><%= studentInfo.getName()%></b> <br><br>
            Student Ph. no. is <b><%= studentInfo.getPhno()%></b> <br><br>
            Student Semester is <b><%= studentInfo.getSem()%></b> <br><br>
            Student Total Marks is <b><%= studentInfo.getMarks()%></b> <br><br>
            Student Percentage is <b><%= studentInfo.getPercentage()%></b> <br><br>
        </p>
    </body>
</html>
