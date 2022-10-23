package LAB04.Part1;
import java.util.Scanner;

public class Task4 {
    public static void checkNum(int a, int b, int c) {
        if (b > a && c > b) {
            System.out.println("Результат: true");
        }
        else {
            System.out.println("Результат: false");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.println("Введите третье число: ");
        int c = scanner.nextInt();

        checkNum(a, b, c);
    }
}
