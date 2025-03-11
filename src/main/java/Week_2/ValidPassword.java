package Week_2;

import java.util.Scanner;

public class ValidPassword {

    /*
    Program that checks if a password is valid according to below specifications or not:
    1. Contains at least 8 characters
    2. Not contain space
    3. First character must be capital
    4. Last character must be ?
        i.e : K123456?
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Getting password from user;
        System.out.print("Please enter your password: ");
        String password = scanner.next();

        //Checking password validity;
        boolean isValid = true;

        if (password.length() < 8) {
            isValid = false;
        } else if (password.contains(" ")) {
            isValid = false;
        } else if (!Character.isUpperCase(password.charAt(0))) {
            isValid = false;
        } else if ((password.charAt((password.length() - 1))) != '?') {
            isValid = false;
        }

        // Printing password validity;
        if (isValid) {
            System.out.print("Valid password!");
        } else {
            System.out.print("InValid password!");
        }

    }
}
