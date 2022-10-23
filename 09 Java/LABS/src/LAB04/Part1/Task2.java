package LAB04.Part1;

public class Task2 {
    public static void divBy3() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void divBy5() {
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void divBy3and5() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Делится на 3:");
        divBy3();
        System.out.println("Делится на 5:");
        divBy5();
        System.out.println("Делится на 3 и на 5:");
        divBy3and5();
    }
}
