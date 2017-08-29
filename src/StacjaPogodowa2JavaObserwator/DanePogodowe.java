package StacjaPogodowa2JavaObserwator;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class DanePogodowe extends Observable {

    //deklaracja zmiennych obiektowych
    private float _temp;
    private float _cisnienie;
    private float _wilgotnosc;


    public void odczytyZmiennych(){
        setChanged();
        notifyObservers();
    }


    public void ustawZmienne(float temp, float cisnienie, float wilgotnosc) {
        _temp = temp;
        _wilgotnosc=wilgotnosc;
        _cisnienie=cisnienie;
        odczytyZmiennych();
    }

    public float getTemp(){return _temp;}
    public float getCisnienie(){return _cisnienie;}
    public float getWilgotnosc(){return _wilgotnosc;}
}
