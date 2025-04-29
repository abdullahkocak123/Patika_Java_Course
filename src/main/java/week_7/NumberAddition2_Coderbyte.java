package week_7;

import java.util.ArrayList;
import java.util.List;

public class NumberAddition2_Coderbyte {
    public static void main(String[] args) {
        //int[] numbers = new int[] {5, 7, 16, 1, 2};
        int[] numbers = new int[] {3, 5, -1, 8, 12};
        //int[] numbers = {1, 2, 3, 4};

        int biggestNumber = numbers[0];

        for (int number : numbers){
            if (number>biggestNumber){
                biggestNumber = number;
            }
        }

        List<Integer> numbersExceptBiggest = new ArrayList<>();
        for (int number : numbers){
            if (number != biggestNumber){
                numbersExceptBiggest.add(number);
            }
        }

        int powerSet = 1 << numbersExceptBiggest.toArray().length;

        for (int i=0; i< powerSet; i++){
            int sum = 0;
            for (int j=0; j<numbersExceptBiggest.toArray().length; j++){
                if ((i & (1<<j)) != 0){
                    sum = sum + numbersExceptBiggest.get(j);
                    System.out.println(sum);
                    if (sum==biggestNumber){
                        System.out.println("found");
                    }
                }
            }
        }

        System.out.println(biggestNumber);
        System.out.println(powerSet);
    }
}
