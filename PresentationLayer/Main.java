package PresentationLayer;

import BusinessLogicLayer.*;

import java.io.IOException;
import java.util.Scanner;

enum Menu {
    ADD, VIEW, EXIT
}

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        boolean loop = true;
        FunctionDetails fd;
        while (loop) {
            System.out.println("What would you like to do? ");
            System.out.println("1. Add A booking");
            System.out.println("2. View all bookings");
            System.out.println("3. Exit");

            System.out.println(" ");
            System.out.println("Enter a Number from list above");

            String selection = sc.next();
            Menu userSelection = Menu.values()[Integer.parseInt(selection) - 1];

            switch (userSelection) {
                case ADD:
                    String name = "";
                    String surname = "";
                    String type = "";
                    String date = "";
                    String time = "";
                    boolean decoration = false;
                    int adults = 0;
                    int kids = 0;
                    String food = "";

                    System.out.println("Your name");
                    name = sc.next();
                    System.out.println("Your surname");
                    surname = sc.next();
                    System.out.println("Type of function");
                    type = sc.next();
                    System.out.println("Date of function");
                    date = sc.next();
                    System.out.println("Time of function");
                    time = sc.next();
                    System.out.println("Will there be decorations? (0 = no, 1 = yes)");
                    decoration = Boolean.parseBoolean(sc.next());
                    System.out.println("How many adults are going");
                    adults = Integer.parseInt(sc.next());
                    System.out.println("How many kids are going");
                    kids = Integer.parseInt(sc.next());
                    System.out.println("What food would you want:");
                    food = sc.next();

                    fd = new FunctionDetails(name, surname, type, date, time, decoration, adults, kids, food);
                    fd.SaveClient();
                    break;
                case VIEW:
                    fd = new FunctionDetails();
                    fd.GetFunctions();
                    break;
                case EXIT:
                    sc.close();
                    loop = false;
                    break;
            }
        }
    }

}

