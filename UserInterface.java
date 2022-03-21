import java.util.Scanner;

public class UserInterface {
    int ShowMainMenu(){
        System.out.println("Welcome to Address book ");
        System.out.println("1: Create new Contact \n2: Show all contact \n3: Delete contact\n4: Edit Contact\n5: Exit");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        return option;
    }
}
