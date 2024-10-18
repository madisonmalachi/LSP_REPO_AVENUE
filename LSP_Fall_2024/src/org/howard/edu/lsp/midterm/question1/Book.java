package org.howard.edu.lsp.midterm.question1;

/**
* Represents a Book in a library with attributes such as title, author, ISBN, and yearPublished.
* the source: https://www.geeksforgeeks.org/java/
*/
public class Book {
 private String title;
 private String author;
 private String ISBN;
 private int yearPublished;

 // Constructor
 public Book(String title, String author, String ISBN, int yearPublished) {
     this.title = title;
     this.author = author;
     this.ISBN = ISBN;
     this.yearPublished = yearPublished;
 }

 // Getters
 public String getTitle() { return title; }
 public String getAuthor() { return author; }
 public String getISBN() { return ISBN; }
 public int getYearPublished() { return yearPublished; }

 // equals method to compare books by ISBN and author
 @Override
 public boolean equals(Object obj) {
     if (this == obj) return true;
     if (!(obj instanceof Book)) return false;
     Book other = (Book) obj;
     return ISBN.equals(other.ISBN) && author.equals(other.author);
 }

 // toString method for a meaningful representation of the Book
 @Override
 public String toString() {
     return String.format("Title: %s, Author: %s, ISBN: %s, Year Published: %d", title, author, ISBN, yearPublished);
 }
}