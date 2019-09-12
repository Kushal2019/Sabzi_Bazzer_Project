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
    int insertUser(User user) {
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
                smt.setString(7,"sdfghjk" );   //user.getAns()
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
    
}
