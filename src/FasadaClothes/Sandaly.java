package FasadaClothes;


public class Sandaly implements IUbranie {

    @Override
    public void ubierzUbranie() {
        System.out.println("Ubieram sandaly");

    }

    @Override
    public void rozbierzUbranie() {
        System.out.println("Zdejmuje sandaly");
    }
}
