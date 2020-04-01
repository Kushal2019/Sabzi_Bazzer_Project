<%
        try
        {
            String userType=session.getAttribute("UserType").toString();
            if(userType.equals("USER"))
            {
                //user
                response.sendRedirect("../User/MyOrder.jsp");
            }
            else
            {
                if(userType.equals("SELLER"))
                {
                    //Seller
                    response.sendRedirect("../Seller/MyOrder.jsp");
                }  
                else
                {
                   
                }
            }
        }
        catch(Exception ex){}
    %>