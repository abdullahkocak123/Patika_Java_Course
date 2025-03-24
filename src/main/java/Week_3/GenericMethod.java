package Week_3;

public class GenericMethod {

    public static void main(String[] args) {

        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"Java", "Generics", "Ödev"};

        //Calling the Generic Method below with arrays above to print different type of arrays
        printArray(intArray);
        printArray(strArray);

    }

    //Generating a Generic Method which prints arrays of different types (Integer, String, Double etc.)
    public static <T> void printArray(T[] input) {

        for (T value : input) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
