package LAB04.Part1;

import java.util.Arrays;

public class Task6 {
    public static void checkNum1and3(int[] array) {
        int[] myArray = new int[5];
        for (int i : array) {
            if (i == 1 || i == 3) {
                System.out.println("true");
                break;
            } else {
                System.out.println("false");
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] myArray = {3, 5, 4, 1, 7};
        System.out.println(Arrays.toString(myArray));
        checkNum1and3(myArray);
    }
}
