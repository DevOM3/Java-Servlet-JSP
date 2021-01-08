package pkg;

import pkg.StudentInfo;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class StudentInfoProcessor extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id;
        String name;
        long phno;
        int sem;
        int marks;
        double percentage;
        
        id = Integer.parseInt(request.getParameter("id"));
        name = request.getParameter("name");
        phno = Long.parseLong(request.getParameter("phno"));
        sem = Integer.parseInt(request.getParameter("sem"));
        marks = Integer.parseInt(request.getParameter("marks"));
        percentage = Double.parseDouble(request.getParameter("percentage"));
        
        StudentInfo studentInfo = new StudentInfo(id, name, phno, sem, marks, percentage);
        
        ServletContext servletContext = request.getServletContext();
        servletContext.setAttribute("student_info", servletContext);
        
        response.sendRedirect("../../studentInfo.jsp");
    }

}
