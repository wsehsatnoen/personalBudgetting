import java.util.Scanner;

public class InteractiveApplication {
    Scanner input = new Scanner(System.in);


     public void welcomeUser() {
        String email;
        String password;
        System.out.print("Hello! First things first, who ARE you??\n email: ");
        email = input.next();
        System.out.print("\nPassword: ");
        password = input.next();
        System.out.println("\nAttempting log in...");
        Profile.login(email, password);
    }

}
