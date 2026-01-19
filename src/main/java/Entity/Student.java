package Entity;

public class Student {
    String name;
    int age;

    public Student(String name, int age){
        this.name=name;
        this.age=age;
    }

    public void showDeatils(){
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
    }
}
