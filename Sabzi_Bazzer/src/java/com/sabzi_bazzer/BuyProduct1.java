/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sabzi_bazzer;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.regex.Pattern;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author SoumenPC
 */
public class BuyProduct1 extends HttpServlet {

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
           String  id=request.getParameter("id");
            String Address=request.getParameter("Address");
            String   payment=request.getParameter("Payment");
            Pattern pattern = Pattern.compile(",");
            String[] words;
            words = pattern.split(id);
            String c_date1=new CurrentDate().C_date1();
           String tomorrow=new CurrentDate().tomorrowdate();
           String status="PLACED";
           int temp=0;
            for(int i=0;i<words.length;i++)
            {
                 ResultSet rs = new Database().cartlist(words[i]);
                 if(rs.next())
                 {
                     int x=new Database().InsertOrderDetails(rs.getString("user_id"),rs.getString("seller_name"),rs.getString("product_id"),rs.getString("qantity"),rs.getString("total"),Address,payment,c_date1,tomorrow,status);
                     temp=1;
                 }
            }
            if(temp==1)
            {
                response.sendRedirect("Home/My_Order.jsp");
            }
            else
            {
            response.sendRedirect("Checkout_AddtoCart.jsp?err=1");
            }
        }catch(Exception a){}
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
