package task01;
import java.util.Scanner;

public class task1_06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число до 100:\n");
        int b = in.nextInt();
        if ( b %2 == 1){
            System.out.println("Нечетное");
        }
        else if (b %2 == 0 && b <= 100){
            System.out.println("Четное");
        }
        else {
            System.out.println("Выход за пределы диапазона");
        }
    }
}
