package WAJP.Java8;
class Student {
    String name;
    int roll;

    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
        System.out.println("Name :"+ name + "Roll No :"+roll);
    }
}

interface ConstructorReferenceDemoInterface {
    Student printStrundent(String name, int roll);
}
public class ConstructorReferenceDemo {
    public static void main(String[] args) {
    ConstructorReferenceDemoInterface interf = Student::new;
    interf.printStrundent("Anish",10);
    }
}
