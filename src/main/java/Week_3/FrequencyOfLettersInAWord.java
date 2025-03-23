package Week_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfLettersInAWord {

    public static void main(String[] args) {

        //Getting a word from user:
        System.out.println("Give a word: ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        //Form a hashmap for calculating letters and their frequency
        Map<Character, Integer> lettersFrequency = new HashMap<>();

        //calculating letters frequency:
        for (int i = 0; i < word.length(); i++) {
            if (Character.isLetter(word.charAt(i))) { // ignoring other than letters
                char currentChar = Character.toLowerCase(word.charAt(i));
                if (!(lettersFrequency.containsKey(currentChar))) {
                    lettersFrequency.put(currentChar, 1);
                } else {
                    int numberOfLetter = lettersFrequency.get(currentChar);
                    lettersFrequency.put(currentChar, numberOfLetter + 1);
                }
            }
        }

        //Printing letters and their frequency in hashmap
        for (Map.Entry<Character, Integer> entry : lettersFrequency.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

    }
}
