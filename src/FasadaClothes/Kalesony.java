package FasadaClothes;

public class Kalesony implements IUbranie {
    @Override
    public void ubierzUbranie() {
        System.out.println("Ubieram Kalesonki.");
    }

    @Override
    public void rozbierzUbranie() {
        System.out.println("Zdejmuje kalesonki");
    }
}
