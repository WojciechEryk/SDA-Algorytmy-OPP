package AdapterAnalagowyNaCyfrowy;


public class AnalogToDigitalAdapter implements IDigitalSignal {

    double [] zmienionySygnal = new double[100];

    public AnalogToDigitalAdapter(AnalogSignal analog) {

    }

    @Override
    public byte[] getDigital() {
        return new byte[0];
    }

    @Override
    public void setDigital(byte[] digitalData) {

    }

    @Override
    public void printDigial() {

    }

    public double [] Konwerter(byte [] tabByte){
        for (int i = 0; i <tabByte.length ; i++) {
            if (tabByte[0] > 1);
        }

        return zmienionySygnal;
    }
}
