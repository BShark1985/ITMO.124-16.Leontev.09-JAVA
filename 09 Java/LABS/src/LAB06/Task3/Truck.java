package LAB06.Task3;

public class Truck extends Car{
    public int wheelsQuantity;
    public int maxWeight;

    public Truck(int weight, String model, char color, float speed, int wheelsQuantity, int maxWeight) {
        super(weight, model, color, speed);
        this.wheelsQuantity = wheelsQuantity;
        this.maxWeight = maxWeight;
    }

    public void newWheels(int wheelsQuantity) {
        this.wheelsQuantity = wheelsQuantity;
        System.out.println("Устновлено количество колес: " + wheelsQuantity);
    }

    public void ShowInfo() {
        System.out.println("Модель: " + model);
        System.out.println("Цвет: " + color);
        System.out.println("Скорость: " + speed);
        System.out.println("Количество колес: " + wheelsQuantity);
        System.out.println("Максимальный вес: " + maxWeight);
    }
}
