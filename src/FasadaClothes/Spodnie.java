package FasadaClothes;

public class Spodnie implements IUbranie {
    @Override
    public void ubierzUbranie() {
        System.out.println("Ubieram spodnie.");
    }

    @Override
    public void rozbierzUbranie() {
        System.out.println("Zdejmuje spodnie.");
    }
}
