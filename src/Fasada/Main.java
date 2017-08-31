package Fasada;


public class Main {
    public static void main(String[] args) {
        Telewizor tv = new Telewizor();
        ThermoMix tm = new ThermoMix();
        Wzmacniacz wzm = new Wzmacniacz();

        FasadaKinaDomowego fkd = new FasadaKinaDomowego(tv,wzm,tm);
        fkd.wyjdzZDomu();
    }
}
