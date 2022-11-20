package org.example;

import java.util.ArrayList;

public class GetReader {

    public ArrayList<Reader> getListReaders(){
        AddReader getReader = new AddReader();
        return getReader.getListReaders();
    }

}
