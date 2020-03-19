<%-- 
    Document   : My_Order
    Created on : 18 Mar, 2020, 8:02:50 PM
    Author     : Kushal
--%>

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
        <%@include file="PageFiles/User_SidePanel.jsp" %>
        <div class="dash-app">
            <%@include file="PageFiles/User_TopToolbar.jsp" %>
            <main class="dash-content">
                <div class="container-fluid my-5 d-sm-flex justify-content-center">
                    <div class="card px-2">
                        <div class="card-header bg-white">
                            <div class="row justify-content-between">
                                <div class="col">
                                    <p class="text-muted"> Order ID <span
                                            class="font-weight-bold text-dark">1222528743</span></p>
                                    <p class="text-muted"> Place On <span class="font-weight-bold text-dark">12,March
                                            2019</span> </p>
                                </div>
                                <div class="flex-col my-auto">
                                    <h6 class="ml-auto mr-3"> <a href="#">Cancel Order</a> </h6>
                                </div>
                            </div>
                        </div>
                        <div class="card-body">
                            <div class="media flex-column flex-sm-row">
                                <div class="media-body ">
                                    <h5 class="bold">Blade High Heels Sandals</h5>
                                    <p class="text-muted"> Qt: 1 Pair</p>
                                    <h4 class="mt-3 mb-4 bold"> <span class="mt-5">&#x20B9;</span> 1,500 <span
                                            class="small text-muted"> via (COD) </span></h4>
                                    <p class="text-muted">Tracking Status on: <span class="Today">11:30pm, Today</span> </p>
                                </div><img class="align-self-center img-fluid" src="https://i.imgur.com/bOcHdBa.jpg" width="180 " height="180">
                            </div>
                        </div>
                        <div class="row px-2">
                            <div class="col">
                                <ul id="progressbar">
                                    <li class="step0 active " id="step1">PLACED</li>
                                    <li class="step0 active text-center" id="step2">SHIPPED</li>
                                    <li class="step0 text-muted text-right" id="step3">DELIVERED</li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </main>
        </div>
    </div>


    <script src="../Javascript/Admin_Style.js"></script>
</body>

</html>