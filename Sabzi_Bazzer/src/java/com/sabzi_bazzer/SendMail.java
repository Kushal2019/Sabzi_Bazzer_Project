/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sabzi_bazzer;

import java.io.IOException;  
import java.io.PrintWriter;  
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
  

/**
 *
 * @author SoumenPC
 */
public class SendMail extends HttpServlet {

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
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String emaiiId=request.getParameter("email");
             ResultSet rs = new Database().Forgotpassword(emaiiId);
             if(rs.next())
             {
                 String type=rs.getString("user_type");
                 if(type.equals("USER"))
                 {
                                                    ResultSet rs1 = new Database().getDetails(emaiiId);
                                                    if(rs1.next())
                                                    {
                                                        String to=emaiiId;  
                                                        String subject="Forgot Password";  
                                                        String msg="<html>\n" +
                                                                       "\n" +
                                                                       "<body>\n" +
                                                                       "<center>\n" +
                                                                       "	<table bgcolor=\"#ffcce6\">\n" +
                                                                       "		<tr>\n" +
                                                                       "			<td colspan=\"2\" width=\"400px\"><p class=\"navbar-brand\" style=\"font-family: Snap ITC; font-size: 28px;\"> Sabzi Bazzer </p></td>\n" +
                                                                       "		</tr>\n" +
                                                                       "		<tr bgcolor=\" #ffffff\">\n" +
                                                                       "			\n" +
                                                                       "			<td width=\"100px\" colspan=\"2\" align=\"Center\"><h3><u>Password:</u>  &nbsp;&nbsp; <font color=\"Blue\">"+rs1.getString("password")+"</font></h3></td>\n" +
                                                                       "			\n" +
                                                                       "		</tr>\n" +
                                                                       "		<tr>\n" +
                                                                       "			\n" +
                                                                       "			<td width=\"100px\" colspan=\"2\"><h4>Dear "+rs1.getString("first_name")+" "+rs1.getString("last_name")+"<br> Use the Password to Login <br> Your User ID: "+emaiiId+" </h4></td>\n" +
                                                                       "			\n" +
                                                                       "		</tr>\n" +
                                                                       "		<tr>\n" +
                                                                       "\n" +
                                                                       "			<td width=\"100px\" colspan=\"2\" align=\"right\"><h5>See You Soon <br>Team SabziBazzer </h5></td>\n" +
                                                                       "			\n" +
                                                                       "		</tr>\n" +
                                                                       "	</table>\n" +
                                                                       "</center>\n" +
                                                                       "</body>\n" +
                                                                       "</html>";

                                       Mailer.send(to, subject, msg);  

                                               out.print("message has been sent successfully");  
                                             response.sendRedirect("Home/Mainlogin.jsp?done=1");
                                                          }
                 }
                 if(type.equals("SELLER"))
                 {
                                        ResultSet rs2 = new Database().getDetails1(emaiiId);
                                                    if(rs2.next())
                                                    {
                                                        String to=emaiiId;  
                                                        String subject="Forgot Password";  
                                                        String msg="<html>\n" +
                                                                       "\n" +
                                                                       "<body>\n" +
                                                                       "<center>\n" +
                                                                       "	<table bgcolor=\"#ffcce6\">\n" +
                                                                       "		<tr>\n" +
                                                                       "			<td colspan=\"2\" width=\"400px\"><p class=\"navbar-brand\" style=\"font-family: Snap ITC; font-size: 28px;\"> Sabzi Bazzer </p></td>\n" +
                                                                       "		</tr>\n" +
                                                                       "		<tr bgcolor=\" #ffffff\">\n" +
                                                                       "			\n" +
                                                                       "			<td width=\"100px\" colspan=\"2\" align=\"Center\"><h3><u>Password:</u>  &nbsp;&nbsp; <font color=\"Blue\">"+rs2.getString("password")+"</font></h3></td>\n" +
                                                                       "			\n" +
                                                                       "		</tr>\n" +
                                                                       "		<tr>\n" +
                                                                       "			\n" +
                                                                       "			<td width=\"100px\" colspan=\"2\"><h4>Dear"+rs2.getString("first_name")+" "+rs2.getString("last_name")+" <br> Use the Password to Login <br> Your User ID: "+emaiiId+" </h4></td>\n" +
                                                                       "			\n" +
                                                                       "		</tr>\n" +
                                                                       "		<tr>\n" +
                                                                       "\n" +
                                                                       "			<td width=\"100px\" colspan=\"2\" align=\"right\"><h5>See You Soon <br>Team SabziBazzer </h5></td>\n" +
                                                                       "			\n" +
                                                                       "		</tr>\n" +
                                                                       "	</table>\n" +
                                                                       "</center>\n" +
                                                                       "</body>\n" +
                                                                       "</html>";

                                       Mailer.send(to, subject, msg);  

                                               out.print("message has been sent successfully");  
                                             response.sendRedirect("Home/Mainlogin.jsp?done=1");
                                                          }
                 }
    
        }
             else
             {
              response.sendRedirect("Home/Mainlogin.jsp?error=3");
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(SendMail.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(SendMail.class.getName()).log(Level.SEVERE, null, ex);
        }
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
