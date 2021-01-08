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
public class Servlet3 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter printWriter = response.getWriter();
        
        HttpSession httpSession = request.getSession();
        ServletContext servletContext = request.getServletContext();
        
        printWriter.println("<h3>Context Name: " + servletContext.getAttribute("name") + "</h3><br/>");
        printWriter.println("<h3>Context En. No.: " + servletContext.getAttribute("enroll") + "</h3><br/>");
        printWriter.println("<h3>Session Name: " + httpSession.getAttribute("enroll") + "</h3><br/>");
        printWriter.println("<h3>Session En. No.: " + httpSession.getAttribute("enroll") + "</h3><br/>");
    }
}
