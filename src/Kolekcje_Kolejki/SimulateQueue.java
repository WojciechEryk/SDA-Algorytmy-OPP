package Kolekcje_Kolejki;

import java.util.ArrayDeque;

public class SimulateQueue {
    public static void main(String[] args) {

        ArrayDeque<Person> queue = new ArrayDeque<>();
        queue.add(new Person("Mariola", "Piwo, wino, cola"));
        queue.add(new Person("Andrzej", "Szlugi"));
        queue.add(new Person("Kuba", "Materac"));

        while(!queue.isEmpty()){
            Person currentClient = queue.removeFirst();
            System.out.println(currentClient.getName());
            System.out.println(currentClient.unpackShopping());
            System.out.println();
        }

    }
}
