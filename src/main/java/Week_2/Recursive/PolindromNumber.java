package Week_2.Recursive;

import java.util.Scanner;

public class PolindromNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number:  ");
        int number = scanner.nextInt();

        String str = String.valueOf(number);

        boolean isPalindrom = false;
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i)== str.charAt(str.length()-1-i)){
                isPalindrom = true;
            } else {
                isPalindrom = false;
                break;
            }
        }
        System.out.println(isPalindrom ? "Palindrom" : "Not Polindrom!");
    }
}
