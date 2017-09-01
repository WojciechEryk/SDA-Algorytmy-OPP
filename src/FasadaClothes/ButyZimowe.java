package FasadaClothes;

public class ButyZimowe implements IUbranie {
    @Override
    public void ubierzUbranie() {
        System.out.println("Ubieram zimowe buty.");
    }

    @Override
    public void rozbierzUbranie() {
        System.out.println("Zdejmuje zimowe buty.");

    }
}
