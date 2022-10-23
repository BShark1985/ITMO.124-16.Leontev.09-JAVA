package LAB04.Part2;

import java.util.Arrays;

public class Task3 {
    public static void changeArr(int[] myArray){
        int first = myArray[myArray.length - 5];
        int last = myArray[myArray.length - 1];
        for(int i = myArray.length - 1; i > 3; --i){
            myArray[i] = myArray[i-1];
        }
        myArray[4] = first;
        myArray[0] = last;

        System.out.println("Array 2: " + Arrays.toString(myArray));
    }

    public static void main(String[] args) {
        int[] myArray = {3, 5, 4, 1, 7};
        System.out.println("Array 1: " + Arrays.toString(myArray));
        changeArr(myArray);
    }
}
