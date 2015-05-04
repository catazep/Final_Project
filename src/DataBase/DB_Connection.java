/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Catalin
 */


public class DB_Connection {
    private Connection con;
    private Statement st;
    private ResultSet rs;
    
    
    public DB_Connection()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println();
            
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","root");
            
          
            
            st =con.createStatement();
            
        }
        catch(ClassNotFoundException | SQLException ex)
        {
            System.out.println("Error : "+ex);
            
        }
    }
    
    public void getData()   //de inclus in clasa book/reader, depinzand de ce face
    {
        try
        {
            String query = "SELECT * FROM `Persons`";
            rs = st.executeQuery(query);
            System.out.println("Recors of database");
            {
                while(rs.next())
                {
                    String cnp = rs.getString("cnp");
                    String name = rs.getString("name_");
                    String age = rs.getString("group_");
                    System.out.println("CNP : "+cnp);
                    System.out.println("Name : "+name);
                    System.out.println("Age : "+age);
                }
                
                        
            }
        }
        catch(Exception ex)
        {
            System.out.println("Error : "+ex);
        }
    }
}

