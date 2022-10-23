package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Reader> listReaders = new ArrayList<>();
    private static ArrayList<Book> listBooks = new ArrayList<>();

    static {

        listFillingBooks(new Book(1,"Java","Mikel Marshal"));
        listFillingBooks(new Book(2,"Security","Gosh Kari"));
        listFillingBooks(new Book(3,"Git-Hub","Scot Tor"));

        listFillingReaders(new Reader(1,"Liana"));
        listFillingReaders(new Reader(2,"Mark"));
        listFillingReaders(new Reader(3,"Elionora"));
    }

    public static void main(String[] args) {

        System.out.println("WELCOME TO THE LIBRARY!\n");

        boolean cycle = true;
        boolean booleanNullEnterKey = false;
        boolean incorrectEnterKey = false;
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

    private static void listFillingReaders(Reader reader){
        listReaders.add(reader);
    }

    private static void listReadersToString(){
        for (Reader cell : listReaders) {
            System.out.println(cell.getId()+" "+cell.getName());
        }
        System.out.println();
    }
    private static void listFillingBooks(Book book){
        listBooks.add(book);
    }

    private static void listBooksToString(){
        for (Book cell : listBooks) {
            System.out.println(cell.getId()+" "+cell.getName()+" "+cell.getAuthor());
        }
        System.out.println();
    }

}