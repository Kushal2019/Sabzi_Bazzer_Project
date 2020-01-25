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
import java.util.Arrays;
import java.util.regex.Pattern;



/**
 *
 * @author SoumenPC
 */
@MultipartConfig(
	fileSizeThreshold = 1024 * 1024 * 100, // 100 MB
	maxFileSize = 1024 * 1024 * 500, // 500 MB
	maxRequestSize = 1024 * 1024 * 500 // 500 MB
)

public class Seller_AddProduct extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    private static final String UPLOAD_DIR = "image/Vegetables";
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
             
            String product_name,product_file ="", product_quantity, product_quantity_type, product_price, product_Expdate, product_desc;
            String[] pp;
            int i=0;
            pp= new String[100];
            List<String> photos = Test_helper.uploadFile(UPLOAD_DIR, request);
           for(String s:photos){
                
                pp[i]=s+"-";
                
                 product_file= product_file+ pp[i];
                 i++;
                    
            }; 
             Pattern pattern = Pattern.compile("-");
            String[] words;
           words = pattern.split(product_file);
           out.println(words[0]);
            product_name=request.getParameter("product_name");
            //out.println(product_name + " "+ product_file);
            product_quantity=request.getParameter("product_quantity");
            product_quantity_type=request.getParameter("product_quantity_type");
            product_price=request.getParameter("product_price");
            product_Expdate=request.getParameter("product_Expdate");
            product_desc=request.getParameter("product_desc");
            //out.println(product_name + " "+ product_file+ " "+ product_quantity+ " "+ product_quantity_type+ " "+ product_price+ " "+ product_Expdate+ " "+ product_desc);
            Product_value val=new Product_value();
            val.setProduct_name(product_name);
            val.setProduct_file(product_file);
            val.setProduct_quantity(product_quantity);
            val.setProduct_quantity_type(product_quantity_type);
            val.setProduct_price(product_price);
            val.setProduct_Expdate(product_Expdate);
            val.setProduct_desc(product_desc);
            Database db= new Database();
            HttpSession session=request.getSession();
            String s_name=session.getAttribute("UserID").toString();
            int x=db.insertProduct(val,s_name);
            if(x==1)
            {
            response.sendRedirect("Seller/add_item.jsp?done=1");
            }
            else
            {
            response.sendRedirect("Seller/add_item.jsp?err=1");
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
