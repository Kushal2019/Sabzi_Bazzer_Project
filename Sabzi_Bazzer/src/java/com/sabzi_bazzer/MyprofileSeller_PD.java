/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sabzi_bazzer;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;




/**
 *
 * @author SoumenPC
 */
@MultipartConfig(
	fileSizeThreshold = 1024 * 1024 * 100, // 100 MB
	maxFileSize = 1024 * 1024 * 500, // 500 MB
	maxRequestSize = 1024 * 1024 * 500 // 500 MB
)

/**
 *
 * @author SoumenPC
 */
public class MyprofileSeller_PD extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
     private static final String UPLOAD_DIR = "image/Seller_pic";
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           String first_name,last_name,profilepic,company_name,licence_number,email,ph_number;
             List<String> photos = Test_helper.uploadFile(UPLOAD_DIR, request,"product_file");
             for(String s:photos)
             {
                 profilepic=s;
             }
             first_name=request.getParameter("first_name");
             last_name=request.getParameter("last_name");
             profilepic=request.getParameter("profilepic");
             company_name=request.getParameter("company_name");
             licence_number=request.getParameter("licence_number");
             email=request.getParameter("email");
             ph_number=request.getParameter("ph_number");
             Seller_PD_val sellerval= new Seller_PD_val();
             sellerval.setFirst_name(first_name);
             sellerval.setLast_name(last_name);
             sellerval.setProfilepic(profilepic);
             sellerval.setCompany_name(company_name);
             sellerval.setLicence_number(licence_number);
             sellerval.setEmail(email);
             sellerval.setPh_number(ph_number);
             HttpSession session=request.getSession();
             String s_name=session.getAttribute("UserID").toString();
             Database db=new Database();
             int x=db.UpdateSeller_PD(sellerval,s_name);
             if(x==1)
             {
                  session.setAttribute("UserID", email);
                  response.sendRedirect("Seller/my_profile.jsp?Update='Done'");
             }
             else
             {
                  response.sendRedirect("Seller/my_profile.jsp?Update='NotDone'");
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
