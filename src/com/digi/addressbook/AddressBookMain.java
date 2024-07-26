package com.digi.addressbook;

import com.digi.contacts.Contact;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class AddressBookMain {
    public static void main(String[] args) {




        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("                Welcome to Address Book ");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println();
        System.out.println();
        AddressBook addressBook = new AddressBook();

        System.out.println(" Press 1 : Add contact details");
        System.out.println();
        System.out.println("Enter your choice : ");
        Scanner scanner= new Scanner(System.in);

        int choice = scanner.nextInt();

        switch(choice){
            case 1 -> {
                Contact contact = addressBook.addContact();
                System.out.println(contact);
            }

        }

    }
}