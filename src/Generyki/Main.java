package Generyki;

public class Main {

    public static void main(String[] args) {
        Tshirt tshirt = new Tshirt();
        Trousers trousers = new Trousers();
        Socks socks = new Socks();

        Walizka<Tshirt> suitcase = new Walizka();
        suitcase.setThing(tshirt);
        System.out.println(suitcase.getThingName());
        System.out.println(suitcase.getThingDescription());
        System.out.println(suitcase.getThingSize());


    }
}