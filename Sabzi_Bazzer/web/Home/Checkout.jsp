<%-- 
    Document   : Buy_Now
    Created on : 14 Mar, 2020, 12:48:49 PM
    Author     : Kushal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Buy Now</title>
  <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <link href="../Css/Buy_Now_Style.css" rel="stylesheet" type="text/css">
</head>

<body>

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
          <button class="btn btn-success btn-block" data-dismiss="modal">OK</button>
        </div>
      </div>
    </div>
  </div>
  <!-- Confirm Model End -->



  <%@include file="../PageFiles/navCheckout.jsp"%> <br><br><br><br>

  <div class="container-fluid">
    <div class="row">
      <div class="col-xs-13">
        <div class="collapse" id="promo">
          <div class="form-group">
            <div class="form-inline">
              <input type="text" class="form-control" id="inputpromo" placeholder="Enter promo code">
              <button type="button" class="btn btn-outline-warning">Apply</button>
            </div>
          </div>
        </div>
        <h3>Select Address..</h3>
        <div class="list-group">
          <div class="list-group-item">
            <div class="list-group-item-heading">
              <div class="row radio">
                <div class="col-xs-3">
                  <label><input type="radio" name="optionShipp" id="optionShipp1" value="option2" checked> This is
                    Address 1...</label>
                </div>
              </div>
            </div>
            <div class="list-group-item-heading">
              <div class="row radio">
                <div class="col-xs-3">
                  <label><input type="radio" name="optionShipp" id="optionShipp1" value="option2"> This is Address
                    2...</label>
                </div>
              </div>
            </div>
            <div class="list-group-item-heading">
              <div class="row radio">
                <div class="col-xs-3">
                  <label><input type="radio" name="optionShipp" id="optionShipp1" value="option2"> This is Address
                    3...</label>
                </div>
              </div>
            </div>
          </div>
        </div>
        <h3>I'll pay with&hellip;</h3>
        <div class="list-group">
          <div class="list-group-item">
            <div class="list-group-item-heading">
            </div>
          </div>
          <div class="list-group-item">
            <div class="list-group-item-heading">
              <div class="row radio">
                <div class="col-xs-3">
                  <label data-toggl-e="collapse" data-target="#newcard">
                    <input type="radio" name="optionsRadios" id="optionsRadios2" value="option2" checked>
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
                    <input type="radio" name="optionsRadios" id="optionsRadios3" value="option3"> Pay with PayPal
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
                    <input type="radio" name="optionsRadios" id="optionsRadios2" value="option2" checked>
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
        <div class="checkbox">
          <label data-toggle="collapse" data-target="#promo">
            <input type="checkbox"> I have a promo code
          </label>
        </div>
        <button type="button" class="btn btn-success btn-lg btn-block" data-toggle="modal"
          data-target="#myModal">Confirm Your Order</button>
      </div>
    </div>
  </div>
  <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</body>

</html>