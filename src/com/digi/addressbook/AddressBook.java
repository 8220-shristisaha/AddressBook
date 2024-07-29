
import java.util.HashMap;
import java.util.Scanner;


public class AddressBook {

    HashMap<String,Contact> map = new HashMap<>();

    public void addContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your contact Details :  ");
        String choice ="y";
        do{
            System.out.println("Enter you name you want ");
            String firstName=scanner.next();

            if(!map.containsKey(firstName)){
                Contact contact = new Contact();
                contact.setFirstName(firstName);
                InsertDetails(scanner,contact);
                map.put(firstName,contact);
            }
            else{
                System.out.println("User exist ");

            }

            System.out.println("Do you wish to add more contacts ? ");
            choice=scanner.next();
            choice =choice.toLowerCase();

        }while(choice.equals("y"));

    }

    public void updateContact(){

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name= scanner.next();
        if(map.containsKey(name)){
            UpdateContact updateContact= new UpdateContact();
            System.out.println("\n What you want to update ?\n");
            displayUpdateItems();
            String choice =scanner.next();
            switch (choice){
                case "1" -> updateContact.changeUserName(map,scanner,name);
                case "2" -> updateContact.changeAddress(map,scanner,name);
                case "3" -> updateContact.changeCity(map,scanner,name);
                case "4" -> updateContact.changeState(map,scanner,name);
                case "5" -> updateContact.changeZip(map,scanner,name);
                case "6" -> updateContact.changeEmail(map,scanner,name);
                default -> System.out.println("Invalid choice.");
            }

        }
        else{
            System.out.println("User Not available");
        }
    }
    public void deleteContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name you want to delete : ");
        String name = scanner.next();

        if(map.containsKey(name)){
            Contact contact = map.get(name);
            contact=null;
            map.remove(name);
        }
        else{
            System.out.println("User Not available");
        }
    }

    private void displayUpdateItems() {
        System.out.println("Press 1 : Update first Name and Last Name");
        System.out.println("Press 2 : Update address ");
        System.out.println("Press 3 : Update city ");
        System.out.println("Press 4 : Update state");
        System.out.println("Press 5 : Update Zip ");
        System.out.println("Press 6 : Update email");
    }


    private void InsertDetails(Scanner scanner, Contact contact) {


        System.out.println("Enter you Last Name : ");
        String lastName = scanner.next();
        contact.setLastName(lastName);

        System.out.println("Enter you address : ");
        String address = scanner.next();
        contact.setAddress(address);

        System.out.println("Enter you city : ");
        String city = scanner.next();
        contact.setCity(city);

        System.out.println("Enter you state : ");
        String state = scanner.next();
        contact.setState(state);

        System.out.println("Enter you zip : ");
        String zip = scanner.next();
        contact.setZip(zip);

        System.out.println("Enter you Phone Number : ");
        String phoneNumber = scanner.next();
        contact.setZip(phoneNumber);

        System.out.println("Enter you email : ");
        String email = scanner.next();
        contact.setEmail(email);
    }



}