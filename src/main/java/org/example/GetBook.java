package org.example;

import java.util.ArrayList;

public class GetBook {

    public ArrayList<Book> getBooksList(){
        AddBook getBooks = new AddBook();
        return getBooks.getListBooks();
    }
}
