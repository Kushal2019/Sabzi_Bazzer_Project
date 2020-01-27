<%-- 
    Document   : nav_Admin
    Created on : 2 Oct, 2019, 7:18:34 PM
    Author     : Kushal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.1/css/all.css">
    <link href="https://fonts.googleapis.com/css?family=Nunito:400,600|Open+Sans:400,600,700" rel="stylesheet">
    <link rel="stylesheet" href="../../Css/Admin_Style.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.3/Chart.bundle.min.js"></script>
    <script src="../../Javascript/Admin_Charts.js"></script>
</head>

<body>
    <div class="dash-nav dash-nav-dark">
        <header>
            <a href="#!" class="menu-toggle">
                <i class="fas fa-bars"></i>
            </a>
            <a href="../Home/index.jsp" class="spur-logo"><i class="fas fa-bolt"></i> <span>Sabzi Bazzer</span></a>
        </header>
        <nav class="dash-nav-list">
            <a href="my_profile.jsp" class="dash-nav-item">
                <i class="fas fa-user-edit"></i> My Profile </a>
            <a href="all_item.jsp" class="dash-nav-item">
                <i class="fas fa-shopping-bag"></i> All Item </a>
            <a href="add_item.jsp" class="dash-nav-item">
                <i class="fa fa-shopping-basket"></i> Add Item </a>
            <a href="#" class="dash-nav-item">
                <i class="fa fa-shopping-cart"></i> My Order </a>
        </nav>
    </div>
</body>

</html>