package Watki_SimpleSynchronization;


public class Main {
    public static int counter;
public synchronized void increment(){
    counter++;
}
    public static void main(String[] args) throws InterruptedException {
        Main mm = new Main();
        doWork();
        mm.doWork();
    }
    public static void doWork() throws InterruptedException {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <100 ; i++) {
                    System.out.println("A " + counter++);
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <100 ; i++) {
                    System.out.println("B " + counter++);
                }
            }
        });
        t1.run();
        t2.run();
        t1.join();
        t2.join();

        System.out.println(counter);
    }
}
