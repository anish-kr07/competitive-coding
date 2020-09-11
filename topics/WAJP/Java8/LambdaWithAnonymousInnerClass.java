package WAJP.Java8;

public class LambdaWithAnonymousInnerClass {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10 ; i++) {
                    System.out.println("Child from Anonymous Inner Class");
                }
            }
        };
        Runnable runnable1 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Child from Lambda");
            }
        };

        Thread thread = new Thread(runnable);
        Thread thread1 = new Thread(runnable1);
        thread.start();thread1.start();
        for (int i = 0; i < 10 ; i++) {
            System.out.println("Main Method");
        }
    }
}
