package com.test.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "UserServlet ", value = "/UserServlet ")
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("aabbddccddddd");
        String action = request.getParameter("action");
        if("login_input".equals(action)) {
            System.out.println("aabbddccdd");
            request.getRequestDispatcher("/login.jsp").forward(request , response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");

        String action = request.getParameter("action");
        if("login_input".equals(action)) {
            System.out.println("aabbddccdd");
            request.getRequestDispatcher("/login.jsp").forward(request , response);
        } else if("login".equals(action)) {
            String name = request.getParameter("name");
            String password = request.getParameter("password");

            System.out.println("name->" + name + ",password->" + password);
        }
    }
}
