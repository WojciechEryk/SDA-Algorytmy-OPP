package StrategiaKonBonifacy;


public class Main {
    public static void main(String[] args) {
        int [] tab = {2,4,5,7,8,4,6,1,1};
        Parzyste pa = new Parzyste();
        Nieparzyste npa = new Nieparzyste();

        StrategiaKodaBonifacego skb = new StrategiaKodaBonifacego(pa);
        skb.setAlgorytm(npa);
        tab = skb.Uruchom(tab);

        for (Integer integer :tab) {
            System.out.print(integer+", ");
        }

    }
}
