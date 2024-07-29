import java.util.HashMap;
import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        display();
        String choice="y";
        HashMap<String,AddressBook> booklet= new HashMap<>();
        System.out.println(" Create a Book ");
        System.out.println("Enter the name of your Book");
        String book = scanner.next();
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
            System.out.println("Do you wish to continue to add/update/delete in Address Book(Y/N) ?");
            choice=scanner.next();
            choice=choice.toLowerCase();
        }while(choice.equals("y"));
        booklet.put(book,addressBook);
    }

    private static void display() {
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("                Welcome to Address Book ");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::\n\n");

    }
}
