package org.example;

import java.util.ArrayList;
import java.util.List;

public class AddBook {

    private List<Book> listBooks = new ArrayList<>();

    public List<Book> getListBooks() {
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
