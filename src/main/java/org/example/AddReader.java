package org.example;

import java.util.ArrayList;
import java.util.List;

public class AddReader {

        private List<Reader> listReaders = new ArrayList<>();

    public AddReader() {
        listFillingReaders(new Reader(1,"Liana"));
        listFillingReaders(new Reader(2,"Mark"));
        listFillingReaders(new Reader(3,"Mark"));
    }

    public List<Reader> getListReaders() {
        return listReaders;
    }


        private void listFillingReaders(Reader reader){
            listReaders.add(reader);
        }

}
