package LAB06.Task5;

public class Heir extends Major{
    public String name;

    @Override
    public void EnterInfo() {
        System.out.println("Введите имя: ");
        name = this.scanner.nextLine();
        System.out.println("Имя: " + name);
    }
}
