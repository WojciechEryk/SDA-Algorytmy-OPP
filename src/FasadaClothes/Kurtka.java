package FasadaClothes;

public class Kurtka implements IUbranie {
    @Override
    public void ubierzUbranie() {
        System.out.println("Ubieram kurtke.");
    }

    @Override
    public void rozbierzUbranie() {
        System.out.println("Zdejmuje kurtke.");
    }
}
