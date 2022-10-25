package LAB04.Part2;

import java.util.Arrays;

public class Task4 {
    public static void uniqueNum(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            Boolean result = true;
            for (int j = 0; j < myArray.length; j++) {
                if (myArray[i] == myArray[j] && i != j) {
                    result = false;
                }
            }
            if (result) {
                System.out.println(myArray[i]);
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] myArray = {3, 5, 4, 1, 7, 3, 5};
        int i = myArray.length;
        System.out.println(Arrays.toString(myArray));

        uniqueNum(myArray);
    }
}
