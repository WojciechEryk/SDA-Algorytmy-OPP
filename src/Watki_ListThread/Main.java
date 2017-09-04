package Watki_ListThread;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        Watki_ListThread lt = new Watki_ListThread();

        Thread t1 = new Thread(lt);
        Thread t2 = new Thread(lt);

        long currentTime = System.currentTimeMillis();

        t1.run();
        t2.run();
        t1.join();
        t2.join();

        System.out.println(System.currentTimeMillis()-currentTime);

    }
}
