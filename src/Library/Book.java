/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Catalin
 */
public class Book
{
    int bookID;
    int readerID;//null=neimprumutata , altfel imprumutata de userul cu acel CNP
    String bookName;
    String bookAuthor;
    String bookType;
    Date dateBorrow;
    Date dateExceed;
    
    
    
    public Book(int bookID,String bookName,String bookAuthor,String bookType)
    {
        this.bookID=bookID;
        this.bookName=bookName;
        this.bookAuthor=bookAuthor;
        this.bookType=bookType;
    }
    
    
    public void borrowBook(Reader reader)
    {
        if(reader.numberOfBooks>=4)
        {
            System.out.println(reader.readerName+" has the maximul number of books allowed !");
        }
        else
        {
            reader.books[reader.numberOfBooks]=this;
            reader.numberOfBooks++;
            this.dateBorrow=Calendar.getInstance().getTime();
            //exceed date?
            this.readerID=reader.readerID;
        }
    }
    
    
    
    
}
