<%-- 
    Document   : TagAccessor
    Created on : 30 Dec, 2020, 9:39:40 PM
    Author     : r
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="ctag" uri="/WEB-INF/tlds/newtag_library" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <ctag:myTag></ctag:myTag>
        <ctag:AttributedTagHandler type="password" required="<%= true %>" />
    </body>
</html>
