package Generyki_Fruit;


public class FruitBasket<T extends IFruit> {
    private IFruit _fruit;

    public FruitBasket() {
    }

    public void setFruit(IFruit fruit) {
        _fruit = fruit;
    }

    public IFruit getFruit() {
        return _fruit;
    }

    public String getFruitName(){
        return _fruit.getName();
    }

}
