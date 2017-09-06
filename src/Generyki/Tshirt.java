package Generyki;

public class Tshirt extends Clothes implements ICanFolded{



    @Override
    public String getDescription() {
        return "60 degree";
    }

    @Override
    public String getName() {
        return "T-shirt";
    }

    @Override
    public String getSize() {
        return "XL";
    }
}
