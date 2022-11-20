package org.example;

import java.util.Scanner;

public class Launch {

    public void startProcess(){

        AddBook addBook = new AddBook();
        AddReader addReader = new AddReader();

        System.out.println("WELCOME TO THE LIBRARY!\n");

        boolean cycle = true;

        Scanner scanner = new Scanner(System.in);

        while (cycle) {

            System.out.println("PLEASE, SELECT ONE OF THE FOLLOWING ACTIONS BY TYPING THE OPTION’S NUMBER AND PRESSING ENTER KEY: \n" +
                    "[1] SHOW ALL BOOKS IN THE LIBRARY \n" +
                    "[2] SHOW ALL READERS REGISTERED IN THE LIBRARY \n" +
                    "TYPE “EXIT” TO STOP THE PROGRAM AND EXIT!");

            String userRequest = scanner.nextLine();

            switch (userRequest.toLowerCase()) {
                case "1" -> listBooksToString();
                case "2" -> listReadersToString();
                case "exit" -> cycle = false;
                default -> incorrectKey();
            }

        }

        scanner.close();

    }

    private static void incorrectKey(){
        System.out.println("Enter incorrect key, Please enter correct key\n");
    }

    private static void listReadersToString(){
        GetReader getReaders = new GetReader();
        for (Reader cell : getReaders.getListReaders()) {
            System.out.println(cell.getId()+" "+cell.getName());
        }
        System.out.println();
    }

    private static void listBooksToString(){
        GetBook getBook = new GetBook();
        for (Book cell : getBook.getBooksList()) {
            System.out.println(cell.getId()+" "+cell.getName()+" "+cell.getAuthor());
        }
        System.out.println();
    }

}
