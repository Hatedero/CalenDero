package ui.cmd;

import auth.DeroAuth;
import user.DeroUserModel;

import java.util.Scanner;

public class Menu {
    public static void demo() {
        DeroUserModel user = null;

        Scanner scanner = new Scanner(System.in);

        System.out.println("CalenDero - v0.01");

        String userInput = "";

        while(user == null) {

            System.out.println("1 - Sign Up\n2 - Log In" );

            userInput = scanner.nextLine();

            String username = "";
            String password = "";

            switch (userInput) {
                case "1":
                    Boolean validUsername = false;
                    while(!validUsername) {
                        System.out.println("Please choose a username");
                        username = scanner.nextLine();
                        if(DeroAuth.userExists(username))
                            System.out.println("Username is already taken");
                        else
                            validUsername = true;
                    }

                    System.out.println("Please choose a password");
                    password = scanner.nextLine();

                    System.out.println("Creating new user profile");
                    if(DeroAuth.signUp(username, password)) {
                        System.out.println("Account created succesfuly");
                        break;
                    }
                    else {
                        System.out.println("an error occured - please try again");
                    }
                    break;

                case "2":
                    System.out.println("Enter username");
                    username = scanner.nextLine();

                    System.out.println("Enter password");
                    password = scanner.nextLine();

                    System.out.println("Identifying user");
                    if(DeroAuth.validateIdentifiers(username, password)) {
                        System.out.println("Log In succesful");
                        user = DeroAuth.login(username, password);
                        break;
                    }
                    else {
                        System.out.println("incorrect username or password");
                    }
            }
        }

        System.out.println("1 - see all calendars\n2 - create new calendar");


    }
}
