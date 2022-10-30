package LAB06.Task2;

import LAB06.Task1.BankOfficer;
import LAB06.Task1.Client;

public class Main {
    public static void main(String[] args) {
        LAB06.Task1.Client client = new Client("Иван", "Иванов", "Банк1") {
        };
        client.ShowInfo();

        LAB06.Task1.BankOfficer bankEmployee = new BankOfficer("Петр", "Петров", "Банк2") {
        };
        bankEmployee.ShowInfo();
    }
}
