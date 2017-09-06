package Generyki;


public class Trousers extends Clothes implements ICanFolded{

    @Override
    public String getDescription() {
        return "40 degree";
    }

    @Override
    public String getName() {
        return "trousers";
    }

    @Override
    public String getSize() {
        return "XL";
    }
}
