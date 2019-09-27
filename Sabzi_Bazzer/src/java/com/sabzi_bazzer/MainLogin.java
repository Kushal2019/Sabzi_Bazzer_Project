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
 * @author Kushal
 */
public class MainLogin extends HttpServlet {

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
        try
        {
            String uid,pass,userType;
            
            uid=request.getParameter("Login_username");
            pass=request.getParameter("Login_password");
            ResultSet rs = new Database().CheckLogin(uid,pass);
            if(rs.next())
            {
                //valid 
                userType=rs.getString("user_type");
                HttpSession session=request.getSession();
                session.setAttribute("UserID", uid);
                session.setAttribute("UserType", userType);               
                if(userType.equals("USER"))
                {
                    //user
                    response.sendRedirect("User/index.jsp");
                }
                else
                {
                    if(userType.equals("SELLER"))
                    {
                        //Seller
                        response.sendRedirect("Seller/index.jsp");
                    }  
                    else
                    {
                        if(userType.equals("ADMIN"))
                        {
                            //Admin
                            response.sendRedirect("Admin/index.jsp");
                        }
                        else
                        {
                            //none of the above
                        }
                    }
                }
            }
            else
            {
                //invalid
                response.sendRedirect("Home/Mainlogin.jsp?error=1");
            }
            
        }
        catch(Exception ex){
         response.sendRedirect("Home/Mainlogin.jsp?error=2");
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
