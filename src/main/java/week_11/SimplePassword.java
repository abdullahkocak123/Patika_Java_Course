package week_11;

public class SimplePassword {

    public static void main(String[] args) {

        /*
        A function which returns true if given password (String) valid according to constraints:
        - must have a capital letter
        - must contain at least one number
        - must contain a punctuation or mathematical symbol
        - it can not have word "password"
        - must be longer than 7 characters and shorter than 31
         */

        String input = "Word1!12";

        System.out.println(isPasswordValid(input));

    }

    private static boolean isPasswordValid(String input) {

        //- must have a capital letter
        boolean containsUpperCase = false;
        for (char c : input.toCharArray()){
            if (Character.isUpperCase(c)){
                containsUpperCase = true;
                break;
            }
        }
        if (!containsUpperCase){
            System.out.println(1);
            return false;
        }

        //- must contain at least one number
        boolean containsDigit = false;
        for (char c : input.toCharArray()){
            if (Character.isDigit(c)){
                containsDigit = true;
                break;
            }
        }
        if (!containsDigit){
            System.out.println(2);
            return false;
        }

        //- must contain a punctuation or mathematical symbol

        if (!input.matches(".*[\\p{P}\\p{S}].*")){
            System.out.println(3);
            return false;
        }

        //- it can not have word "password"
        if (input.toLowerCase().contains("password")){
            System.out.println(4);
            return false;
        }

        //- must be longer than 7 characters and shorter than 31
        if (input.length() < 8 || input.length() > 30){
            System.out.println(5);
            return false;
        }


        return true;

    }
}
