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

/**
 *
 * @author r
 */
public class PrimeChecker extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        int num = Integer.parseInt(request.getParameter("number"));
        
        int i;
        boolean divided = false;
        
        for(i=2; i<num; i++) {
            if(num % i == 0) {
                divided = true;
                break;
            }
        }
        
        if(divided) {
            pw.println("<center><h2>" + num + " is Not Prime</center></h2>");
        } else {
            pw.println("<center><h2>" + num + " is Prime</center></h2>");
        }
        
    }

}
