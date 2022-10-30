package LAB06.Task4;
import java.util.Scanner;

public class Major {
    Scanner scanner = new Scanner(System.in);

    public int integer;

    public void EnterInteger() {
        System.out.println("Введите число: ");
        integer = scanner.nextInt();
    }

}
