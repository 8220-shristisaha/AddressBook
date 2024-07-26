package com.digi.addressbook;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);

        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("                Welcome to Address Book ");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println();
        System.out.println();


        String choice="y";
        do{
            System.out.println(" Press 1 : Add contact details");
            System.out.println(" Press 2 : Update contact details");
            System.out.println();

            System.out.println("Enter your choice : ");
            String ch = scanner.next();

            AddressBook addressBook = new AddressBook();
            switch(ch){
                case "1" -> addressBook.addContact();
                case "2" ->  addressBook.updateContact();
                default -> System.out.println("Invalid choice");
            }
            System.out.println("Do you wish to continue (Y/N) ?");
            choice=scanner.next();
            choice=choice.toLowerCase();
        }while(choice.equals("y"));

    }
}
