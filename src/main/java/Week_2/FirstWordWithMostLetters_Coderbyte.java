package Week_2;

import java.util.Scanner;

public class FirstWordWithMostLetters_Coderbyte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give your sentence: ");
        String input = scanner.nextLine();

        String[] words = input.split(" ");

        //for (String word : words) {
        //  System.out.println(word);
        //}

        //System.out.println(repeatedLettersInOneWord(words[0]));

        int[] numberOfRepeatedLettersInWords = new int[words.length];

        for (int i = 0; i < words.length; i++) {
            numberOfRepeatedLettersInWords[i] = repeatedLettersInOneWord(words[i]);
        }

        //for (int x : numberOfRepeatedLettersInWords){
        //  System.out.println(x);
        //}

        int maxLettersInWords = numberOfRepeatedLettersInWords[0];
        for (int number : numberOfRepeatedLettersInWords) {
            if (number > maxLettersInWords) {
                maxLettersInWords = number;
            }
        }
        //System.out.println(maxLettersInWords);

        String result = "";
        for (int i = 0; i < words.length; i++) {
            if (numberOfRepeatedLettersInWords[i] == maxLettersInWords) {
                result = words[i];
                break;
            }
        }
        if (maxLettersInWords == 1) {
            System.out.println(-1);
        } else {
            System.out.println(result);
        }

    }

    public static int repeatedLettersInOneWord(String word) {
        //Hello
        int maxRepeat = 1;
        for (int i = 0; i < word.length(); i++) {
            char searhedChar = word.charAt(i);
            int repeat = 1;
            for (int j = i + 1; j < word.length(); j++) {
                if (searhedChar == word.charAt(j)) {
                    repeat++;
                }
                if (repeat > maxRepeat) {
                    maxRepeat = repeat;
                }
            }
        }
        return maxRepeat;
    }
}
