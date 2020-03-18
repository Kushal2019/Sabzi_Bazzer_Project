<script>
        function valSearch()
        {
    let val=document.getElementById("search").value;
    if(val=="")
    {
     
    }else
    {
       window.location="../Home/Search_Result.jsp?search="+val;
    }
    
        }
        </script>
        <nav class="navbar fixed-top navbar-expand-lg navbar-dark bg-dark">
  <a class="navbar-brand" href="index.jsp" style="font-family: Snap ITC; font-size: 28px;"> Sabzi Bazzer </a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarColor01"
    aria-controls="navbarColor01" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarColor01">
    <ul class="navbar-nav ml-auto">
      <li class="nav-item">
        <a class="nav-link" href="index.jsp">Home</a>
      </li>
      <li class="nav-item active">
        <a class="nav-link" href="about.jsp">About</a>
      </li>
      <li class="nav-item">
          <a class="nav-link" href="../Home/Empty_Cart.jsp">Cart</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="Mainlogin.jsp">Login</a>
      </li>
    </ul>
    <form class="form-inline my-2 my-lg-0" >
      <input class="form-control mr-sm-2" type="text" name="search" id="search" placeholder="Search">
      <button class="btn btn-secondary my-2 my-sm-0" type="button" onclick="valSearch()">Search</button>
    </form>
  </div>
</nav>