package FasadaClothes;


public class Skarpetki implements IUbranie {
    @Override
    public void ubierzUbranie() {
        System.out.println("Ubieram Skarpetki");

    }

    @Override
    public void rozbierzUbranie() {
        System.out.println("Zdejmuje Skarpetki");
    }
}
