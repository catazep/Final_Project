/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import DataBase.DB_Connection;
import Library.*;

/**
 *
 * @author Catalin
 */
public class Main
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //DB_Connection connector = new DB_Connection();
        //connector.getData();
        /*Book book = new Book(1,"BookName","Author","Type");
        Reader reader = new Reader(1,"1950428430016",251,"Georgescu Catalin");
        reader.borrowBook(book);
        for(int i=0;i<=4;i++)
        reader.printBooks();*/
        
        
        
        Book book1=new Book(1,"Morometii1","Marin Preda1","Roman realist1");
        Book book2=new Book(2,"Morometii2","Marin Preda2","Roman realist2");
        Book book3=new Book(3,"Morometii3","Marin Preda3","Roman realist3");
        
        Reader reader1=new Reader(1,"1950428430016",251,"Georgescu Catalin");
        book1.borrowBook(reader1);
        book2.borrowBook(reader1);
        book3.borrowBook(reader1);
        
        reader1.showBooks();
        
    }
    
}
