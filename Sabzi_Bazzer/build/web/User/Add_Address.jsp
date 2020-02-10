<%-- 
    Document   : Add_Address
    Created on : 9 Feb, 2020, 6:38:15 PM
    Author     : Kushal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Add Address</title>


  <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <link rel="stylesheet" href="../Css/User_Style.css">
  <script src="../Javascript/my_profile.js"></script>
  <script type="text/javascript" src="../Javascript/Registration_Validation.js"></script>

</head>

<body>

  <div class="dash">
    <%@include file="PageFiles/User_SidePanel.jsp" %>
    <div class="dash-app">
      <%@include file="PageFiles/User_TopToolbar.jsp" %>
      <main class="dash-content">
        <div>
          <table class="table table-dark table-striped">
            <thead>
              <tr>
                <th>House_Number</th>
                <th>Vill/Town</th>
                <th>Police Station</th>
                <th>District</th>
                <th>State</th>
                <th>Pin</th>
                <th>Landmark</th>
                <th>Activity</th>
              </tr>
            </thead>
            <tbody>
              <tr>
                <td>######</td>
                <td>######</td>
                <td>######</td>
                <td>######</td>
                <td>######</td>
                <td>######</td>
                <td>######</td>
                <td>
                  <button type="button" class="btn btn-labeled btn-success"> Edit </button>
                  <button type="button" class="btn btn-labeled btn-danger"> Delete </button>
                </td>
              </tr>
            </tbody>
          </table>
        </div>
      </main>
    </div>
  </div>

  <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
  <script src="../Javascript/Admin_Style.js"></script>
</body>

</html>