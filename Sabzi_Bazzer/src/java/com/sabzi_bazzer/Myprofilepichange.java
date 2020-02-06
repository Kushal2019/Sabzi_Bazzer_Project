/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sabzi_bazzer;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
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

public class Myprofilepichange extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */    private static final String UPLOAD_DIR = "image/Seller_pic";
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String profilepic="";
             HttpSession session=request.getSession();
             String s_name=session.getAttribute("UserID").toString();
             List<String> photos = Test_helper.uploadFile1(UPLOAD_DIR, request,"product_file",s_name);
             for(String s:photos)
             {
                 profilepic=s;
             }
            
             Database db=new Database();
             /*ResultSet rs = new Database().Sellerprofilepic(s_name);
             if(rs.next())
             {
                 String path="D:\\Minor Project\\Sabzi_Bazzer_Project\\Sabzi_Bazzer\\build\\web\\image\\Seller_pic"+rs.getString("profilepic");
                   File f=new File(path);
                    f.delete();
             }*/
             int x=db.UpdateSellerprofilepic(profilepic,s_name);
             if(x==1)
             {
                 
                  response.sendRedirect("Seller/my_profile.jsp?Update=Done");
             }
             else
             {
                  response.sendRedirect("Seller/my_profile.jsp?Update='NotDone'");
             }
             out.println("hi");
        }
        catch(Exception ex)
        {
         response.sendRedirect("Seller/my_profile.jsp?Update='NotDone'");
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
