package WAJP.Java8;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employe {
    String name;
    double salary;

    public Employe(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}
public class PredicateDemo {
    public static void main(String[] args) {
        ArrayList<Employe> e = new ArrayList<>();
        e.add(new Employe("Anish",100));
        e.add(new Employe("Rohit",101));
        e.add(new Employe("kk",101));

        Predicate<Employe> predicate = i -> i.salary > 100;
        e.forEach(employe -> {
            if(predicate.test(employe))
                System.out.println(employe.name);
        });
    }
}
