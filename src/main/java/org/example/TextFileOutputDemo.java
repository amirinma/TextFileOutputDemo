package org.example;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.sql.SQLSyntaxErrorException;

public class TextFileOutputDemo {
    public static void main(String[] args){
        PrintWriter outputStream = null;
        try {
            outputStream = new PrintWriter(new FileOutputStream("staff.txt", true));
        } catch (FileNotFoundException e){
            System.out.println("Error opening the file staff.txt");
            System.exit(0);
        }

        System.out.println("Wri ting to the file");
        outputStream.println("The quick brown fox!");
        outputStream.println("jumps over the lazy dog.");
        outputStream.println("This is the list line");
        outputStream.close();
        System.out.println("End of program!");
        System.out.println("Second program Started");
        PrintWriter outputStream1 = null;
        try {
            outputStream1 = new PrintWriter(new FileOutputStream("staff.txt", true));
        } catch (FileNotFoundException e){
            System.out.println("Error opening file");
            System.exit(0);
        }
        outputStream1.println("I am first line of the second try");
        outputStream1.close();
        System.out.println("Second program closed!");

        PrintWriter outputStream2 = null;
        try {
            outputStream2 = new PrintWriter("staff.txt");
        } catch (FileNotFoundException e){
            System.out.println("Error opening the file.");
            System.exit(0);
        }
        outputStream2.println("I am writing from the third file");
        outputStream2.close();
    }
}
