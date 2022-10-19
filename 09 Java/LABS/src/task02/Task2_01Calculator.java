package task02;

public class Task2_01Calculator {
    // сложение
    public int amount(int a, int b) {
        return a + b;
    }
    public double amount(double a, double b) {
        return a + b;
    }public long amount(long a, long b) {
        return a + b;
    }

    // деление
    public double division(int a, int b) {
        return (double) a / b;
    }
    public double division(double a, double b) {
        return a / b;
    }public double division(long a, long b) {
        return (double) a / b;
    }

    // умножение
    public int multiplication(int a, int b) {
        return a * b;
    }
    public double multiplication(double a, double b) {
        return a * b;
    }
    public long multiplication(long a, long b) {
        return a * b;
    }

    // вычитание
    public int subtraction(int a, int b) {
        return a - b;
    }
    public double subtraction(double a, double b) {
        return a - b;
    }
    public long subtraction(long a, long b) {
        return a - b;
    }
}
