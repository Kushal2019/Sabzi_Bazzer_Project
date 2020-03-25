<%-- 
    Document   : My_Order
    Created on : 18 Mar, 2020, 8:02:50 PM
    Author     : Kushal
--%>

<%@page import="java.util.regex.Pattern"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.sabzi_bazzer.Database"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>My Order</title>
    <link rel="stylesheet" href="../Css/User_Style.css">
    <link rel="stylesheet" href="../Css/My_Order_Style.css">

</head>

<body>
    <div class="dash">
        <%@include file="pageFiles//Seller_SidePanel.jsp" %>
        <div class="dash-app">
            <%@include file="pageFiles/Seller_TopToolbar.jsp" %>
            <main class="dash-content">
                <%
                        try{
                             String emaiiId=session.getAttribute("UserID").toString();
                              ResultSet rs=new Database().OrderDetails(emaiiId);
                              while(rs.next())
                              {
                                    ResultSet rs1=new Database().Productdetails5(rs.getString("product_id"));
                                    if(rs1.next()){
                                        String st=rs1.getString("product_image");
                                        Pattern pattern = Pattern.compile("-");
                                        String[] words;
                                        words = pattern.split(st);
                                       String  filepath=words[0]; 
                                        String Path="../image/Vegetables/" +filepath;
                %>
                
                <div class="container-fluid my-5 d-sm-flex justify-content-center">
                    <div class="card px-2">
                        <div class="card-header bg-white">
                            <div class="row justify-content-between">
                                <div class="col">
                                    <p class="text-muted"> Order ID <span
                                            class="font-weight-bold text-dark"><%=rs.getString("order_id")%></span></p>
                                    <p class="text-muted"> Place On <span class="font-weight-bold text-dark"><%=rs.getString("order_date")%></span> </p>
                                </div>
                                <div class="flex-col my-auto">
                                     <% 
                                if(rs.getString("order_status").equals("Cancel"))
                                {
                        %>
                         <h6 class="ml-auto mr-3"> <a href="../Remove_order?id=<%=rs.getString("order_id")%>">Remove</a> </h6>
                        <%}else{%>
                                    <h6 class="ml-auto mr-3"> <a href="../Cancel_Order?id=<%=rs.getString("order_id")%>">Cancel Order</a> </h6>
                        <%}%>
                                </div>
                            </div>
                        </div>
                        <div class="card-body">
                            <div class="media flex-column flex-sm-row">
                                <div class="media-body ">
                                    <h5 class="bold"><%=rs1.getString("product_name")%></h5>
                                    <p class="text-muted"> Qt: <%=rs.getString("quantity")%></p>
                                    <h4 class="mt-3 mb-4 bold"> <span class="mt-5">&#x20B9;</span> <%=rs.getString("amount")%> <span
                                            class="small text-muted"> via (<%=rs.getString("payment_method")%>) </span></h4>
                                    <p class="text-muted">Delivery on: <span class="Today"><%=rs.getString("delivery_date")%></span> </p>
                                </div> <img class="align-self-center img-fluid" src="<%=Path%>" width="180 " height="180">
                            </div>
                        </div>
                        <% 
                                if(rs.getString("order_status").equals("PLACED"))
                                {
                        %>
                        <div class="row px-2">
                            <div class="col">
                                <ul id="progressbar">
                                    <li class="step0 active" id="step1">PLACED</li>
                                    <li class="step0   text-center" id="step2">SHIPPED</li>
                                    <li class="step0 text-muted text-right" id="step3">DELIVERED</li>
                                </ul>
                            </div>
                        </div>
                        <% } %>
                        <% 
                                if(rs.getString("order_status").equals("SHIPPED"))
                                {
                        %>
                        <div class="row px-2">
                            <div class="col">
                                <ul id="progressbar">
                                    <li class="step0 active" id="step1">PLACED</li>
                                    <li class="step0 active  text-center" id="step2">SHIPPED</li>
                                    <li class="step0 text-muted text-right" id="step3">DELIVERED</li>
                                </ul>
                            </div>
                        </div>
                        <%}%>
                        <% 
                                if(rs.getString("order_status").equals("DELIVERED"))
                                {
                        %>
                        <div class="row px-2">
                            <div class="col">
                                <ul id="progressbar">
                                    <li class="step0 active" id="step1">PLACED</li>
                                    <li class="step0 active  text-center" id="step2">SHIPPED</li>
                                    <li class="step0 active text-muted text-right" id="step3">DELIVERED</li>
                                </ul>
                            </div>
                        </div>
                        <%}%>
                        <% 
                                if(rs.getString("order_status").equals("Cancel"))
                                {
                        %>
                        <div class="row px-2">
                            <div class="col">
                                <ul id="progressbar">
                                    <li class="step0 active1" id="step1">PLACED</li>
                                    <li class="step0 active1  text-center" id="step2">SHIPPED</li>
                                    <li class="step0 active1 text-muted text-right" id="step3">CANCELED</li>
                                </ul>
                            </div>
                        </div>
                        <%}%>
                    </div>
                </div>
                <%
                    }
                    }
                    }catch(Exception x){}
                %>
            </main>
        </div>
    </div>


    <script src="../Javascript/Admin_Style.js"></script>
</body>

</html>