package com.test.web;

import com.test.web.Dao.daoBDIndepotDetail;
import com.test.web.vo.voBDIndepotDetail;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

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
        daoBDIndepotDetail IndepotDetail = new daoBDIndepotDetail();
        voBDIndepotDetail detail = new voBDIndepotDetail();
        ArrayList list = IndepotDetail.qryBDIndepotDetail();
        System.out.println(list);
        for(int i = 0; i<list.size(); i++) {
            voBDIndepotDetail s = (voBDIndepotDetail)list.get(i);
            System.out.println(s.getBarcodeNo());
            System.out.println(s.getGoodsName());
        }


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
