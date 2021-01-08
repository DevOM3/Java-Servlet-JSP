/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author r
 */
public class DataProcessor extends HttpServlet {
     
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        
        String name = (String)request.getParameter("name");
        String email = (String)request.getParameter("email");
        String phno = request.getParameter("phno");
        String age = request.getParameter("age");
        String gender = (String)request.getParameter("gender");
        
        HttpSession session = request.getSession();
        session.setAttribute("name", name);
        session.setAttribute("email", email);
        session.setAttribute("phno", phno);
        session.setAttribute("age", age);
        session.setAttribute("gender", gender);
        
        response.sendRedirect("output.jsp");
    }

}
