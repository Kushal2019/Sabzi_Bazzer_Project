<%@page import="com.sabzi_bazzer.Database"%>
<%@page import="java.sql.ResultSet"%>
<%
    String e1=request.getParameter("q");
    String h1;
    ResultSet rs = new Database().CheckEmail(e1);
    if(rs.next())
    {
       h1="Good";
    }
    else
    {
        h1="Not Found";
    }
    out.println(h1);
%>
