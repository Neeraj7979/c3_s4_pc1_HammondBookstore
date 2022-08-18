package com.bookstore;

import data.Author;
import data.Book;

public class BookImpl {
    public static void main(String[] args) {
        Book b1=new Book();
        b1.setIsbnNumber(123456789567L);
        b1.setTitle("Over the Horizon");
        b1.setDescription("Novel based on true incident");
        b1.setPrice(2545.89);
        Author a1=new Author("David M Heldestin","David" );
        b1.setAuthor(a1);

        b1.displayBookDetails();
        System.out.println(a1);
    }
}
