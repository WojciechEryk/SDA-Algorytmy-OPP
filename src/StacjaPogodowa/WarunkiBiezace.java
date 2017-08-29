package StacjaPogodowa;


public class WarunkiBiezace implements IWyswietlElement, IObserwator{

    private float _temp;
    private float _cisnienie;
    private float _wilgotnosc;
    private IPodmiot _danePogodowe;

    WarunkiBiezace(IPodmiot danePogodowe){
        _danePogodowe=danePogodowe;
        danePogodowe.zarejestrujObserwatora(this);
    }

    @Override
    public void wyswietl() {
        System.out.printf("Aktualne dane: %f stC, %f hPA, % f%%",_temp, _cisnienie, _wilgotnosc);
    }

    @Override
    public void aktualizacja(float temp, float wilgotnosc, float cisnienie) {
        _cisnienie=cisnienie;
        _temp=temp;
        _wilgotnosc=wilgotnosc;
        wyswietl();
        System.out.println();
    }
}
