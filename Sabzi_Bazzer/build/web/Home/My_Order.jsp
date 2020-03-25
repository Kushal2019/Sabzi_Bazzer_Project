<%
        try
        {
            String userType=session.getAttribute("UserType").toString();
            if(userType.equals("USER"))
            {
                //user
                response.sendRedirect("../User/My_Order.jsp");
            }
            else
            {
                if(userType.equals("SELLER"))
                {
                    //Seller
                    response.sendRedirect("../Seller/My_Order.jsp");
                }  
                else
                {
                   
                }
            }
        }
        catch(Exception ex){}
    %>