package LAB07;

public class Jet {
    /*
    1.	Создайте класс Самолет. В классе создайте вложенный класс крыло. Внутри класса Крыло реализуйте:
            ●	поле для хранения информации про вес крыла;
            ●	метод, что будет показывать вес крыла.
    2.	Выполните предыдущее задание. В главном классе создайте объект и добавьте во вложенный класс данные про вес крыла, а также выведите информацию на экран. Создайте два объекта и добавьте разный вес для крыльев.
    */
    public static void main(String[] args) {

        Jet.Wing wing1 = new Jet.Wing(500);
        Jet.Wing wing2 = new Jet.Wing(600);
        wing1.showWingWeight();
        wing2.showWingWeight();
    }

    static class Wing {
        private int wingWeight;

        public Wing(int wingWeight) {

            this.wingWeight = wingWeight;
        }

        void showWingWeight() {
            System.out.println("Вес крыла: " + wingWeight);
        }
    }
}
