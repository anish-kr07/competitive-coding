package WAJP.Java8;

import java.util.function.Function;

class MyRunnable implements Runnable {

    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("child thread from class");
        }
    }
}

public class LambdaBasic {
    public static void main(String[] args) {
        Function<Integer,Integer> f = i->i*i;
        System.out.println("Square of 5 is "+ f.apply(5));
        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r);
        t.start();

        Runnable lambdaExp = () -> {
            for (int i = 0; i < 10 ; i++) {
                System.out.println("child thread from Lambda ");
            }
        };

        Thread thread = new Thread(lambdaExp);
        thread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("main thread");
        }

    }
}
