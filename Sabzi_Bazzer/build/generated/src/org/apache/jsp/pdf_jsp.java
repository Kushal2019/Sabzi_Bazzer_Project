package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pdf_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");



//response.setCharacterEncoding("utf-8");
//response.setHeader("Content-Transfer-Encoding", "binary");
//response.setHeader("Content-Type", "application/pdf");
response.setContentType("application/pdf");
response.setHeader("content-disposition", "attachment;filename=Donation Report.pdf");

      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>certificateword</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <h1></h1>\n");
      out.write("     <style> \n");
      out.write(".crtf_div{width:900px; height:auto; text-align:center; font-family:Arial, Helvetica, sans-serif; border:1px solid #000; padding:25px 0px;}\n");
      out.write(".crtf_div p{width:850px; height:auto; margin:20px 25px; text-align:justify; font-size:14px;}\n");
      out.write(".crtf_head{width:900px; height:auto; text-align:center; font-size:16px; font-weight:bold;}\n");
      out.write(".crtf_head .head_small{font-size:12px;}\n");
      out.write("\n");
      out.write(".crtf_table{width:850px; height:auto; margin:10px 25px; border:1px solid #000; text-align:left; font-size:14px;}\n");
      out.write(".crtf_table tr td input{width:670px; height:20px; border:0px;}\n");
      out.write(".crtf_table tr td textarea{width:670px; height:50px; border:0px;}0\n");
      out.write("\n");
      out.write("\n");
      out.write(".crtf_list{width:auto; height:auto; margin:10px 25px; text-align:justify; font-size:14px;}\n");
      out.write(".crtf_list ol li{width:auto; height:auto; margin-bottom:10px;}\n");
      out.write("</style>\n");
      out.write(" <center>\n");
      out.write("  <div class=\"crtf_div\">\n");
      out.write("<Div class=\"crtf_head\">Office of the <br />\n");
      out.write("Director of Income Tax (E),<br />\n");
      out.write("3rd Floor, Aaykar Bhawan,<br />\n");
      out.write("District Centre Laxmi Nagar, Delhi - 110092<br />\n");
      out.write("<div class=\"head_small\">Tel. No. 011-2055545, 22054777</div>\n");
      out.write("</Div>\n");
      out.write("<br />\n");
      out.write("\n");
      out.write("<table class=\"crtf_table\" style=\"border:0px; text-align:center;\">\n");
      out.write("<tr>\n");
      out.write("    <td>NQ.DIT (E) I 2013-14/</td>\n");
      out.write("    <td>DEL - XXXXXXX XXXXXXXX</td>\n");
      out.write("    <td>Dated &nbsp; &nbsp; &nbsp; &nbsp; 05/05/2014</td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("<table class=\"crtf_table\" border=\"1\" cellspacing=\"0\" cellpadding=\"5\">\n");
      out.write("<tr>\n");
      out.write("  <td width=\"150\">NAME</td>\n");
      out.write("  <td ><input type=\"text\" name=\"name\" value=\" \"/></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("  <td>ADDRESS</td>\n");
      out.write("  <td><textarea name=\"add\" rows=\"4\" cols=\"20\" value=\" \"></textarea></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("    <td>Legal Status</td>\n");
      out.write("    <td><input type=\"text\" name=\"lstatus\" value=\"----\"/></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("    <td>PAN NO. </td>\n");
      out.write("    <td><input type=\"text\" name=\"pan\" value=\"XXXXX\"/></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("    <td>GIR NO.</td>\n");
      out.write("    <td><input type=\"text\" name=\"gir\" value=\"XXXX-XXXX\"/></td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("<p><b>Sub :- ORDER UNDER SECTION 80G (5)(vi) OF THE INCOME TAX ACT, 1961</b></p>\n");
      out.write("<p>&nbsp; &nbsp; &nbsp; On verification of the facts stated before me/hearing before me, I have come to the conclusion that this organization satisfies the conditions u/s 80G of .the Income Tax act, 1961. The institution/Fund is granted approval subject to the following conditions--</p>\n");
      out.write("\n");
      out.write("<div class=\"crtf_list\">\n");
      out.write("    <ol type=\"i\">\n");
      out.write("    <li>The Donee institution shall forfeit this benefit provided under the law, if any of the conditions stated herein is not \n");
      out.write("    complied with/abused/whittled down or in any way violated.</li>\n");
      out.write("    <li>This exemption is valid for the period from A.Y.2013-14 onwards till it is rescinded    and subject to the following conditions</li>\n");
      out.write("</ol>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<p><b>Conditions:</b></p>\n");
      out.write("\n");
      out.write("<div class=\"crtf_list\">\n");
      out.write("<ol type=\"i\">\n");
      out.write("    <li>You shall maintain your accounts regularly and also get them audited to comply with sec. 80G (5)(iv) read with section 12A(b) \n");
      out.write("    and 12A(c) and submit the same before the assessing officer by the due date as per section 139-(t) of the Income tax Act 1961.</li>\n");
      out.write("    <li> Every receipt issued to donor shall bear the number and date; of this order and shall state the date up to which this \n");
      out.write("    certificate is valid from   A.Y.2013-14 onwards till it is rescinded.</li>\n");
      out.write("    <li> No change in the deed of the trust/association shall be affected without the due procedure of Law and its intimation \n");
      out.write("    shall be given immediately to this office.</li>\n");
      out.write("    <li> The approval to the institution/fund shall aroply to the donations received only if the fund/institution, established \n");
      out.write("    in India for charitable purpose, fulfills the conditions as laid down in section 80G(i), (ii), (iii), (iv) & (v) of the Income Tax Act 1961.</li>\n");
      out.write("    <li> This office and the assessing officer shall also be informed about the managing trustees or Manager of your Trust/Society/Non Profit \n");
      out.write("    Company and the places where the activities of the Trust/Institution are undertaken/likely to be undertaken to satisfy the claimed objects.</li>\n");
      out.write("    <li> You shall file the return of income of liour fund/institution as per section  139(1)/(4A)/(4C) of the Income Tax Act.</li>\n");
      out.write("</ol>\n");
      out.write("</div>\n");
      out.write("<br /><br />\n");
      out.write("\n");
      out.write(" <table class=\"crtf_table\" style=\"border:0px; line-height:20px;\">\n");
      out.write("<tr>\n");
      out.write("    <td><b>Copy to:</b><br />\n");
      out.write("    1. The applicant as above<br />\n");
      out.write("    2. The Assessing Officer\n");
      out.write("    </td>\n");
      out.write("    <td style=\"float:right; text-align:center;\"><br />\n");
      out.write("    Director of Income Tax (Exemption)<br />\n");
      out.write("    DELHI<br /><br /><br />\n");
      out.write("    <br />\n");
      out.write("    Income Tax Officer (Exemption) (Hqrs.)<br />\n");
      out.write("    For Director of Income Tax (Exemption) DELHI\n");
      out.write("    </td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write(" <p>As it is a computer generated letter, No signature is required</p>\n");
      out.write("\n");
      out.write(" </div>\n");
      out.write(" </center><br><br>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("  </html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
