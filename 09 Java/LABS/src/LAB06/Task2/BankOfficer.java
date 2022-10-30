package LAB06.Task2;

import LAB06.Task1.Person;

// Класс РАБОТНИК БАНКА
public abstract class BankOfficer extends Person {
    public String bankName;

    public BankOfficer(String firstName, String lastName, String bankName) {
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
