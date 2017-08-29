package StacjaPogodowa2JavaObserwator;


import java.util.Observable;
import java.util.Observer;

public class WarunkiBiezace implements IWyswietlElement, Observer {

    private float _temp;
    private float _cisnienie;
    private float _wilgotnosc;
    private Observable _danePogodowe;

    WarunkiBiezace(Observable danePogodowe){
        _danePogodowe = danePogodowe;
        danePogodowe.addObserver(this);
    }

    @Override
    public void wyswietl() {
        System.out.printf("Aktualne dane: %f stC, %f hPA, % f%%",_temp, _cisnienie, _wilgotnosc);
    }


    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof DanePogodowe)
        _cisnienie=((DanePogodowe) o).getCisnienie();
        _temp=((DanePogodowe) o).getCisnienie();
        _wilgotnosc=((DanePogodowe) o).getWilgotnosc();
        wyswietl();
        System.out.println();
    }
}
