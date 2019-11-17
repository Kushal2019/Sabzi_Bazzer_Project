<html>
<head>

  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.1/css/all.css">
  <link href="https://fonts.googleapis.com/css?family=Nunito:400,600|Open+Sans:400,600,700" rel="stylesheet">
  <link rel="stylesheet" href="../Css/Seller_Style.css">
  <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.3/Chart.bundle.min.js"></script>
  <script src="../Javascript/Seller_Style.js"></script>
  
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
                <input type="name" class="form-control" id="Name" placeholder="Product">
            </div>
                       
            <div class="form-group">
                <label for="exampleFormControlFile1">Upload Picture : </label>
                <input type="file" class="form-control-file" id="exampleFormControlFile1">
            </div>
              

            <div class="input-group">
                <input type="text" class="form-control" aria-label="Text input with dropdown button" placeholder="Number of Quantity">
              <div class="input-group-append">
                     <select class="form-control">
                        <option class="hidden" selected disabled value="">Quantity-type</option>
                        <option value="What is your Birthdate?">Kilogram (k.g)</option>
                        <option value="What is Your old Phone Number">Piece</option>
                        <option value="What is your Pet Name?">Gram (g.m)</option>
                    </select>
              </div>
            </div>   
            <div class="form-group">
                <label for="Number">Price : </label>
                <input type="number" class="form-control" id="Name" placeholder="Price">
            </div>
            
            <div id="Exp_date">
                <label for="start" id="date_lable">Expiry date:</label>
                <input type="date" id="start" name="trip-start">
            </div>
            <div class="form-group purple-border">
                <label for="exampleFormControlTextarea4">Description</label>
                <textarea class="form-control" id="exampleFormControlTextarea4" rows="3" placeholder="Describe Your Product..."></textarea>
            </div>  
            
              <div class="form-group">
                <button type="submit" class="btn btn-info" id="Sub_button">Submit Details</button>
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