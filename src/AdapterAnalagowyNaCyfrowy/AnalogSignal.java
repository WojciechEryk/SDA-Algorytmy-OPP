package AdapterAnalagowyNaCyfrowy;


import java.util.Random;

public class AnalogSignal implements IAnalogSignal{
    double [] tab = new double[100];

    public AnalogSignal() {
        setAnalog(tab);
    }

    @Override
    public double[] getAnalog() {
        return tab;
    }

    @Override
    public void setAnalog(double[] analogData) {
        Random generator = new Random();
        for (int i = 0; i <tab.length ; i++) {
            tab[i] = generator.nextDouble()*2;
        }
    }

    @Override
    public void printAnalog() {
        for (Double random :tab) {
            System.out.println(random);
        }

    }
}
