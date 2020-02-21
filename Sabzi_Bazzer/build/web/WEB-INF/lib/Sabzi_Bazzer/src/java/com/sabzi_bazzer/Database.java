package com.sabzi_bazzer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Soumen-Pc 
 */
public class Database {

    Connection conn;
    ResultSet rs;
    PreparedStatement smt;
    String url,id,pass;
    public Database() {
    }
    public boolean isConnected()
    {
     try
     {
         url="jdbc:mysql://localhost:3306/sabzi_bazzer?zeroDateTimeBehavior=convertToNull";
         id="root";
         pass="";
         Class.forName("com.mysql.jdbc.Driver");
         conn=DriverManager.getConnection(url,id,pass);
         return true;
     }
     catch(Exception ex)
     {
         return false;
     }
    }

    boolean close()
    {
        try
        {
            conn.close();
            return true;
        }
        catch(Exception ex)
        {
            return false;
        }
    }
    int insertUser(User_value user) {
        try
        {
            if(isConnected())
            {
                //logic to insert
                String profilepic="Userpic.png";
                String qry="INSERT INTO `user_details`( `first_name`, `last_name`,`password`, `email`, `ph_number`, `s_question`, `s_answer`, `gender`, `profilepic`) VALUES (?,?,?,?,?,?,?,?,?)";
                smt=conn.prepareStatement(qry);
                smt.setString(1, user.getFname());
                smt.setString(2, user.getLname());
                smt.setString(3, user.getPass());
                smt.setString(4, user.getEmail());
                smt.setString(5, user.getPhone());
                smt.setString(6, user.getQues());
                smt.setString(7, user.getAns());
                smt.setString(8, user.getGender());
                smt.setString(9,profilepic );
                smt.execute();
                return 1;                
            }
            else
            {
                //error
                return 0;
            }
            
        }
        catch(Exception ex){
            //error
            return 0;
        }
        finally
        {
            close();
        }
    }

    int insertLogindetails(User_value user) {
        try {
            if(isConnected())
            {
                String qre="INSERT INTO `login_details`(`login_id`, `email`, `password`, `user_type`, `isactive`) VALUES (null,?,?,?,?)";
                smt=conn.prepareStatement(qre);
                smt.setString(1,user.getEmail());
                smt.setString(2,user.getPass());
                smt.setString(3,user.getType());
                smt.setString(4,"1");
                smt.execute();
                return 1;
            }
            else
            {
                return 0;
            }
        } catch (Exception e) {
            return 0;
        }  
        finally
        {
            close();
        }
    }

    int insertseller(Seller_value seller) {
       
        try {
            if(isConnected())
            {
               String profilepic="Sellerpic.png";
              String que="INSERT INTO `seller_details`(`seller_id`, `first_name`, `last_name`, `password`, `company_name`, `licence_number`, `email`, `ph_number`, `gender`, `state`, `town`, `zip_code`, `street`, `house_number`, `landmark`,`profilepic`) VALUES (null,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";  
              smt=conn.prepareStatement(que);
              smt.setString(1,seller.getS_f_name());
              smt.setString(2,seller.getS_last_name());
              smt.setString(3,seller.getS_password());
              smt.setString(4,seller.getS_Company());
              smt.setString(5,seller.getS_licence());
              smt.setString(6,seller.getS_email());
              smt.setString(7,seller.getS_phone());
              smt.setString(8,seller.getGender());
              smt.setString(9,seller.getS_state());
              smt.setString(10,seller.getS_town());
              smt.setString(11,seller.getS_zip());
              smt.setString(12,seller.getS_street());
              smt.setString(13,seller.getS_house());
              smt.setString(14,seller.getS_landmark());
               smt.setString(15,profilepic);
              smt.execute();
              return 1;
            }
            else
            {
                return 0;
            }
        } catch (Exception e) {
            return 0;
        }
        }

    int insertLogindetails1(Seller_value seller) {
        try {
            if(isConnected())
            {
                String qre="INSERT INTO `login_details`(`login_id`, `email`, `password`, `user_type`, `isactive`) VALUES (null,?,?,?,?)";
                smt=conn.prepareStatement(qre); 
                smt.setString(1, seller.getS_email());
                smt.setString(2,seller.getS_password());
                smt.setString(3,seller.getType());
                smt.setString(4,"0");
                smt.execute();
                return 1;
            }
            else
            {
                return 0;
            }
        } catch (Exception e) {
            return 0;
        }
    }

    ResultSet CheckLogin(String uid, String pass) {
        try
        {
            if(isConnected())
            {
                String sql="SELECT * FROM `login_details` WHERE `email`=? and `password`=? and `isactive`='1'";
                smt= conn.prepareStatement(sql);
                smt.setString(1, uid);
                smt.setString(2, pass);
                rs=smt.executeQuery();
                return rs;
            }
            else
            {
                return null;
            }
        }
        catch(Exception ex)
        {
            return null;
        }
    }
    public String getSellerCount()
    {
        try{
            if(isConnected())
            {
                String sql="SELECT count(*) as total FROM seller_details";
                smt=conn.prepareStatement(sql);
                rs=smt.executeQuery();
                if(rs.next())
                {
                    return rs.getString("total");
                }
                else 
                {
                    return "0";
                }
            }
            else
            {
                return "0";
            }
        }
        catch(Exception ex )
        {
            return "0";
        }
    }
    public String getBuyerCount()
    {
        try{
            if(isConnected())
            {
                String sql="SELECT count(*) as total FROM user_details";
                smt=conn.prepareStatement(sql);
                rs=smt.executeQuery();
                if(rs.next())
                {
                    return rs.getString("total");
                }
                else 
                {
                    return "0";
                }
            }
            else
            {
                return "0";
            }
        }
        catch(Exception ex )
        {
            return "0";
        }
    }
    public ResultSet Buyerdetails()
    {
        try
        {
            if(isConnected())
            {
                    String sql="SELECT `first_name`,`last_name`,user_details.email,`ph_number`,`gender`,login_details.isactive FROM `user_details`,login_details WHERE user_details.email=login_details.email and login_details.user_type='USER' ORDER BY user_id ASC";
                    smt=conn.prepareStatement(sql);
                    rs=smt.executeQuery();
                    return rs;
            }
            else
            {
                return null;
            }
        }
        catch(Exception e)
        {
            return null;
        }
    }
    public void activateBuyerByEmail(String Email)
    {
        try
        {
            if(isConnected())
            {
                    String sql="UPDATE `login_details` SET `isactive`='1' WHERE `email`=?";
                    smt=conn.prepareStatement(sql);
                    smt.setString(1, Email);
                    smt.execute();
            }
            else
            {
            }
        }
        catch(Exception e)
        {
        }
    }
    public void DeActivateBuyerByEmail(String Email)
    {
        try
        {
            if(isConnected())
            {
                    String sql="UPDATE `login_details` SET `isactive`='0' WHERE `email`=?";
                    smt=conn.prepareStatement(sql);
                    smt.setString(1, Email);
                    smt.execute();
            }
            else
            {
            }
        }
        catch(Exception e)
        {
        }
    }
      public void activateSellerByEmail(String Email)
    {
        try
        {
            if(isConnected())
            {
                    String sql="UPDATE `login_details` SET `isactive`='1' WHERE `email`=?";
                    smt=conn.prepareStatement(sql);
                    smt.setString(1, Email);
                    smt.execute();
            }
            else
            {
            }
        }
        catch(Exception e)
        {
        }
    }
    public void DeActivatesellerByEmail(String Email)
    {
        try
        {
            if(isConnected())
            {
                    String sql="UPDATE `login_details` SET `isactive`='0' WHERE `email`=?";
                    smt=conn.prepareStatement(sql);
                    smt.setString(1, Email);
                    smt.execute();
            }
            else
            {
            }
        }
        catch(Exception e)
        {
        }
    }
    public ResultSet Sellerdetails()
    {
        try
        {
            if(isConnected())
            {
                    String sql="SELECT `first_name`,`last_name`,seller_details.email,`company_name`,`licence_number`,`ph_number`,`gender`,`state`,`town`,`zip_code`,`street`,`house_number`,`landmark`,login_details.isactive FROM seller_details, login_details where seller_details.email=login_details.email and login_details.user_type='SELLER'";
                    smt=conn.prepareStatement(sql);
                    rs=smt.executeQuery();
                    return rs;
            }
            else
            {
                return null;
            }
        }
        catch(Exception e)
        {
            return null;
        }
    }

   public  int insertProduct(Product_value val,String email) {
        try
        {
            if(isConnected())
            {
               String que="INSERT INTO `product_details`( `product _seller`, `product_name`, `product_image`, `product_quantity`, `product_type`, `product_price`, `product_exp_date`, `product_description`,`isActive`) VALUES (?,?,?,?,?,?,?,?,?)";
               smt=conn.prepareStatement(que);
               smt.setString(1,email);
               smt.setString(2, val.getProduct_name());
               smt.setString(3, val.getProduct_file());
               smt.setString(4, val.getProduct_quantity());
               smt.setString(5, val.getProduct_quantity_type());
               smt.setString(6, val.getProduct_price());
               smt.setString(7, val.getProduct_Expdate());
               smt.setString(8, val.getProduct_desc());
               smt.setString(9, "1");
               smt.execute();
               return 1;
            }
            else
            {
                return 2;
            }
        }
        catch(Exception c)
        {
            return 0;
        }
        
    }
    public String sellername( String name)
    {
            try
            {
                if(isConnected())
                {
                    String sql="SELECT `first_name` FROM seller_details WHERE `email`=?";
                    smt=conn.prepareStatement(sql);
                    smt.setString(1, name);
                    rs=smt.executeQuery();
                    if(rs.next())
                     {
                      return rs.getString("first_name");
                      }
                      else 
                     {
                           return "Null";
                     }
                }
                else
                {
                    return "null";
                }
            }
            catch(Exception a)
            {
                return "null";
            }
    }
    public String Username( String name)
    {
            try
            {
                if(isConnected())
                {
                    String sql="SELECT `first_name` FROM user_details WHERE `email`=?";
                    smt=conn.prepareStatement(sql);
                    smt.setString(1, name);
                    rs=smt.executeQuery();
                    if(rs.next())
                     {
                      return rs.getString("first_name");
                      }
                      else 
                     {
                           return "Null";
                     }
                }
                else
                {
                    return "null";
                }
            }
            catch(Exception a)
            {
                return "null";
            }
    }
    public ResultSet Productdetails()
    {
        try
        {
            if(isConnected())
            {
                String c_date=new CurrentDate().C_date();
                    String sql="SELECT * FROM `product_details` WHERE `isActive`='1' and `product_exp_date` >=?";
                    smt=conn.prepareStatement(sql);
                   smt.setString(1, c_date);
                    rs=smt.executeQuery();
                    return rs;
            }
            else
            {
                return null;
            }
        }
        catch(Exception e)
        {
            return null;
        }
    }

    int UpdateSeller_PD(Seller_PD_val sellerval, String s_name) {
       try
       {
           if(isConnected())
           {
               String sql="UPDATE `seller_details` SET `first_name`=?,`last_name`=?,`company_name`=?,`licence_number`=?,`email`=?,`ph_number`=? WHERE `email`=?";
               smt=conn.prepareStatement(sql);
               smt.setString(1,sellerval.getFirst_name());
               smt.setString(2,sellerval.getLast_name());
               //smt.setString(3,sellerval.getProfilepic());
               smt.setString(3,sellerval.getCompany_name());
               smt.setString(4,sellerval.getLicence_number());
               smt.setString(5,sellerval.getEmail());
               smt.setString(6,sellerval.getPh_number());
               smt.setString(7,s_name);
               smt.execute();
               return 1;
           }
           else
           {
               return 0;
           }
       }
       catch(Exception ex)
       {
           return 0;
       }
    }
    int UpdateSeller_PD1(Seller_PD_val sellerval, String s_name) {
       try
       {
           if(isConnected())
           {
               String sql="UPDATE `login_details` SET `email`=? WHERE email=?";
               smt=conn.prepareStatement(sql);
               smt.setString(1,sellerval.getEmail());
               
               smt.setString(2,s_name);
               smt.execute();
               return 1;
           }
           else
           {
               return 0;
           }
       }
       catch(Exception ex)
       {
           return 0;
       }
    }

    int Seller_C_Password(String password, String s_name) {
        
        try
       {
           if(isConnected())
           {
               String sql="UPDATE login_details,seller_details SET seller_details.password=?,login_details.password=? WHERE login_details.email=seller_details.email AND seller_details.email=?";
               smt=conn.prepareStatement(sql);
               smt.setString(1,password);
               smt.setString(2,password);
               smt.setString(3,s_name);
               smt.execute();
               return 1;
           }
           else
           {
               return 0;
           }
       }
       catch(Exception ex)
       {
           return 0;
       }
    }

    int UpdateSellerprofilepic(String profilepic, String s_name) {
        try
       {
           if(isConnected())
           {
               String sql="UPDATE `seller_details` SET `profilepic` =? WHERE `email` =?";
               smt=conn.prepareStatement(sql);
               smt.setString(1,profilepic);
               smt.setString(2,s_name);
               smt.execute();
               return 1;
           }
           else
           {
               return 0;
           }
       }
       catch(Exception ex)
       {
           return 0;
       }
    }
 int UpdateUserprofilepic(String profilepic, String s_name) {
        try
       {
           if(isConnected())
           {
               String sql="UPDATE `user_details` SET `profilepic` =? WHERE `email` =?";
               smt=conn.prepareStatement(sql);
               smt.setString(1,profilepic);
               smt.setString(2,s_name);
               smt.execute();
               return 1;
           }
           else
           {
               return 0;
           }
       }
       catch(Exception ex)
       {
           return 0;
       }
    }
  

    ResultSet Checkpassword(String oldpassword, String s_name) {
       try
        {
            if(isConnected())
            {
                
                    String sql="SELECT * FROM `seller_details` WHERE `password`=? AND `email`=?";
                    smt=conn.prepareStatement(sql);
                   smt.setString(1,oldpassword);
                   smt.setString(2,s_name);
                    rs=smt.executeQuery();
                    return rs;
            }
            else
            {
                return null;
            }
        }
        catch(Exception e)
        {
            return null;
        }
    }

    int UpdateSeller_AD(Seller_AM sellerval, String s_name) {
        try
       {
           if(isConnected())
           {
               String sql="UPDATE `seller_details` SET `state`=?,`town`=?,`zip_code`=?,`street`=?,`house_number`=?,`landmark`=? WHERE `email`=?";
               smt=conn.prepareStatement(sql);
               smt.setString(1,sellerval.getState());
               smt.setString(2,sellerval.getTown());
               
               smt.setString(3,sellerval.getZip_code());
               smt.setString(4,sellerval.getStreet());
               smt.setString(5,sellerval.getHouse_number());
               smt.setString(6,sellerval.getLandmark());
               smt.setString(7,s_name);
               smt.execute();
               return 1;
           }
           else
           {
               return 0;
           }
       }
       catch(Exception ex)
       {
           return 0;
       }
        
    }

    ResultSet Forgotpassword(String emaiiId) {
        
         try
        {
            if(isConnected())
            {
                
                    String sql="SELECT  `password`,`user_type` FROM `login_details` WHERE `email`=?";
                    smt=conn.prepareStatement(sql);
                    smt.setString(1,emaiiId);
                    rs=smt.executeQuery();
                    return rs;
            }
            else
            {
            return  null;
            }
        }
        catch(Exception e)
        {
            return null;
        }
    }

    ResultSet getDetails(String emaiiId) {
         try
        {
            if(isConnected())
            {
                
                    String sql="SELECT * FROM `user_details` WHERE  email=?";
                    smt=conn.prepareStatement(sql);
                    smt.setString(1,emaiiId);
                    rs=smt.executeQuery();
                    return rs;
            }
            else
            {
            return  null;
            }
        }
        catch(Exception e)
        {
            return null;
        }
    }

    ResultSet getDetails1(String emaiiId) {
        
         try
        {
            if(isConnected())
            {
                
                    String sql="SELECT * FROM `seller_details` WHERE email=?";
                    smt=conn.prepareStatement(sql);
                    smt.setString(1,emaiiId);
                    rs=smt.executeQuery();
                    return rs;
            }
            else
            {
            return  null;
            }
        }
        catch(Exception e)
        {
            return null;
        }
    }

  

    public ResultSet Sellerprofilepic(String email){
        try
        {
            if(isConnected())
            {
                
                    String sql="SELECT  `seller_id`,`profilepic` FROM seller_details WHERE `email`=?";
                    smt=conn.prepareStatement(sql);
                    smt.setString(1,email);
                    rs=smt.executeQuery();
                    return rs;
            }
            else
            {
            return  null;
            }
        }
        catch(Exception e)
        {
            return null;
        }
    
    }
    public ResultSet Userprofilepic(String email){
        try
        {
            if(isConnected())
            {
                
                    String sql="SELECT  `user_id`,`profilepic` FROM user_details WHERE `email`=?";
                    smt=conn.prepareStatement(sql);
                    smt.setString(1,email);
                    rs=smt.executeQuery();
                    return rs;
            }
            else
            {
            return  null;
            }
        }
        catch(Exception e)
        {
            return null;
        }
    
    }
    //
    public ResultSet SellerPI(String email)
    {
         try
        {
            if(isConnected())
            {
                
                    String sql="SELECT  `first_name`, `last_name`,  `company_name`, `licence_number`, `email`, `ph_number` FROM `seller_details` WHERE email =?";
                    smt=conn.prepareStatement(sql);
                    smt.setString(1,email);
                    rs=smt.executeQuery();
                    return rs;
            }
            else
            {
            return  null;
            }
        }
        catch(Exception e)
        {
            return null;
        }
    }
    public ResultSet UserPI(String email)
    {
         try
        {
            if(isConnected())
            {
                
                    String sql="SELECT * FROM `user_details` WHERE `email`=?";
                    smt=conn.prepareStatement(sql);
                    smt.setString(1,email);
                    rs=smt.executeQuery();
                    return rs;
            }
            else
            {
            return  null;
            }
        }
        catch(Exception e)
        {
            return null;
        }
    }
     public ResultSet SellerMA(String email)
    {
         try
        {
            if(isConnected())
            {
                
                    String sql="SELECT  `state`, `town`, `zip_code`, `street`, `house_number`, `landmark` FROM `seller_details` WHERE `email`=?";
                    smt=conn.prepareStatement(sql);
                    smt.setString(1,email);
                    rs=smt.executeQuery();
                    return rs;
            }
            else
            {
            return  null;
            }
        }
        catch(Exception e)
        {
            return null;
        }
    }

    int UpdateUser_PD(String first_name, String last_name, String email, String ph_number, String s_name) {
       
             try
       {
           if(isConnected())
           {
               String sql="UPDATE `user_details`,`login_details` SET login_details.email=?,user_details.`first_name`=?,user_details.`last_name`=?,user_details.`email`=?,user_details.`ph_number`=? WHERE user_details.`email`=login_details.email AND user_details.email=?";
               smt=conn.prepareStatement(sql);
               smt.setString(1,email);
               smt.setString(2,first_name);
               //smt.setString(3,sellerval.getProfilepic());
               smt.setString(3,last_name);
               smt.setString(4,email);
               smt.setString(5,ph_number);
               smt.setString(6,s_name);
               
               smt.execute();
               return 1;
           }
           else
           {
               return 0;
           }
       }
       catch(Exception ex)
       {
           return 0;
       }
   
    }

    int User_C_Password(String password, String s_name) {
       try
       {
           if(isConnected())
           {
               String sql="UPDATE `user_details`,login_details SET user_details.password=?,login_details.password=? WHERE user_details.email=login_details.email AND user_details.email=?";
               smt=conn.prepareStatement(sql);
               smt.setString(1,password);
               smt.setString(2,password);
               smt.setString(3,s_name);
               smt.execute();
               return 1;
           }
           else
           {
               return 0;
           }
       }
       catch(Exception ex)
       {
           return 0;
       }
    }

    ResultSet USerCheckpassword(String oldpassword, String s_name) {
       try
        {
            if(isConnected())
            {
                
                    String sql="SELECT * FROM `user_details` WHERE `password`=? AND `email`=?";
                    smt=conn.prepareStatement(sql);
                   smt.setString(1,oldpassword);
                   smt.setString(2,s_name);
                    rs=smt.executeQuery();
                    return rs;
            }
            else
            {
                return null;
            }
        }
        catch(Exception e)
        {
            return null;
        }
    }

    int insetUserAddress(User_Address_val val) {
       try
        {
            if(isConnected())
            {
               String que="INSERT INTO `user_address`( `email`, `house_number`, `street_number`, `vill_town`, `post_office`, `police_station`, `district`, `state`, `pin_code`, `landmark`) VALUES (?,?,?,?,?,?,?,?,?,?)";
               smt=conn.prepareStatement(que);
               smt.setString(1,val.getEmail());
               smt.setString(2, val.getHouse_number());
               smt.setString(3, val.getStreet_number1());
               smt.setString(4, val.getVill_town1());
               smt.setString(5, val.getPost_office1());
               smt.setString(6, val.getPolice_station1());
               smt.setString(7, val.getS_town());
               smt.setString(8, val.getS_state());
               smt.setString(9, val.getPin_code1());
               smt.setString(10, val.getLandmark1());
               smt.execute();
               return 1;
            }
            else
            {
                return 2;
            }
        }
        catch(Exception c)
        {
            return 0;
        }
    }
 
    
    public ResultSet UserAddress( String s_name) {
       try
        {
            if(isConnected())
            {
                
                    String sql="SELECT * FROM `user_address` WHERE `email`=?";
                    smt=conn.prepareStatement(sql);
                    smt.setString(1,s_name);
                    rs=smt.executeQuery();
                    return rs;
            }
            else
            {
                return null;
            }
        }
        catch(Exception e)
        {
            return null;
        }
    }
      public ResultSet UserAddress1( String id) {
       try
        {
            if(isConnected())
            {
                
                    String sql="SELECT * FROM `user_address` WHERE `address_id`=?";
                    smt=conn.prepareStatement(sql);
                    smt.setString(1,id);
                    rs=smt.executeQuery();
                    return rs;
            }
            else
            {
                return null;
            }
        }
        catch(Exception e)
        {
            return null;
        }
    }

    int updateUserAddress(User_Address_val val,String id) {
        try
        {
            if(isConnected())
            {
               String que="UPDATE `user_address` SET `house_number`=?,`street_number`=?,`vill_town`=?,`post_office`=?,`police_station`=?,`district`=?,`state`=?,`pin_code`=?,`landmark`=? WHERE `address_id`=? and `email`=?";
               smt=conn.prepareStatement(que);
               smt.setString(1, val.getHouse_number());
               smt.setString(2, val.getStreet_number1());
               smt.setString(3, val.getVill_town1());
               smt.setString(4, val.getPost_office1());
               smt.setString(5, val.getPolice_station1());
               smt.setString(6, val.getS_town());
               smt.setString(7, val.getS_state());
               smt.setString(8, val.getPin_code1());
               smt.setString(9, val.getLandmark1());
               smt.setString(10,id);
               smt.setString(11, val.getEmail());
               smt.execute();
               return 1;
            }
            else
            {
                return 2;
            }
        }
        catch(Exception c)
        {
            return 0;
        }
    }

    int User_add_delete(String id) {
       try
        {
            if(isConnected())
            {
               String que="DELETE FROM `user_address` WHERE `address_id`=?";
               smt=conn.prepareStatement(que);
               smt.setString(1, id);
               smt.execute();
               return 1;
            }
            else
            {
                return 2;
            }
        }
        catch(Exception c)
        {
            return 0;
        }
    }
    
    
    
    
    
    
}

