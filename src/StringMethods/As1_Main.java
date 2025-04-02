package StringMethods;

import Ex3_MusicFestival.Library;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;

public class As1_Main {
    public static Scanner input = new Scanner(System.in);
    static ArrayList <As1_Message> allMessages;

    public static void run() {
        System.out.println("Assign 1 Network Messages");
       allMessages = new ArrayList<>();
       allMessages.add(new As1_Message("Server1: file not found"));

        while (true) {
            System.out.println("\nWhat do you want to do?");
            System.out.println("1. Add Message");
            System.out.println("2. Print All Messages");
            System.out.println("3. Scan for Error Messages");
            System.out.println("4. EXIT");
            int option = input.nextInt();
            input.nextLine();
            System.out.println();

            if (option == 1) {
                System.out.println("What is the message name?");
                String providedMessage = Library.input.nextLine();


            } else if (option == 2) {

            } else if (option == 3) {

            } else if (option == 4) {
                System.out.println("Logging out. Good Bye.");
                break;
            } else {
                System.out.println("That is not an available option");
            }
        }//while

    }//main

}
