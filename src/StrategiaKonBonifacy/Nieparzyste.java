package StrategiaKonBonifacy;


import java.util.Arrays;

public class Nieparzyste implements IAlgorytm{

    @Override
    public int[] Uruchm(int[] tab) {
        int [] tablicaNieparzyste = new int[tab.length];
        int j = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i]%2!=0){
                tablicaNieparzyste[j]=tab[i];
                j++;
            }
        }
        return Arrays.copyOf(tablicaNieparzyste,j);
    }
}
