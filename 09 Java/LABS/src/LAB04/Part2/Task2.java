package LAB04.Part2;
import java.util.Scanner;
import java.util.Arrays;


public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int count = scanner.nextInt();
        int[] myArray = new int[count];
        System.out.println("Введите " + count + " значения через enter: ");


        for (int i = 0; i < count; i++){
            System.out.println("Введите значение" + i + " :");
            myArray[i] = scanner.nextInt();
        }

        System.out.println("Array length: " + count);
        System.out.println("Result " + Arrays.toString(myArray));
    }
}
