package org.example;

import java.util.ArrayList;
import java.util.List;

public class GetReader {

    public List<Reader> getListReaders(){
        AddReader getReader = new AddReader();
        return getReader.getListReaders();
    }

}
