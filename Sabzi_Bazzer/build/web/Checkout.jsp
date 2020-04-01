

<%@page import="java.sql.ResultSet"%>
<%@page import="com.sabzi_bazzer.Database"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Buy Now</title>
  <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <link href="Css/Buy_Now_Style.css" rel="stylesheet" type="text/css">
  <script src="Javascript/Checkout.js"></script>
</head>
<%
    
    int done=0;
    String id="",q="",amount="",seller="",emaiiId="";
    
    try
    {
        emaiiId=session.getAttribute("UserID").toString();
       // String userType=session.getAttribute("UserType").toString();
        String error=request.getParameter("done");
         id=request.getParameter("id");
         q=request.getParameter("q");
        ResultSet rs=new Database().Productdetails5(id);
        if(rs.next())
        {
           Double pp=Double.parseDouble(rs.getString("product_price"));
           Double aa=pp*Double.parseDouble(q);
           amount=aa.toString();
           seller=rs.getString("product _seller");
        }
        if(error.equals("1"))
        {
            done=1;
        }
       
    }
    catch(Exception e){}
%>
<body onload="<%if(done==1){out.print("model()");}%>">

  <!-- Confirm Modal Start -->
  <div id="myModal" class="modal fade">
    <div class="modal-dialog modal-confirm">
      <div class="modal-content">
        <div class="modal-header">
          <div class="icon-box">
            <i class="material-icons">&#xE876;</i>
          </div>
          <h4 class="modal-title"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Awesome!</h4>
        </div>
        <div class="modal-body">
          <p class="text-center">Your order has been confirmed. Check your email for detials.</p>
        </div>
        <div class="modal-footer">
          <button class="btn btn-success btn-block" data-dismiss="modal" onclick="Myorder()">OK</button>
        </div>
      </div>
    </div>
  </div>
  <!-- Confirm Model End -->



  <%@include file="PageFiles/navCheckout.jsp"%> <br><br><br><br>

  <div class="container-fluid">
    <div class="row">
        <form method="Post" action="BuyProduct?id=<%=id%>&q=<%=q%>&amount=<%=amount%>&seller=<%=seller%>&buyer=<%=emaiiId%>">
      <div class="col-xs-13">
       
        <h3>Select Address..</h3>
        <div class="list-group">
          <div class="list-group-item">
              <%
                  try{
                          
                          String userType=session.getAttribute("UserType").toString();
                         ResultSet rs ;
                         if(userType.equals("USER"))
                         {
                               rs = new Database().UserAddress(emaiiId);
                         }
                         else
                         {
                              rs = new Database().SellerAddress(emaiiId);
                         }
                         while(rs.next())
                         {
              %>
            <div class="list-group-item-heading">
              <div class="row radio">
                <div class="col-xs-3">
                    <label><input type="radio" name="Address" id="optionShipp<%=(userType.equals("USER")?rs.getString("address_id"):rs.getString("seller_id"))%>" value="<%=(userType.equals("USER")?rs.getString("address_id"):rs.getString("seller_id"))%>" checked> 
                        <%=(userType.equals("USER")?rs.getString("house_number")+","+rs.getString("street_number")+","
                      +rs.getString("vill_town")+","+rs.getString("post_office")+","
                      +rs.getString("post_office")+","+rs.getString("police_station")+","
                      +rs.getString("district")+","+rs.getString("state")+","
                      +rs.getString("pin_code"):rs.getString("house_number")+","+rs.getString("street")+","
                      +rs.getString("town")+","+rs.getString("state")+","
                      +rs.getString("zip_code")+","+rs.getString("landmark"))%>
                  </label>
                </div>
              </div>
            </div>
           <%
               }
               }  catch(Exception es){}
           %>
          </div>
        </div>
        <h3>I'll pay with&hellip;</h3>
        <div class="list-group">
          <div class="list-group-item">
            <div class="list-group-item-heading">
                <b>Total Blance: <%=amount%></b>
            </div>
          </div>
          <div class="list-group-item">
            <div class="list-group-item-heading">
              <div class="row radio">
                <div class="col-xs-3">
                  <label data-toggl-e="collapse" data-target="#newcard">
                      <input type="radio" name="Payment" id="optionsRadios2" value="option2" disabled>
                    New Credit Card
                  </label>
                </div>
                <div class="col-xs-5">
                  <div class="media">&nbsp;&nbsp;
                    <a class="media-right" href="#">
                      <img src="https://lovewithfood.com/assets/credit_cards/cards-b3a7c7b8345355bf110ebedfd6401312.png"
                        height="25" alt="" />
                    </a>
                    <div class="media-body" id="newcard">
                      We accept these credit cards.
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
          <div class="list-group-item">
            <div class="list-group-item-heading">
              <div class="row radio">
                <div class="col-xs-3">
                  <label data-toggl-e="collapse" data-target="#newcard">
                    <input type="radio" name="Payment" id="optionsRadios3" value="option3" disabled> Pay with PayPal
                  </label>
                </div>
                <div class="col-xs-5">
                  <div class="media">&nbsp;&nbsp;&nbsp;
                    <a class="media-right" href="#">
                      <img
                        src="https://www.paypalobjects.com/webstatic/mktg/logo-center/PP_Acceptance_Marks_for_LogoCenter_76x48.png"
                        height="25" alt="" />
                    </a>
                    <div class="media-body" id="newcard">
                      You can pay with PayPal
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
          <div class="list-group-item">
            <div class="list-group-item-heading">
              <div class="row radio">
                <div class="col-xs-3">
                  <label data-toggl-e="collapse" data-target="#newcard">
                    <input type="radio" name="Payment" id="optionsRadios2" value="COD" checked>
                    Cash on Delivery
                  </label>
                </div>
                <div class="col-xs-5">
                  <div class="media"> &nbsp;&nbsp;
                    <a class="media-right" href="#">
                      <img src="https://static.thenounproject.com/png/580678-200.png" height="25" alt="" />
                    </a>
                    <div class="media-body" id="newcard">
                      Payment is to be made on a cash on delivery basis
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
        <!--<div class="checkbox">
          <label data-toggle="collapse" data-target="#">
              <input type="checkbox" disabled> I have a promo code
          </label>
        </div>
         <div class="collapse" id="promo">
          <div class="form-group">
            <div class="form-inline">
              <input type="text" class="form-control" id="inputpromo" placeholder="Enter promo code">
              <button type="button" class="btn btn-outline-warning">Apply</button>
            </div>
          </div>
        </div>-->
        <br>
        <button type="submit" class="btn btn-success btn-lg btn-block" data-toggle="modal"
                onclick="model()">Confirm Your Order</button>
      </div>
    </form>
    </div>
  </div>
  <script>
      function model()
      {
          $("#myModal").modal();
      }
      function Myorder()
      {
          window.location="Home/My_Order.jsp";
      }
  </script>
  <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</body>

</html>