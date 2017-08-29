package StacjaPogodowa;


import ZabawyZInterfejsem.IPojazd;

import java.util.ArrayList;
import java.util.List;

public class DanePogodowe implements IPodmiot {

    //deklaracja zmiennych obiektowych
    private List<IObserwator> obserwatorzy;
    private float temp;
    private float cisnienie;
    private float wilgotnosc;

    public DanePogodowe(){
        obserwatorzy = new ArrayList<>(100);
    }

    public void odczytyZmiennych() {
        float temp = pobierzTemperature();
        float wilgotnosc = pobierzWilgotnosc();
        float cisnienie = pobierzCisnienie();

    }

    @Override
    public void zarejestrujObserwatora(IObserwator o) {
        obserwatorzy.add(o);
    }

    @Override
    public void usunObserwatora(IObserwator o) {
        obserwatorzy.remove(o);
    }

    @Override
    public void powiadomObserwatorow() {
        for (IObserwator obserwator: obserwatorzy){
            obserwator.aktualizacja(temp,wilgotnosc,cisnienie);
        }
    }
}
