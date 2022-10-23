package LAB03.Task02;

public class task03_02Car {
    String color;
    String autoName;
    int weight;

    public task03_02Car(String color, String autoName, int weight) {
    }

    public void task03_02Car(String color, String autoName, int weight) {
        this.color = color;
        this.autoName = autoName;
        this.weight = weight;
    }

    public void task03_02Car(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public void task03_02Car(String color) {
        this.color = color;
    }

    private static void show(task03_02Car task03_02Car) {
        System.out.println(task03_02Car.color + " " + task03_02Car.autoName + " " + task03_02Car.weight);
    }

    public static void main(String[] args) {
        task03_02Car audi = new task03_02Car("Black", "Audi", 1500);
        task03_02Car ford = new task03_02Car("White", "Ford", 1300);

        task03_02Car.show(audi);
        task03_02Car.show(ford);
    }
}
