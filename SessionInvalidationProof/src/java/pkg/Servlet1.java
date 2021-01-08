/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author r
 */
public class Servlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession httpSession = request.getSession();
        ServletContext servletContext = request.getServletContext();
        
        httpSession.setAttribute("name", request.getParameter("name"));
        httpSession.setAttribute("enroll", request.getParameter("enroll"));
        
        servletContext.setAttribute("name", request.getParameter("name"));
        servletContext.setAttribute("enroll", request.getParameter("enroll"));
        
        response.sendRedirect("Servlet2");
    }
}
