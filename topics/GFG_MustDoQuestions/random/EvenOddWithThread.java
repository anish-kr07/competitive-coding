package GFG_MustDoQuestions.random;

public class EvenOddWithThread {
    public static void main(String[] args) {
        Runnable runnable = () ->{
            for (int i = 0; i < 10; i++) {
                if(i %2 ==0)
                    System.out.println(i);
            }
        };

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10 ; i++) {
                    if (i%2 ==1)
                        System.out.println(i);
                }
            }
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable1);
        thread1.start();
        thread2.start();


    }
}
