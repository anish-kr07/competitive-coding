package WAJP.Practice;

public class EvenOrOddAnyOder {
    public static void main(String[] args) {
        Runnable evenRunnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    if(i%2 == 0)
                        System.out.print(i+ " ");
                }
            }
        };

        Runnable oddRunnable = () -> {
            for (int i = 0; i <20 ; i++) {
                if (i%2 !=0)
                    System.out.print(i+" ");
            }
        };

        Thread evenThread = new Thread(evenRunnable);
        Thread oddThread = new Thread(oddRunnable);
        evenThread.start();
        oddThread.start();
    }
}
