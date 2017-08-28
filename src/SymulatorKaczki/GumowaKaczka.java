package SymulatorKaczki;


public class GumowaKaczka extends Kaczka{
    public GumowaKaczka() {
        latanie = new NieLatam();
        kwakanie = new Piszcz();
    }

    @Override
    public void Wyswietl(){
        System.out.println("Wyglada jak gumowa kaczka!");
    }
}
