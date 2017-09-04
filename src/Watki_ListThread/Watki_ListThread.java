package Watki_ListThread;

import java.util.ArrayList;
import java.util.Random;

public class Watki_ListThread implements Runnable {
    private int _counter;
    private ArrayList<Integer> _stageOne= new ArrayList<>();
    private ArrayList<Integer> _stageOTwo= new ArrayList<>();


    private Random rand = new Random();

    public synchronized void stageOne() throws InterruptedException {
        _stageOne.add((rand.nextInt()));
        Thread.sleep(1);
        System.out.println("A");
        _counter++;
    }
    public synchronized void stageTwo() throws InterruptedException {
        _stageOne.add((rand.nextInt()));
        Thread.sleep(1);
        System.out.println("B");
        _counter++;
    }

    public void process() throws InterruptedException {
        while (_counter<1000){
            stageOne();
            stageTwo();
        }
    }

    @Override
    public void run() {
        try {
            process();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
