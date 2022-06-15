package com.shivam.question2;

import java.util.ArrayList;
import java.util.List;

/*
 void addBook(Book book): This method should add the book object to the
booklist.
2. boolean isEmpty(): This method should return true if the booklist is empty else
return false.
3. List<Book> viewAllBooks(): This method should return the list of books
maintained in the library.
4. List<Book> viewBooksByAuthor(String author ) - This method should return a
list of books written by the author passed as an argument. When you display an
empty list it should print the message "The list is empty".
5. int countNoOfBook(String bookName) - this method should return the count of
books with the name passed as an argument.
 */
public class Library {

    List<Book> bookList=new ArrayList<>();

    public void addBook(Book book){


       bookList.add(book);

        System.out.println("Book is added to the Library");

    }
    public  boolean isEmpty(){
        if(bookList.size()==0){
            return true;
        }
        return false;
    }

    public List<Book> viewAllBooks(){
        return bookList;
    };

    public List<Book> viewBooksByAuthor(String author ){
        List<Book> listOfBooks=new ArrayList<>();
        for(Book b: bookList){
            if(b.getAuthor().equals(author)){
                listOfBooks.add(b);
            }
        }
        return listOfBooks;
    };

    public int countNoOfBook(String bookName){

        int count=0;
        for (Book b: bookList){
            if(b.getBookName().equals(bookName)){
                count++;
            }
        }
        return count;
    };
}
