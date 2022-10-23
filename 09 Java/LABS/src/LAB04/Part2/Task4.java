package LAB04.Part2;

import java.util.Arrays;

public class Task4 {
    public static int uniqueNum(int[] array){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max) max = array[i];
        }
        return max;
    }

    public static void main(String[] args) {
        int[] myArray = {3, 5, 4, 1, 7, 3, 5};
        System.out.println(Arrays.toString(myArray));
        int[] counts = new int[uniqueNum(myArray) + 1];

        for (int i = 0; i < myArray.length; i++) {
            counts[myArray[i]]++;
        }

        for (int i = 0; i < myArray.length; i++) {
            if(counts[myArray[i]] == 1) System.out.print(myArray[i] + " ");
        }

        uniqueNum(myArray);
    }
}
