package FasadaClothes;

public class KrotkieSpodenki implements IUbranie {
    @Override
    public void ubierzUbranie() {
        System.out.println("Ubieram krotkie spodenki.");
    }

    @Override
    public void rozbierzUbranie() {
        System.out.println("Zdejmuje krotkie spodenki.");
    }
}
