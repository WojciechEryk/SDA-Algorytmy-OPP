package Fasada;

public class FasadaKinaDomowego {
    private Telewizor _telewizor;
    private Wzmacniacz _wzmacniacz;
    private ThermoMix _thermoMix;

    public FasadaKinaDomowego(Telewizor telewizor, Wzmacniacz wzmacniacz, ThermoMix thermoMix){
        _telewizor = telewizor;
        _wzmacniacz = wzmacniacz;
        _thermoMix = thermoMix;
    }

    public void wrocDoDomu(){
        _thermoMix.wlacz();
        _thermoMix.zrobObiad();
        _telewizor.wlacz();
        _wzmacniacz.wlacz();
        _telewizor.ustawKanal();
        _telewizor.ustawGlosnosc();
    }

    public void wyjdzZDomu(){
        _thermoMix.wylacz();
        _telewizor.wylacz();
        _wzmacniacz.wylacz();
    }
}
