package StacjaPogodowa;

import java.util.ArrayList;
import java.util.List;

public class DanePogodowe implements IPodmiot {

    //deklaracja zmiennych obiektowych
    private List<IObserwator> obserwatorzy;
    private float _temp;
    private float _cisnienie;
    private float _wilgotnosc;

    //konstruktor
    public DanePogodowe(){
        obserwatorzy = new ArrayList<>();
    }

    public void odczytyZmiennych(){
        powiadomObserwatorow();
    }

    @Override
    public void zarejestrujObserwatora(IObserwator obserwator) {
        obserwatorzy.add(obserwator);
    }

    @Override
    public void usunObserwatora(IObserwator obserwator) {
        obserwatorzy.remove(obserwator);
    }

    @Override
    public void powiadomObserwatorow() {
        for (IObserwator obserwator: obserwatorzy){
            obserwator.aktualizacja(_temp,_wilgotnosc,_cisnienie);
        }
    }
    public void ustawZmienne(float temp, float cisnienie, float wilgotnosc) {
        _temp = temp;
        _wilgotnosc=wilgotnosc;
        _cisnienie=cisnienie;
        odczytyZmiennych();
    }
}
