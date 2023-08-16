package by.it_class.controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "oneParameterServlet", urlPatterns = "/oneParam")
public class OneParameterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String parameter = req.getParameter("param");
        //resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.write("<h1>" + parameter + "</h1>");
    }
}
