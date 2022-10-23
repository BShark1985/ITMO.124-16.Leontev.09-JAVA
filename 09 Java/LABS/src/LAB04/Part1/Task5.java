package LAB04.Part1;
import java.util.Arrays;

public class Task5 {
    public static void checkFirstNum(int[] array) {
        int[] myArray = new int[5];
        if (array[0] == 3 || array[4] == 3) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }

    public static void main(String[] args) {
        int[] myArray = {3, 5, 4, 1, 7};
        System.out.println(Arrays.toString(myArray));
        checkFirstNum(myArray);
    }
}
