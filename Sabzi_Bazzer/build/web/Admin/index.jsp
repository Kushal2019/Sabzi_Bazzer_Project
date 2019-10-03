<%@page import="com.sabzi_bazzer.Database"%>
<html>

<head>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.1/css/all.css">
    <link href="https://fonts.googleapis.com/css?family=Nunito:400,600|Open+Sans:400,600,700" rel="stylesheet">
    <link rel="stylesheet" href="../Css/Admin_all.css">
    <link rel="stylesheet" href="../Css/Admin_Style.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.3/Chart.bundle.min.js"></script>
    <script src="../Javascript/Admin_Charts.js"></script>
    <title>Admin Panel</title>
</head>

<body>
    <div class="dash">
        <%@include file="pageFiles/admin_sidePaneel.jsp" %>

        <div class="dash-app">

            <%@include file="pageFiles/admin_topToolbar.jsp" %>


            <main class="dash-content">
                <div class="container-fluid">
                    <div class="row dash-row">
                        <div class="col-xl-4">
                            <div class="stats stats-primary">
                                <h3 class="stats-title"> Sellers </h3>
                                <div class="stats-content">
                                    <div class="stats-icon">
                                        <i class="fas fa-user"></i>
                                    </div>
                                    <div class="stats-data">
                                        <%
                                            String count="0";
                                            try{
                                                Database db = new Database();
                                                count=db.getSellerCount();                                            
                                            }
                                             catch(Exception ex)
                                            {}
                                        %>
                                        <div class="stats-number"><%=count%></div>
                                        <div class="stats-change">
                                            <span class="stats-timeframe">Number of sellers</span>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-xl-4">
                            <div class="stats stats-success ">
                                <h3 class="stats-title"> Buyers </h3>
                                <div class="stats-content">
                                    <div class="stats-icon">
                                        <i class="fas fa-cart-arrow-down"></i>
                                    </div>
                                    <div class="stats-data">
                                        <%
                                            String Bcount="0";
                                            try{
                                                Database db = new Database();
                                                Bcount=db.getBuyerCount();                                            
                                            }
                                             catch(Exception ex)
                                            {}
                                        %>
                                        <div class="stats-number"><%=Bcount%></div>
                                        <div class="stats-change">
                                            <span class="stats-percentage">+17.5%</span>
                                            <span class="stats-timeframe">from last month</span>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-xl-4">
                            <div class="stats stats-danger">
                                <h3 class="stats-title"> Products </h3>
                                <div class="stats-content">
                                    <div class="stats-icon">
                                        <i class="fas fa-phone"></i>
                                    </div>
                                    <div class="stats-data">
                                        <div class="stats-number">5</div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </main>
        </div>
    </div>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
    <script src="../Javascript/Admin_Style.js"></script>
</body>

</html>