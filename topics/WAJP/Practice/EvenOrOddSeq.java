package WAJP.Practice;

public class EvenOrOddSeq {
        private int number = 0;
        private final int max = 9;

        public synchronized void printEven() throws InterruptedException {
            while (number <= max) {
                if (number % 2 != 0) wait();
                if (number <= max) System.out.println(number++);
                notify();
            }
        }

        public synchronized void printOdd() throws InterruptedException {
            while (number <= max) {
                if (number % 2 == 0) wait();
                if (number <= max) System.out.println(number++);
                notify();
            }
        }
}

class TestEvenOrOddSeq{
    public static void main(String[] args) {
        EvenOrOddSeq obj = new EvenOrOddSeq();
        Thread evenThread = new Thread(() -> {
                try {
                    obj.printEven();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                });
        Thread oddThread = new Thread(() -> {
            try{
                obj.printOdd();
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        });
        evenThread.start();
        oddThread.start();
    }
}
