package LAB04.Part1;
import java.util.Scanner;

public class Task3 {
    public static void checkSum(int a, int b, int c) {
        if (a + b == c) {
            System.out.print("Результат: true");
        }
        else {
            System.out.print("Результат: false");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int c = scanner.nextInt();

        checkSum(a, b, c);
    }
}
