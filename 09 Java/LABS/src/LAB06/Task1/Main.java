package LAB06.Task1;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Иван", "Иванов", "Банк1") {
        };
        client.ShowInfo();

        BankOfficer bankEmployee = new BankOfficer("Петр", "Петров", "Банк2") {
        };
        bankEmployee.ShowInfo();
    }
}
