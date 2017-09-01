package StrategiaKonBonifacy;


public class StrategiaKodaBonifacego {
    private IAlgorytm _algorytm;

    public void setAlgorytm(IAlgorytm algorytm){
        _algorytm=algorytm;
    }

    public int[] Uruchom(int[]tab){
        return _algorytm.Uruchm(tab);
    }

    public StrategiaKodaBonifacego(IAlgorytm algorytm) {
        _algorytm = algorytm;
    }
}
