package task02;

public class Task2_02Picture {
    String title;
    String artistName;
    int price;

    //конструктор для известных картин
    public Task2_02Picture(String title, String artistName, int price) {
        this.title = title;
        this.artistName = artistName;
        this.price = price;
    }

    //для неизвестных картин конструктор по умолчанию
    public Task2_02Picture() {
    }

    public static void main(String[] args) {

        Task2_02Picture blsq = new Task2_02Picture("Black Square", "Malevich", 5000000);
        Task2_02Picture unknow = new Task2_02Picture();

        System.out.println(blsq.title);
        System.out.println(unknow.title);

    }
}
