<%
    try
    {
        String utype=session.getAttribute("UserType").toString();
        String uname=session.getAttribute("UserID").toString();
        if(utype.equals("USER") && !uname.equals(""))
        {
           response.sendRedirect("../User/index.jsp"); 
        }
        else
        {
            if(utype.equals("ADMIN"))
            {
                response.sendRedirect("../Admin/index.jsp");
            }
            else
            {
               if(utype.equals("SELLER"))
            {
               // response.sendRedirect("../Seller/index.jsp");
            } 
            }
        }
    }
    catch(Exception ex)
    {
        response.sendRedirect("../index.jsp");
    }
%><%-- 
    Document   : Product_List
    Created on : 8 Nov, 2019, 11:31:09 AM
    Author     : Kushal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.1/css/all.css">
  <link href="https://fonts.googleapis.com/css?family=Nunito:400,600|Open+Sans:400,600,700" rel="stylesheet">
  <link rel="stylesheet" href="../Css/Seller_Style.css">
  <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.3/Chart.bundle.min.js"></script>
  <script src="../Javascript/Seller_Style.js"></script>
  <script src="../Javascript/Seller_Product_validation.js"></script>
  <title>All Item</title>
</head>

<body>
  <div class="dash">
    <%@include file="pageFiles/Seller_SidePanel.jsp" %>
    <div class="dash-app">
      <%@include file="pageFiles/Seller_TopToolbar.jsp" %>     
      <main class="dash-content">
        <div>
          <table class="table table-dark table-striped">
            <thead>
              <tr>
                <th>House_Number</th>
                <th>Vill/Town</th>
                <th>Police Station</th>
                <th>District</th>
                <th>State</th>
                <th>Pin</th>
                <th>Landmark</th>
                <th>Activity <button type="button" class="btn btn-primary" data-toggle="modal"
                    data-target=".cd-example-modal-xl" onclick="">Add Address</button></th>
              </tr>
            </thead>
        </div>

      </main>
      
    </div>
  </div>
         
  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
  <script src="../Javascript/Admin_Style.js"></script>
</body>
</html>