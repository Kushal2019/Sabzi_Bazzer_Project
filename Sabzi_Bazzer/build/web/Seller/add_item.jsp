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
%>
<html>
<head>

  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.1/css/all.css">
  <link href="https://fonts.googleapis.com/css?family=Nunito:400,600|Open+Sans:400,600,700" rel="stylesheet">
  <link rel="stylesheet" href="../Css/Seller_Style.css">
  <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.3/Chart.bundle.min.js"></script>
  <script src="../Javascript/Seller_Style.js"></script>
  <script src="../Javascript/Seller_Product_validation.js"></script>
  <title>Add Item</title>
</head>

<body>
  <div class="dash">
    <%@include file="pageFiles/Seller_SidePanel.jsp" %>

    <div class="dash-app">

      <%@include file="pageFiles/Seller_TopToolbar.jsp" %>
      <main class="dash-content">
        <div class="container">
          <h1> ---------Product Details--------- </h1>
          <form method="POST" action="../Seller_AddProduct" enctype="multipart/form-data">
            <div class="form-group">
                <label for="Name">Product Name : </label>
                <input type="name" class="form-control" id="product_name" name="product_name" placeholder="Product">
                <span style="color:red;" id="e1"></span>
            </div>
                       
            <div class="form-group">
                <label for="exampleFormControlFile1">Upload Picture : </label>
                <input type="file" class="form-control-file" value="" id="product_file" name="product_file">
                <span style="color:red;" id="e2"></span>
            </div>
              

            <div class="input-group">
                <div class="input-group-append">
                     <select class="form-control" id="product_quantity_type" name="product_quantity_type">
                        <option class="hidden" selected disabled value="">Quantity-type</option>
                        <option value="200gm"> 200 g.m </option>
                        <option value="250gm"> 250 g.m </option>
                        <option value="500gm"> 500 g.m </option>
                        <option value="1kg"> 1 k.g </option>
                        <option value="1.5kg"> 1.5 k.g </option>
                        <option value="2kg"> 2 k.g </option>
                        <option value="5kg"> 5 k.g </option>
                        <option value="10kg"> 10 k.g </option>
                        <option value="250ml"> 250 m.l </option>
                        <option value="500ml"> 500 m.l </option>
                        <option value="1L"> 1 L. </option>
                        <option value="5L"> 5 L. </option>
                        <option value="10L"> 10 L. </option>
                        <option value="1piece"> 1 Piece </option>
                        <option value="5piece"> 5 Piece </option>
                        <option value="10piece"> 10 Piece </option>
                    </select>
                </div>
                <input type="number" class="form-control" id="product_quantity" name="product_quantity" aria-label="Text input with dropdown button" placeholder="Number of Quantity">
                <span style="color:red;" id="e3"></span>
            </div>   
            <div class="form-group">
                <label for="Number">Price : </label>
                <input type="number" class="form-control" id="product_price" name="product_price" placeholder="Price">
                <span style="color:red;" id="e4"></span>
            </div>
            
            <div id="Exp_date">
                <label for="start" id="date_lable">Expiry date:</label>
                <input type="date" id="product_Expdate" name="product_Expdate">
                
            </div>
              <span style="color:red;" id="e5"></span>
            <div class="form-group purple-border">
                <label for="exampleFormControlTextarea4">Description</label>
                <textarea class="form-control" id="product_desc" name="product_desc" rows="3" placeholder="Describe Your Product..."></textarea>
                <span style="color:red;" id="e6"></span>
            </div>  
            
              <div class="form-group">
                  <input type="submit" class="btn btn-info" id="Sub_button" value="Submit Details" onclick="return product_val()">
                  <input type="reset" class="btn btn-info" id="res_button" value="Reset">
            </div> 
           </form>
         
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