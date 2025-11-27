package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.bean.Product;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;

public class ShowProduct extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        // Optional: session check
        // Object u = req.getSession(false) != null ? req.getSession(false).getAttribute("user") : null;
        // if (u == null) {
        //     out.println("<h3>Please login first.</h3>");
        //     out.println("<a href='Login.html'>Go to Login</a>");
        //     return;
        // }

        ProductService pservice = new ProductServiceImpl();
        List<Product> plist = pservice.getAllProducts();

        out.println("<h2>Product List</h2>");
        if (plist != null && !plist.isEmpty()) {
            out.println("<table border='2'><tr><th>Id</th><th>Name</th><th>Qty</th><th>Price</th><th>Exp Date</th><th>Cid</th><th>Action</th></tr>");
            for (Product p : plist) {
                out.println("<tr>");
                out.println("<td>" + p.getPid() + "</td>");
                out.println("<td>" + p.getPname() + "</td>");
                out.println("<td>" + p.getQty() + "</td>");
                out.println("<td>" + p.getPrice() + "</td>");
                out.println("<td>" + p.getExpdate() + "</td>");
                out.println("<td>" + p.getCid() + "</td>");
                out.println("<td><a href='deleteproduct?pid=" + p.getPid() + "'>Delete</a> / "
                        + "<a href='editproduct?pid=" + p.getPid() + "'>Edit</a></td>");
                out.println("</tr>");
            }
            out.println("</table>");
        } else {
            out.println("<p>No products available.</p>");
        }

        out.println("<br/><a href='addproduct.html'>Add new product</a>");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        doPost(req, res);
    }
}
