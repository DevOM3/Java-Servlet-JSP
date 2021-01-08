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
public class Sum extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if(request.getParameter("back") == null) {
            int sum = 0;
            int number = Integer.parseInt(request.getParameter("number"));
            char[] stringNumber = String.valueOf(number).toCharArray();
            int length = String.valueOf(number).length();
            byte[] digits = new byte[length];

            for(int i = 0; i < length; i++) {
                digits[i] = Byte.parseByte(String.valueOf(stringNumber[i]));
            }        
            for(int i = 0; i < length; i++) {
                sum += digits[i];
            }

            HttpSession httpSession = request.getSession();
            httpSession.setAttribute("number", number);
            httpSession.setAttribute("sum", sum);

            response.sendRedirect("Result.jsp");
        } else {
            response.sendRedirect("Home.jsp");
        }
    }
}
