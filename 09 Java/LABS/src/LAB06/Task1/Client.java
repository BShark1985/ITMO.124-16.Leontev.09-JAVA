package LAB06.Task1;

// Класс КЛИЕНТ
public abstract class Client extends Person{
    public String bankName;

    public Client(String firstName, String lastName, String bankName) {
        super(firstName, lastName);
        this.bankName = bankName;
    }

    @Override
    public void ShowInfo(){
        System.out.println("Имя: " + firstName);
        System.out.println("Фамилия: " + lastName);
        System.out.println("Название банка: " + bankName);
    }
}
