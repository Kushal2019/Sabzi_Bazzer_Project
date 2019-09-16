/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sabzi_bazzer;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Soumen-Pc
 */
public class Registration_Seller1 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Registration_Seller1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Registration_Seller1 at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest1(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private void processRequest1(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
          PrintWriter out=  response.getWriter();
          String s_f_name,s_last_name,s_password,s_licence,s_email,s_phone,s_Company,s_state,s_town,s_zip,s_street,s_house,s_landmark,gender;
          s_f_name=request.getParameter("s_f_name");
          s_last_name=request.getParameter("s_f_name");
          s_password=request.getParameter("s_password");
          s_licence=request.getParameter("s_licence");
          s_email=request.getParameter("s_email");
          s_phone=request.getParameter("s_phone");
          s_Company=request.getParameter("s_Company");
          s_state=request.getParameter("s_state");
          s_town=request.getParameter("s_town");
          s_zip=request.getParameter("s_zip");
          s_street=request.getParameter("s_street");
          s_house=request.getParameter("s_house");
          s_landmark=request.getParameter("s_landmark");
          gender=request.getParameter("s_gender");
          Seller_value seller=new Seller_value();
          seller.setS_f_name(s_f_name);
          seller.setS_last_name(s_last_name);
          seller.setS_password(s_password);
          seller.setS_phone(s_phone);
          seller.setS_licence(s_licence);
          seller.setS_Company(s_Company);
          seller.setGender(gender);
          seller.setS_email(s_email);
          seller.setS_house(s_house);
          seller.setS_landmark(s_landmark);
          seller.setS_state(s_state);
          seller.setS_street(s_street);
          seller.setS_zip(s_zip);
          seller.setS_town(s_town);
          seller.setType("SELLER");
        } catch (Exception e) {
        }
    }

}