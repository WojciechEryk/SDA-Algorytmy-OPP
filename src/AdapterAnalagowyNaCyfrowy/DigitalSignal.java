package AdapterAnalagowyNaCyfrowy;


import java.util.Random;

public class DigitalSignal implements IDigitalSignal{
    byte [] tabB = new byte[100];

    public DigitalSignal() {
        setDigital(tabB);
    }

    @Override
    public byte[] getDigital() {
        return tabB;
    }

    @Override
    public void setDigital(byte[] digitalData) {
        Random generator = new Random();
        generator.nextBytes(tabB);
    }

    @Override
    public void printDigial() {
        for (Byte b :tabB) {
            System.out.println(b);
        }

    }
}
