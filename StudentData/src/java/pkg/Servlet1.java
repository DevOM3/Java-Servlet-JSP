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
public class Servlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession httpSession = request.getSession();
        httpSession.setAttribute("enroll", Integer.parseInt(request.getParameter("enroll")));
        httpSession.setAttribute("name", request.getParameter("name"));
        httpSession.setAttribute("subject1", Integer.parseInt(request.getParameter("subject1")));
        httpSession.setAttribute("subject2", Integer.parseInt(request.getParameter("subject2")));
        httpSession.setAttribute("subject3", Integer.parseInt(request.getParameter("subject3")));
        httpSession.setAttribute("subject4", Integer.parseInt(request.getParameter("subject4")));
        httpSession.setAttribute("subject5", Integer.parseInt(request.getParameter("subject5")));
        
        response.sendRedirect("Servlet2");
    }
}
