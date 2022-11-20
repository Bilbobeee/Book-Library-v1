package org.example;

import java.util.ArrayList;

public class AddReader {

        private ArrayList<Reader> listReaders = new ArrayList<>();

    public AddReader() {
        listFillingReaders(new Reader(1,"Liana"));
        listFillingReaders(new Reader(2,"Mark"));
        listFillingReaders(new Reader(3,"Mark"));
    }

    public ArrayList<Reader> getListReaders() {
        return listReaders;
    }


        private void listFillingReaders(Reader reader){
            listReaders.add(reader);
        }

}
