package LAB04.Part2;

import java.util.Arrays;

public class Task1 {
    public static void checkSort(int[] myArray) {
        boolean result = true;

        for (int i = 0; i < myArray.length - 1; i++) {
            if (myArray[i] > myArray[i + 1]) {
                result = false;
            }
        }
        if (result) {
            System.out.println("OK");
        } else {
            System.out.println("Please, try again");
        }
    }

    public static void main(String[] args) {
        int[] myArray = {3, 5, 4, 1, 7};
        int i = myArray.length;
        System.out.println(Arrays.toString(myArray));
        checkSort(myArray);
    }
}
