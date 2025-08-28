package com.mycompany.maventest;

import java.io.IOException;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/survey")
public class SurveyServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // lấy dữ liệu từ form
        String firstName = request.getParameter("firstName");
        String lastName  = request.getParameter("lastName");
        String email     = request.getParameter("email");
        String dob       = request.getParameter("dob");
        String hear      = request.getParameter("hear");
        String offers    = request.getParameter("offers");
        String emailoffers = request.getParameter("emailoffers");
        String contact   = request.getParameter("contact");

        // đưa dữ liệu sang JSP để hiển thị
        request.setAttribute("firstName", firstName);
        request.setAttribute("lastName", lastName);
        request.setAttribute("email", email);
        request.setAttribute("dob", dob);
        request.setAttribute("hear", hear);
        request.setAttribute("offers", offers);
        request.setAttribute("emailoffers", emailoffers);
        request.setAttribute("contact", contact);

        RequestDispatcher rd = request.getRequestDispatcher("thanks.jsp");
        rd.forward(request, response);
    }
}
