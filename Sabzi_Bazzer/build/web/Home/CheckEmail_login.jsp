<%@page import="com.sabzi_bazzer.Database"%>
<%@page import="java.sql.ResultSet"%>
<%
    String e1=request.getParameter("q");
  
    ResultSet rs = new Database().CheckEmail(e1);
    if(rs.next())
    {
      out.println("<span class='tooltip11text' style='color:white;' id='aaa2' >Oke!</span>");
    }
    else
    {
        out.println("<span class='tooltip11text' style='color:red;' id='aaa2' >Wrong Email!</span>");
    }
   
%>
