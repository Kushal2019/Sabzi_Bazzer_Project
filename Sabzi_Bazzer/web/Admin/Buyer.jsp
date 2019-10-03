<html>

<head>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.1/css/all.css">
    <link href="https://fonts.googleapis.com/css?family=Nunito:400,600|Open+Sans:400,600,700" rel="stylesheet">
    <link rel="stylesheet" href="../Css/Admin_Style.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.3/Chart.bundle.min.js"></script>
    <script src="../Javascript/Admin_Charts.js"></script>
    <title>Admin Panel</title>
</head>

<body>
    <div class="dash">
        <div class="dash-nav dash-nav-dark">
            <header>
                <a href="#!" class="menu-toggle">
                    <i class="fas fa-bars"></i>
                </a>
                <a href="../Home/index.jsp" class="spur-logo"><i class="fas fa-bolt"></i> <span>Sabzi Bazzer</span></a>
            </header>
            <nav class="dash-nav-list">
                <a href="index.jsp" class="dash-nav-item">
                    <i class="fas fa-home"></i> Dashboard </a>
                    <a href="Product_List.jsp" class="dash-nav-item">
                    <i class="fas fa-shopping-bag"></i> Product </a>
                    <a href="Buyer.jsp" class="dash-nav-item">
                    <i class="fas fa-user-tie"></i> Buyer </a>
                    <a href="Seller.jsp" class="dash-nav-item">
                    <i class="fas fa-user-edit"></i> Seller </a>
            </nav>
        </div>
        <div class="dash-app">
            <header class="dash-toolbar">
                <a href="#!" class="menu-toggle">
                    <i class="fas fa-bars"></i>
                </a>
                <a href="#!" class="searchbox-toggle">
                    <i class="fas fa-search"></i>
                </a>
                <form class="searchbox" action="#!">
                    <a href="#!" class="searchbox-toggle"> <i class="fas fa-arrow-left"></i> </a>
                    <button type="submit" class="searchbox-submit"> <i class="fas fa-search"></i> </button>
                    <input type="text" class="searchbox-input" placeholder="type to search">
                </form>
                <div class="tools">
                    <a href="https://github.com/HackerThemes/spur-template" target="_blank" class="tools-item">
                        <i class="fab fa-github"></i>
                    </a>
                    <a href="#!" class="tools-item">
                        <i class="fas fa-bell"></i>
                        <i class="tools-item-count">4</i>
                    </a>
                    <div class="dropdown tools-item">
                        <a href="#" class="" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            <i class="fas fa-user"></i>
                        </a>
                        <div class="dropdown-menu dropdown-menu-right" aria-labelledby="dropdownMenu1">
                            <a class="dropdown-item" href="#!">Profile</a>
                            <a class="dropdown-item" href="login.html">Logout</a>
                        </div>
                    </div>
                </div>
            </header>
            <main class="dash-content">
                <div class="col-xl-4">
                            <div class="stats stats-success ">
                                <h3 class="stats-title"> Buyers </h3>
                                <div class="stats-content">
                                    <div class="stats-icon">
                                        <i class="fas fa-cart-arrow-down"></i>
                                    </div>
                                    <div class="stats-data">
                                        <div class="stats-number">$25,541</div>
                                        <div class="stats-change">
                                            <span class="stats-percentage">+17.5%</span>
                                            <span class="stats-timeframe">from last month</span>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
            </main>
        </div>
    </div>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    <script src="../Javascript/Admin_Style.js"></script>
</body>

</html>