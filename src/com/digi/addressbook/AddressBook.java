package com.digi.addressbook;

import com.digi.contacts.Contact;

import java.util.Scanner;

public class AddressBook {
    Scanner scanner = new Scanner(System.in);

    public Contact addContact() {
        System.out.println("Enter your contact Details :  ");

        System.out.println("Enter you First Name : ");
        String firstName = scanner.next();
        System.out.println("Enter you Last Name : ");
        String lastName = scanner.next();
        System.out.println("Enter you address : ");
        String address = scanner.next();
        System.out.println("Enter you city : ");
        String city = scanner.next();
        System.out.println("Enter you state : ");
        String state = scanner.next();
        System.out.println("Enter you zip : ");
        String zip = scanner.next();
        System.out.println("Enter you Phone Number : ");
        String phoneNumber = scanner.next();
        System.out.println("Enter you email : ");
        String email = scanner.next();
        return new Contact(firstName, lastName, address,city,state,zip,phoneNumber,email);
    }
}