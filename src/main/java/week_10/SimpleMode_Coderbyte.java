package week_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SimpleMode_Coderbyte {

    public static void main(String[] args) {

        /*The function takes the array of numbers nad returns the number that appears most frequently.
        If there is more than 1, output should be the first.
        If there is nı repeat, output should be -1
        examples:
         4 for 10, 4, 5, 2, 4
         5 for 5, 5, 2, 2, 1
         -1 for 3, 4, 1, 6, 10
         */

        int[] numbers = {10, 4, 5, 2, 4};

        //int [] numberFrequencies = new  int [numbers.length]; //for each ile indeks belirtmeden çalışmak için arraylist:
        List<Integer> numberFrequencies = new ArrayList<>();

        for (int number : numbers) {
            int indexFrequency = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (number == numbers[i]) {
                    indexFrequency++;
                }
            }
            numberFrequencies.add(indexFrequency);
        }

        if (Collections.max(numberFrequencies) == 1){
            System.out.println(-1);
            return;
        }

        int max = numberFrequencies.get(0);
        int indexOfMax = 0;
        for (int i = 0; i < numberFrequencies.size(); i++) {
            if (numberFrequencies.get(i) > max) {
                max = numberFrequencies.get(i);
                indexOfMax = i;
            }
        }

        //max için alternatif yöntem (ama indeksi bilemiyoruz):
        //int max2 = Collections.max(numberFrequencies);

        //System.out.println(numberFrequencies);
        //System.out.println(max);
        //System.out.println(indexOfMax);
        System.out.println(numbers[indexOfMax]);
        //System.out.println(max2);
    }
}
