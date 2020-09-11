package WAJP.Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Emp {
    int eno ;
    String name;

    public Emp(int eno, String name) {
        this.eno = eno;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "eno=" + eno +
                ", name='" + name + '\'' +
                '}';
    }
}
public class LambdaWithCollection {
    public static void main(String[] args) {
        ArrayList<Emp> emps = new ArrayList<>();
        emps.add(new Emp(100, "Anish"));
        emps.add(new Emp(110, "KrishnKant"));
        emps.add(new Emp(105, "Rohit"));
        System.out.println(emps);
        System.out.println("Sorting by eno ");
//        Collections.sort(emps,(e1,e2) -> (e1.eno < e2.eno) ? -1 : (e1.eno > e2.eno) ? 1 : 0);
        Collections.sort(emps,(e1,e2) -> Integer.compare(e1.eno, e2.eno));
        System.out.println(emps);
        System.out.println("Sorting by name alphabetically ");
//        Collections.sort(emps,(e1,e2) -> e1.name.compareTo(e2.name));
        Collections.sort(emps, Comparator.comparing(e -> e.name));
        System.out.println(emps);
    }
}
