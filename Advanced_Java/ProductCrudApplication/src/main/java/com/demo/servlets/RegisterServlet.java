package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;

import com.demo.bean.MyUser;
import com.demo.service.RegisterService;
import com.demo.service.RegisterServiceImpl;

public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws IOException, ServletException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String uname = req.getParameter("uname");
        String email = req.getParameter("email");
        String pass = req.getParameter("pass");
        String role = req.getParameter("role");

        MyUser user = new MyUser(uname, email, role);
        RegisterService rservice = new RegisterServiceImpl();
        boolean success = rservice.registerUser(user, pass);

        if (success) {
            out.println("<h2>Registration Successful!</h2>");
            RequestDispatcher rd = req.getRequestDispatcher("Login.html");
            rd.include(req, res);
        } else {
            out.println("<h2>Registration Failed!</h2>");
            RequestDispatcher rd = req.getRequestDispatcher("register.html");
            rd.include(req, res);
        }
    }
}
