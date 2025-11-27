package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;

import com.demo.service.ForgotPasswordService;
import com.demo.service.ForgotPasswordServiceImpl;

public class ForgotPasswordServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws IOException, ServletException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String uname = req.getParameter("uname");
        String email = req.getParameter("email");
        String newpass = req.getParameter("newpass");

        ForgotPasswordService fservice = new ForgotPasswordServiceImpl();
        boolean success = fservice.resetPassword(uname, email, newpass);

        if (success) {
            out.println("<h2>Password Reset Successful!</h2>");
            RequestDispatcher rd = req.getRequestDispatcher("Login.html");
            rd.include(req, res);
        } else {
            out.println("<h2>Password Reset Failed!</h2>");
            RequestDispatcher rd = req.getRequestDispatcher("forgotpassword.html");
            rd.include(req, res);
        }
    }
}
