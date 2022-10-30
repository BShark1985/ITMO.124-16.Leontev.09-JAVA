package LAB06.Task5;
import java.util.Scanner;

public class Major {
    public int age;
    Scanner scanner = new Scanner(System.in);

    public void EnterInfo() {
        System.out.println("Введите возраст: ");
        age = scanner.nextInt();
        System.out.println("Возвраст: " + age);
    }
}
