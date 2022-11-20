package org.example;

import java.util.ArrayList;

public class AddBook {

    private ArrayList<Book> listBooks = new ArrayList<>();

    public ArrayList<Book> getListBooks() {
        return listBooks;
    }

    public AddBook() {

            listFillingBooks(new Book(1,"Java","Mikel Marshal"));
            listFillingBooks(new Book(2,"Security","Gosh Kari"));
            listFillingBooks(new Book(3,"Git-Hub","Scot Tor"));
    }


    private void listFillingBooks(Book book){
        listBooks.add(book);
    }

}
