package LAB04.Part2;

import java.util.Arrays;

public class Task1 {
    public static void checkSort(int[] array) {
        int[] myArray = new int[5];
//        Запутался, не срабатывает IF
//        for (int i = 0; i < 4; i++) {
//            if (array[i] > array[i + 1]) {
//                System.out.println("Please, try again")
//                break;
//            } else {
//                System.out.println("OK");
//            }
//        }
        if (array[0] < array[1] && array[1] < array[2] && array[2] < array[3] && array[3] < array[4]) {
                System.out.println("OK");
            } else {
                System.out.println("Please, try again");
            }
    }

    public static void main(String[] args) {
        int[] myArray = {3, 5, 4, 1, 7};
        System.out.println(Arrays.toString(myArray));
        checkSort(myArray);
    }
}
