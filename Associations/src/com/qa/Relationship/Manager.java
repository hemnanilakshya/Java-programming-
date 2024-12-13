package com.qa.Relationship;

import java.util.Scanner;

public class Manager {

    public static void main(String[] args) {
    
        Scanner sc= new Scanner(System.in);
        Books books= new Books();
        System.out.println("please enter bookname you want");
        String b1= sc.nextLine();
        books.setBookName(b1);
        System.out.println("please enter name of author");
        String a1=sc.nextLine();
        books.setAuthorName(a1);
        
        Books books2= new Books();
        System.out.println("please enter bookname you want");
        String b2= sc.nextLine();
        books2.setBookName(b2);
        System.out.println("please enter name of author");
        String a2=sc.nextLine();
        books2.setAuthorName(a2);
        
       
        Student student=new Student();
        
        System.out.println("please enter id of student");
        int id1=sc.nextInt();
        student.setId(id1);
        
        
        sc.nextLine();
        
        System.out.println("please enter name of student");
        String name1=sc.nextLine();
        student.setName(name1);
        
        // Add books to student
        student.addBook(books);
        student.addBook(books2);

        // Display student details
        System.out.println("Student ID: " + student.getId());
        System.out.println("Student Name: " + student.getName());
        System.out.println("Books issued:");
        for (Books book : student.getBookslist()) {
            System.out.println("Book Name: " + book.getBookName() + ", Author: " + book.getAuthorName());
        }

        sc.close();
    }
}
