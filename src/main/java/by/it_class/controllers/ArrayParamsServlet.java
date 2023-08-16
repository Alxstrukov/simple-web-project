package by.it_class.controllers;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

@WebServlet(name = "arrayParamsServlet", urlPatterns = "/arrayParams")
public class ArrayParamsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String[] params = req.getParameterValues("param");
        PrintWriter writer = resp.getWriter();
        Arrays.stream(params)
                .forEach(it->writer.write("<h1>" + it + "</h1>"));
    }
}
