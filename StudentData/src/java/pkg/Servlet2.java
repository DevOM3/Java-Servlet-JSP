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
public class Servlet2 extends HttpServlet {
protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession httpSession = request.getSession();
        int subject1 = Integer.parseInt(String.valueOf(httpSession.getAttribute("subject1")));
        int subject2 = Integer.parseInt(String.valueOf(httpSession.getAttribute("subject2")));
        int subject3 = Integer.parseInt(String.valueOf(httpSession.getAttribute("subject3")));
        int subject4 = Integer.parseInt(String.valueOf(httpSession.getAttribute("subject4")));
        int subject5 = Integer.parseInt(String.valueOf(httpSession.getAttribute("subject5")));
        
        int totalMarks = subject1 + subject2 + subject3 + subject4 + subject5;
        httpSession.setAttribute("total", totalMarks);
        
        response.sendRedirect("Servlet3");
    }
}
