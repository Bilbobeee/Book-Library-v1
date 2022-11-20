package org.example;

import java.util.List;

public class GetBook {

    public List<Book> getBooksList(){
        AddBook getBooks = new AddBook();
        return getBooks.getListBooks();
    }
}
