package LAB06.Task1;

// Класс ЧЕЛОВЕК
public abstract class Person {
    public String firstName;
    public String lastName;

    public String getFirstname() {
        return firstName;
    }

    public String getLastname() {
        return lastName;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public abstract void ShowInfo();
}
