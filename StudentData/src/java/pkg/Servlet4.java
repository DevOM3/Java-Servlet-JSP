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
public class Servlet4 extends HttpServlet {
protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        
        HttpSession httpSession = request.getSession();
        int enroll = Integer.parseInt(String.valueOf(httpSession.getAttribute("enroll")));
        String name = (String)httpSession.getAttribute("name");
        int subject1 = Integer.parseInt(String.valueOf(httpSession.getAttribute("subject1")));
        int subject2 = Integer.parseInt(String.valueOf(httpSession.getAttribute("subject2")));
        int subject3 = Integer.parseInt(String.valueOf(httpSession.getAttribute("subject3")));
        int subject4 = Integer.parseInt(String.valueOf(httpSession.getAttribute("subject4")));
        int subject5 = Integer.parseInt(String.valueOf(httpSession.getAttribute("subject5")));
        int total = Integer.parseInt(String.valueOf(httpSession.getAttribute("total")));
        double average = Double.parseDouble(String.valueOf(httpSession.getAttribute("average")));
        
        pw.println("<h2>Name              : " + name);
        pw.println("<h2>Enroll. No.       : " + enroll);
        pw.println("<h2>Marks of Subject 1: " + subject1);
        pw.println("<h2>Marks of Subject 2: " + subject2);
        pw.println("<h2>Marks of Subject 3: " + subject3);
        pw.println("<h2>Marks of Subject 4: " + subject4);
        pw.println("<h2>Marks of Subject 5: " + subject5);
        pw.println("<h2>Total Marks       : " + total);
        pw.println("<h2>Average of Marks  : " + average);
            
    }
}
