/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library;

import java.util.Date;




/**
 *
 * @author Catalin
 */
public class Reader
{
    int readerID;
    int readerGroup;
    int numberOfBooks;
    String readerCNP;
    String readerName;
    Book books[]; 
    
    
    
    
    
    
    
    //Create a new reader
    public Reader(int readerID, String CNP, int readerGroup, String readerName)
    {
        this.readerID=readerID;
        this.readerCNP=CNP;
        this.readerGroup=readerGroup;
        this.readerName=readerName;
        this.numberOfBooks=0;
        books = new Book[4];
        for(int i=0;i<4;i++)
        {
            //Instance the vector of 4 maximum books with 0
            this.books[i]=null;
        } 
    }
    
    
    //Return a book
    public void returnBook(Book book)
    {
        
        
        
        boolean returned = false;
        for(int i=0;i<this.numberOfBooks;i++)
        {
            if(book.bookID==this.books[i].bookID)
            {
                this.books[i]=null;
                this.numberOfBooks--;
                book.readerID=0;
                book.dateExceed=null;
                book.dateBorrow=null;
                Date hasExceed = new Date();
                if(hasExceed.after(book.dateExceed))
                {
                    System.out.println("The book has been returned later !");
                }
                
                returned=true;
                break;
            }
        }
        if(returned==false)
        {
            System.out.println("There might be an error : The book was not borrowed by this reader !");
        }
        
        
    }
        
    //Method for showing all books
    public void showBooks()
    {
        for(int i=0;i<this.numberOfBooks;i++)
        {
            System.out.println(this.books[i].bookID+" "+this.books[i].bookName);
        }
    }
}
        
    
    

