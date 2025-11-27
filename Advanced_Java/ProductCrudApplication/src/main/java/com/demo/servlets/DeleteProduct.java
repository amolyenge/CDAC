package com.demo.servlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;

public class DeleteProduct extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws IOException, ServletException {

        int pid = Integer.parseInt(req.getParameter("pid"));
        ProductService pservice = new ProductServiceImpl();
        boolean status = pservice.deleteById(pid);

        if (status) {
            RequestDispatcher rd = req.getRequestDispatcher("showproduct");
            rd.forward(req, res);
        } else {
            res.getWriter().println("<h3>Error: Product with ID " + pid + " could not be deleted.</h3>");
            RequestDispatcher rd = req.getRequestDispatcher("showproduct");
            rd.include(req, res);
        }
    }
}
