package LAB03.Task04;

public class Tree {
    public int age;
    public boolean live;
    public String name;

    public Tree(int age, String name){
        this.age = age;
        this.name = name;
    }

    public Tree(int age, boolean live, String name){
        this.age = age;
        this.live = live;
        this.name = name;
    }

    public Tree(){
        System.out.println("Пустой конструктор без параметров сработал");
    }

    @Override
    public String toString(){
        return "Tree " + "age " + age + " living " + live + " name " + name;
    }
    //
    public static void main(String[] args) {
        Tree tree1 = new Tree(20,"birch");
        Tree tree2 = new Tree(10,true,"maple");
        Tree tree3 = new Tree();

        System.out.println(tree1);
        System.out.println(tree2);
        System.out.println(tree3);
    }
}
