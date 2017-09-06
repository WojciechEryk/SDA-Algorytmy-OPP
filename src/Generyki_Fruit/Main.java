package Generyki_Fruit;


public class Main {
    public static void main(String[] args) {
        Banana ban = new Banana();
        Apple ap = new Apple();
        Peach pea = new Peach();

        FruitBasket<IFruit> basket = new FruitBasket<>();

        basket.setFruit(ban);
        basket.setFruit(pea);
        System.out.println(basket.getFruit().getName());

    }
}
