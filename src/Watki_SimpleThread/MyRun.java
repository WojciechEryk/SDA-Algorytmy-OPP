package Watki_SimpleThread;


public class MyRun implements Runnable{
    private String[] names = {"Stefan", "Marian", "Andrzej", "Bob", "Alojzy", "Grzegorz",
    "Marcel", "Krzysztof", "Jas", "Patol"};
    private int _id;

    public MyRun(int id){
        _id=id;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
                System.out.printf("Hello from %s %d\n",names[i],_id);
                try {Thread.sleep(10);}
                catch (InterruptedException e)
                {e.printStackTrace();}
            }
}
}