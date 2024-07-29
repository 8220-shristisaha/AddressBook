import java.util.HashMap;
import java.util.Scanner;

public class UpdateContact {
    public void changeUserName(HashMap<String, Contact> map, Scanner scanner, String oldName) {

        Contact newContact=map.get(oldName);
        System.out.println("Enter your new First Name ");
        String firstName= scanner.next();
        newContact.setFirstName(firstName);

        System.out.println("Enter your new Last Name ");
        String lastName= scanner.next();
        newContact.setLastName(lastName);
        map.remove(oldName);
        map.put(firstName,newContact);


    }
    public void changeEmail(HashMap<String, Contact> map, Scanner scanner, String name) {
        Contact newContact=map.get(name);
        System.out.println("Enter your New Email ID: ");
        String email= scanner.next();

        newContact.setEmail(email);
        map.put(name,newContact);

    }

    public void changeZip(HashMap<String, Contact> map, Scanner scanner, String name) {
        Contact newContact=map.get(name);
        System.out.println("Enter your New Zip : ");
        String zip= scanner.next();

        newContact.setEmail(zip);
        map.put(name,newContact);

    }

    public void changeState(HashMap<String, Contact> map, Scanner scanner, String name) {
        Contact newContact=map.get(name);
        System.out.println("Enter your New State: ");
        String state= scanner.next();

        newContact.setEmail(state);
        map.put(name,newContact);

    }

    public void changeCity(HashMap<String, Contact> map, Scanner scanner, String name) {
        Contact newContact=map.get(name);
        System.out.println("Enter your New city: ");
        String city= scanner.next();

        newContact.setEmail(city);
        map.put(name,newContact);

    }

    public void changeAddress(HashMap<String, Contact> map, Scanner scanner, String name) {
        Contact newContact=map.get(name);
        System.out.println("Enter your New Address: ");
        String Address= scanner.next();

        newContact.setEmail(Address);
        map.put(name,newContact);
    }
}
