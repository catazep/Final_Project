/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final_project;
import DataBase.DB_Connection;

/**
 *
 * @author Catalin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DB_Connection connector = new DB_Connection();
        connector.getData();
    }
    
}