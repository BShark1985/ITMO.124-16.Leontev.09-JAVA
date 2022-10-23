package LAB03.Task01;

class Study {

    public String course;

    public Study (String course){
        this.course = course;
    }

    public String printCourse() {
        return this.course;
    }
}

class JavaProgram {
    public static void main(String[] args) {
        Study enter1 = new Study("Изучение Java - это просто!");
        System.out.println(enter1.printCourse());
    }
}

