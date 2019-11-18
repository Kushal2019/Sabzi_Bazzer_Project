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
          <form>
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
                <input type="number" class="form-control" id="product_quantity" name="product_quantity" aria-label="Text input with dropdown button" placeholder="Number of Quantity">
              <div class="input-group-append">
                     <select class="form-control" id="product_quantity_type" name="product_quantity_type">
                        <option class="hidden" selected disabled value="">Quantity-type</option>
                        <option value="kg">Kilogram (k.g)</option>
                        <option value="ps">Piece</option>
                        <option value="gm">Gram (g.m)</option>
                    </select>
              </div>
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
                <textarea class="form-control" id="product_desc" name="product_des" rows="3" placeholder="Describe Your Product..."></textarea>
                <span style="color:red;" id="e6"></span>
            </div>  
            
              <div class="form-group">
                  <input type="submit" class="btn btn-info" id="Sub_button" value="Submit Details" onclick="return product_val()">
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