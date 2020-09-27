package WAJP.Java8;

import java.util.function.Function;

interface Interf {
    void printMethod(int n );
}

public class MethodRefernceDemo {
    private void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("child thread from instance method");
        }
    }
    private static void printMethod(int n){
        for (int i = 0; i < n ; i++) {
            System.out.println("child thread from static method");
        }
    }
    public static void main(String[] args) {
        MethodRefernceDemo obj = new MethodRefernceDemo();
        Runnable runnable = obj::run;
        Thread t = new Thread(runnable);
        t.start();
        Interf interf = MethodRefernceDemo::printMethod;
        interf.printMethod(3);

    }
}
