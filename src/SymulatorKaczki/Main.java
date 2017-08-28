package SymulatorKaczki;
class Main {

public static void main(String[]args){

    GumowaKaczka gumowa = new GumowaKaczka();
    KaczkaWabik wabik = new KaczkaWabik();
    KaczkaDzika dzika = new KaczkaDzika();
    KaczkaPlaskonos plaskonos = new KaczkaPlaskonos();

    gumowa.WykonajKwakanie();
    gumowa.WykonajLatanie();
    gumowa.Wyswietl();
    gumowa.Plywaj();

    KaczkaModel model = new KaczkaModel();
    model.Wyswietl();
    model.WykonajLatanie();
    model.setLatanie(new LotZNapedemRakietowym());
    model.WykonajLatanie();

}
}
