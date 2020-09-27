package WAJP.Java8;

import java.util.ArrayList;
import java.util.function.BiFunction;

class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}
public class BiFunctionApplyDemo {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        BiFunction<String,Double,Employee> biFunction = (str,sal) -> new Employee(str,sal);
        employees.add(biFunction.apply("Anish",1000d));
        employees.add(biFunction.apply("KK",1000d));
        employees.add(biFunction.apply("Rohit",1000d));
        System.out.println(employees);

    }
}
