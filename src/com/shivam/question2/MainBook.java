package com.shivam.question2;

import com.shivam.question2.Library;


import java.util.Scanner;

public class MainBook {

    public static void main(String[] args) {
        Library library=new Library();
        while (true){

            Scanner input=new Scanner(System.in);
            System.out.println("Choose from the following-");
            System.out.println("1.Add Book");
            System.out.println("2.Display all Book Details");
            System.out.println("3.Search book by author");
            System.out.println("4.Count Number of Books By book Name");
            System.out.println("5.Exit");
            System.out.println("Enter your choice");
            int choice=input.nextInt();

            if(choice==1){


             System.out.println("Enter te isbn no.");
             int isbn=input.nextInt();

             System.out.println("Enter the book Name");
             String name=input.next();

             System.out.println("Enter the Author Name");
             String authorName=input.next();

             Book bookCreated=new Book(isbn,name,authorName);

             library.addBook(bookCreated);
            }

            else if(choice==2){
                System.out.println(library.viewAllBooks());
            }
            else if(choice==3){
                System.out.println("Enter the Author Name");
                String authorName=input.next();

                System.out.println(library.viewBooksByAuthor(authorName));
            }
            else if(choice==4){
                System.out.println("Enter the book Name");
                String name=input.next();
                System.out.println("Count of books => "+library.countNoOfBook(name));
            }

            else{
                System.out.println("Thank you");
                break;
            }



        }
    }
}
