package LAB03.Task03;

public class Dom {
    private int floor;
    private int year;
    private String name;

    public int getFloor() {
        return floor;
    }
    public void setFloor(int floor){
        this.floor = floor;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int ageHouse(){
        return 2022 - this.year;
    }

     public static Dom createDom1(){
        Dom dom1 = new Dom();
        dom1.setFloor(12);
        dom1.setYear(2017);
        dom1.setName("Nevsky1");
        return dom1;
    }

    public static Dom createDom2(){
        Dom dom2 = new Dom();
        dom2.setFloor(5);
        dom2.setYear(2010);
        dom2.setName("Sadovaya1");
        return dom2;
    }

    public static void main(String[] args) {
        System.out.println(createDom1().getName());
        System.out.println(createDom1().getYear() + " год постройки");
        System.out.println(createDom1().getFloor() + " этажей");
        System.out.println(createDom1().ageHouse() + " лет");
        System.out.println(createDom2().getName());
        System.out.println(createDom2().getYear() + " год постройки");
        System.out.println(createDom2().getFloor() + " этажей");
        System.out.println(createDom2().ageHouse() + " лет");
    }
}
