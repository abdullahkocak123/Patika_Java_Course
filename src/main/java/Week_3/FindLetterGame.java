package Week_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindLetterGame {
    /*
Arrange an Arraylist which contains 4 letters.
Take 4 letters one by one from user. If a letter matches, change letter with "found". If not, add letter.
Print updated letters
 */
    public static void main(String[] args) {

        //Generating an Arrayist of 4 letters.
        List<String> letters = new ArrayList<>();
        letters.add("a");
        letters.add("b");
        letters.add("c");
        letters.add("d");

        //Getting letters from user
        Scanner scanner = new Scanner(System.in);
        String searchedLetter;
        for (int i = 1; i < 5; i++) {
            System.out.print("Enter " + i + ". letter: ");
            //Checking if letter is matched, replace it with "found"
            searchedLetter = scanner.next();
            boolean match = false;
            for (int j = 0; j < letters.size(); j++) {
                if (letters.get(j).equals(searchedLetter)) {
                    letters.set(j, "found");
                    match = true;
                    break;
                }
            }
            //if there is no match add letter to list
            if (!match) {
                letters.add(searchedLetter);
            }
        }
        //Print updated letters
        System.out.println(letters);

    }
}
