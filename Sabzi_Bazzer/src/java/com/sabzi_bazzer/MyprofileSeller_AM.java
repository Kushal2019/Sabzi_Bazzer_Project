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
import javax.servlet.http.HttpSession;

/**
 *
 * @author SoumenPC
 */
public class MyprofileSeller_AM extends HttpServlet {

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
             String state,town,zip_code,street,house_number,landmark;
             state=request.getParameter("state1");
             town=request.getParameter("town");
             zip_code=request.getParameter("zip_code");
             street=request.getParameter("street");
             house_number=request.getParameter("house_number");
             landmark=request.getParameter("landmark");
             Seller_AM sellerval= new Seller_AM();
             sellerval.setState(state);
             sellerval.setTown(town);
             sellerval.setZip_code(zip_code);
             sellerval.setStreet(street);
             sellerval.setHouse_number(house_number);
             sellerval.setLandmark(landmark);
             HttpSession session=request.getSession();
             String s_name=session.getAttribute("UserID").toString();
             Database db=new Database();
             int x=db.UpdateSeller_AD(sellerval,s_name);
             if(x==1)
             {
                 
                  response.sendRedirect("Seller/my_profile.jsp?Update=M_Address");
             }
             else
             {
                  response.sendRedirect("Seller/my_profile.jsp?Update=Not_M_Address");
             }
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
        processRequest(request, response);
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

}
