package com.digi.addressbook;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        display();
        String choice="y";
        AddressBook addressBook = new AddressBook();
        do{
            System.out.println(" Press 1 : Add contact details");
            System.out.println(" Press 2 : Update contact details");
            System.out.println(" Press 3 : Delete contact details\n");
            System.out.println("Enter your choice : ");
            String ch = scanner.next();


            switch(ch){
                case "1" -> addressBook.addContact();
                case "2" ->  addressBook.updateContact();
                case "3" -> addressBook.deleteContact();
                default -> System.out.println("Invalid choice");
            }
            System.out.println("Do you wish to continue (Y/N) ?");
            choice=scanner.next();
            choice=choice.toLowerCase();
        }while(choice.equals("y"));
    }

    private static void display() {
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("                Welcome to Address Book ");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::\n\n");

    }
}
