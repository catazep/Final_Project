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


public class DB_Connection
{
    private Connection con;
    private Statement st;
    private ResultSet rs;
    
    
    public DB_Connection()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println();
            
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Library","root","");
            
          
            
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
            String query = "SELECT * FROM `Readers`";
            rs = st.executeQuery(query);
            System.out.println("Recors of database");
            {
                while(rs.next())
                {
                    int id = rs.getInt("readerID");
                    String cnp = rs.getString("readerCNP");
                    String name = rs.getString("readerName");
                    int group = rs.getInt("readerGroup");
                    System.out.println("ID : "+id);
                    System.out.println("CNP : "+cnp);
                    System.out.println("Name : "+name);
                    System.out.println("Group : "+group);
                }
                
                        
            }
        }
        catch(Exception ex)
        {
            System.out.println("Error : "+ex);
        }
    }
}

