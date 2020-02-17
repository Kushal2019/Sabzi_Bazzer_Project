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
public class User_update_Address extends HttpServlet {

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
            String house_number,street_number1,vill_town1,post_office1,police_station1,s_town,s_state,pin_code1,landmark1;
            String id= request.getParameter("id");
            house_number=request.getParameter("house_number2");
            street_number1=request.getParameter("street_number2");
            vill_town1=request.getParameter("vill_town2");
            post_office1=request.getParameter("post_office2");
            police_station1=request.getParameter("police_station2");
            s_town=request.getParameter("s_town2");
            s_state=request.getParameter("s_state2");
            pin_code1=request.getParameter("pin_code2");
            landmark1=request.getParameter("landmark2");
            HttpSession session=request.getSession();
           String s_name=session.getAttribute("UserID").toString();
           User_Address_val val=new User_Address_val();
           val.setEmail(s_name);
           val.setHouse_number(house_number);
           val.setStreet_number1(street_number1);
           val.setVill_town1(vill_town1);
           val.setPost_office1(post_office1);
           val.setPolice_station1(police_station1);
           val.setS_town(s_town);
           val.setS_state(s_state);
           val.setPin_code1(pin_code1);
           val.setLandmark1(landmark1);
           Database db= new Database();
           int x=db.updateUserAddress(val,id);
           if(x==1)
            {
            response.sendRedirect("User/Add_Address.jsp?edit=Done");
            }
            else
            {
            response.sendRedirect("User/Add_Address.jsp?edit=error1");
            }
          
        }
        catch(Exception ex)
            
        {
            response.sendRedirect("User/Add_Address.jsp?edit=error");
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
