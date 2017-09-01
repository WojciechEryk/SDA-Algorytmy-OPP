package FasadaClothes;

public class ZonoBijka implements IUbranie{
    @Override
    public void ubierzUbranie() {
        System.out.println("Ubieram zonobijke.");
    }

    @Override
    public void rozbierzUbranie() {
        System.out.println("Zdejmuje zonobijke.");
    }
}
