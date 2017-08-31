package AdapterWzorzec;


public class DzikiIndyk implements IIndyk {

    @Override
    public void gulgucze() {
        System.out.println("Gul gul gul!");
    }

    @Override
    public void lata() {
        System.out.println("Indyk fru fru fur");
    }
}
