/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sabzi_bazzer;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author SoumenPC
 */
public class Addtocart2 extends HttpServlet {

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
           String id=request.getParameter("id");
           String q=request.getParameter("q");
                     HttpSession session=request.getSession();
                     String email=session.getAttribute("UserID").toString();
                     String userType=session.getAttribute("UserType").toString();
                    ResultSet rs = new Database().Productdetails1(id);  
                    if(rs.next())
                    {
                         ResultSet rs1= new Database().Cartdetails2(email,id);
                         if(!rs1.next())
                         {
                            int x= new Database().Addcart(rs,email,q);
                            if(x==1)
                            {
                               if(userType.equals("USER"))
                               {
                                //user
                                    response.sendRedirect("User/View_Cart.jsp?Addcart=done");
                                }
                                 else
                                 {
                                         if(userType.equals("SELLER"))
                                         {
                    //Seller
                                             response.sendRedirect("Seller/View_Cart.jsp?Addcart=done");
                                         }  
                                     
                                }
                            }
                             
                        }
                        else
                        {   
                            if(userType.equals("USER"))
                             {
                                //user
                                response.sendRedirect("User/View_Cart.jsp");
                             }
                             else
                            {
                                      if(userType.equals("SELLER"))
                                         {
                    //Seller
                                             response.sendRedirect("Seller/View_Cart.jsp");
                                         }  
                                    
                            }
                        }
                 }
                    
        
        }
        catch(Exception a){}
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
