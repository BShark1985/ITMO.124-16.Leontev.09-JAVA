package LAB06.Task3;

public class Main {
    public static void main(String[] args) {
        Truck track = new Truck(3500, "IVECO", 'B', 200, 4, 20);
        track.ShowInfo();
        System.out.println("------------------");

        track.newWheels(6);
        track.ShowInfo();
    }
}
