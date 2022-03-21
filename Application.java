import java.util.List;
import java.util.Scanner;

public class Application {
    Scanner scanner = new Scanner(System.in);

    ContactRepo contactRepo = ContactRepo.getInstance();
    DeleteContact deleteContact = new DeleteContact();
    public static void main(String[] args) {
        int exit = 5;
        int option;

        UserInterface userInterface = new UserInterface();
        Application application = new Application();


        do{
            option = userInterface.ShowMainMenu();
            application.handleUserSelection(option);
        }while (option != exit);
    }
    void handleUserSelection(int option){

        switch (option){
            case 1:
                newContact();
                break;
            case 2:
                List contactList = contactRepo.getContactList();
                contactRepo.printAllContact(contactList);
                break;
            case 3:
                System.out.println("Enter your name");
                String name = scanner.next();
                NewContact contactName = contactRepo.getContact(name);
                deleteContact.removeContact(contactName);
                break;
            case 4://Edit contact
                System.out.println("Enter your name");
                String editName = scanner.next();
                EditContact editContact = new EditContact();
                editContact.EditContact(editName);
            case 5:
                break;
            default:
                System.out.println("Wrong Option..!");
                break;
        }
    }

    void newContact() {
        NewContact newContact = new NewContact();
        System.out.println("Enter employee name");
        newContact.name = scanner.next();
        System.out.println("Enter last name");
        newContact.lastName = scanner.next();
        System.out.println("Enter city name");
        newContact.city = scanner.next();
        System.out.println("Enter state");
        newContact.state = scanner.next();
        System.out.println("Enter zipCode");
        newContact.zipCode = scanner.nextInt();
        System.out.println("Enter phoneNumber");
        newContact.phoneNumber = scanner.nextLong();
        System.out.println("Enter emailID");
        newContact.emailID = scanner.next();
        contactRepo.addContact(newContact);
    }
}
