/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
                String qry="INSERT INTO `user_details`(`user_id`, `first_name`, `last_name`, `password`, `email`, `ph_number`, `s_question`, `s_answer`, `gender`) VALUES (null,?,?,?,?,?,?,?,?)";
                smt=conn.prepareStatement(qry);
                smt.setString(1, user.getFname());
                smt.setString(2, user.getLname());
                smt.setString(3, user.getPass());
                smt.setString(4, user.getEmail());
                smt.setString(5, user.getPhone());
                smt.setString(6, user.getQues());
                smt.setString(7, user.getAns());
                smt.setString(8, user.getGender());
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
              String que="INSERT INTO `seller_details`(`seller_id`, `first_name`, `last_name`, `password`, `company_name`, `licence_number`, `email`, `ph_number`, `gender`, `state`, `town`, `zip_code`, `street`, `house_number`, `landmark`) VALUES (null,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";  
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
}
