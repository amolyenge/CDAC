package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demo.bean.MyUser;
import com.demo.service.LoginService;
import com.demo.service.LoginServiceImpl;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws IOException, ServletException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String uname = req.getParameter("uname");
        String pass = req.getParameter("pass");

        LoginService lservice = new LoginServiceImpl();
        MyUser user = lservice.validateUser(uname, pass);

        if (user != null) {
            HttpSession session = req.getSession();
            session.setAttribute("user", user);

            RequestDispatcher rd = req.getRequestDispatcher("showproduct");
            rd.forward(req, res);
        } else {
            out.println("<h1>Invalid Credentials</h1>");
            RequestDispatcher rd = req.getRequestDispatcher("Login.html");
            rd.include(req, res);
        }
    }
}
