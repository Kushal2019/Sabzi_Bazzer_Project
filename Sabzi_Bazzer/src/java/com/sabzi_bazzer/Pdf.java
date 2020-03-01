/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sabzi_bazzer;

import com.itextpdf.text.Anchor;
import com.itextpdf.text.Chapter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Section;
import com.itextpdf.text.pdf.CMYKColor;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Date;
/**
 *
 * @author SoumenPC
 */
public class Pdf extends HttpServlet {

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
     
        
            /* TODO output your page here. You may use following sample code. */
           
      try
      {
         Document document = new Document(PageSize.A4, 50, 50, 50, 50);
         Anchor anchorTarget = new Anchor("First page of the document.");
      anchorTarget.setName("BackToTop");
      Paragraph paragraph1 = new Paragraph();
 
      paragraph1.setSpacingBefore(50);
 
      paragraph1.add(anchorTarget);
      document.add(paragraph1);
         PdfWriter writer = PdfWriter.getInstance(document,new FileOutputStream("D:/sou.pdf"));
         document.open();
        
       
        document.add(new Paragraph("Soumen Mondal Suman Dhara", 
        FontFactory.getFont(FontFactory.COURIER, 14, Font.BOLD, new CMYKColor(0, 255, 0, 0))));
        Paragraph title1 = new Paragraph("Chapter 1", 
 
   FontFactory.getFont(FontFactory.HELVETICA, 
    
   18, Font.BOLDITALIC, new CMYKColor(0, 255, 255,17)));
    
Chapter chapter1 = new Chapter(title1, 1);
       
chapter1.setNumberDepth(0);


Paragraph title11 = new Paragraph("This is Section 1 in Chapter 1", 
 
       FontFactory.getFont(FontFactory.HELVETICA, 16, Font.BOLD, 
    
       new CMYKColor(0, 255, 255,17)));
    
Section section1 = chapter1.addSection(title11);
 
Paragraph someSectionText = new Paragraph("This text comes as part of section 1 of chapter 1.");
 
section1.add(someSectionText);
 
someSectionText = new Paragraph("Following is a 3 X 2 table.");
 
section1.add(someSectionText);

PdfPTable t = new PdfPTable(3);
 
      t.setSpacingBefore(25);
       
      t.setSpacingAfter(25);
       
      PdfPCell c1 = new PdfPCell(new Phrase("Header1"));  
       
      t.addCell(c1);
       
      PdfPCell c2 = new PdfPCell(new Phrase("Header2"));
       
      t.addCell(c2);
       
      PdfPCell c3 = new PdfPCell(new Phrase("Header3"));
       
      t.addCell(c3);
       
      t.addCell("1.1");
       
      t.addCell("1.2");
       
      t.addCell("1.3");
       
      section1.add(t);
      Paragraph title2 = new Paragraph("Using Anchor", 
 
        FontFactory.getFont(FontFactory.HELVETICA, 16, Font.BOLD, 
 
        new CMYKColor(0, 255, 0, 0)));
 
section1.add(title2);
 
title2.setSpacingBefore(5000);
 
Anchor anchor2 = new Anchor("Back To Top");
 
anchor2.setReference("#BackToTop");
 
section1.add(anchor2);
      document.add(chapter1);
        document.close(); 

      } catch (DocumentException e)
      {
        // e.printStackTrace();
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
