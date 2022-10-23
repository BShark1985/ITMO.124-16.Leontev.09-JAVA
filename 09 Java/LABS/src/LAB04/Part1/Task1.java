package LAB04.Part1;

public class Task1 {
    public static void oddNumbers() {
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        oddNumbers();
    }
}
