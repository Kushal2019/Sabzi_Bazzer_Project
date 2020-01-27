package com.sabzi_bazzer;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kushal
 */
public class Registration_User extends HttpServlet {

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
            out.println("<title>Servlet Registration_User</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Registration_User at " + request.getContextPath() + "</h1>");
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
        processRequest_post(request, response);
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

    private void processRequest_post(HttpServletRequest request, HttpServletResponse response) {
        try {
            PrintWriter out= response.getWriter();
            String fname,lname,pass,email,phone,ques,ans,gender;
            fname=request.getParameter("u_f_name");
            lname=request.getParameter("u_last_name");
            pass=request.getParameter("u_password");
            email=request.getParameter("u_email");
            phone=request.getParameter("txtEmpPhone");
            ques=request.getParameter("u_s_question");
            ans=request.getParameter("u_s_answer");
            gender=request.getParameter("u_gender");
            User_value user= new User_value();
            user.setFname(fname);
            user.setLname(lname);
            user.setEmail(email);
            user.setPass(pass);
            user.setPhone(phone);
            user.setGender(gender);
            user.setQues(ques);
            user.setAns(ans);
            user.setType("USER");
            Database db = new Database();
            int x=db.insertUser(user);
            if(x==1)
            {
//              db.insertLogindetails(user);
              int y=db.insertLogindetails(user);
                if(y==1)
                {
                    response.sendRedirect("Home/Mainlogin.jsp");
                }else
                {
                    response.sendRedirect("Home/Registration.jsp?Err=2");
                }
            }
            else
            {
                response.sendRedirect("Home/Registration.jsp?Err=1");
            }
                    
//            out.println(db.isConnected());
            
            
        } catch (IOException ex) {
            Logger.getLogger(Registration_User.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
