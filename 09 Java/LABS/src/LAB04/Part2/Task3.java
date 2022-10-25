package LAB04.Part2;

import java.util.Arrays;

public class Task3 {
    public static void changeArr(int i, int[] myArray){
        int intermediateValue = myArray[0];
        myArray[0] = myArray[i-1];
        myArray[i-1] = intermediateValue;
        System.out.println("Array 2: " + Arrays.toString(myArray));
    }

    public static void main(String[] args) {
        int[] myArray = {3, 5, 4, 1, 7};
        int i = myArray.length;
        System.out.println("Array 1: " + Arrays.toString(myArray));
        changeArr(i, myArray);
    }
}
