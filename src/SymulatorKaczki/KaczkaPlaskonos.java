package SymulatorKaczki;


public class KaczkaPlaskonos extends Kaczka {
    public KaczkaPlaskonos() {
        latanie = new LatamBoMamSkrzydla();
        kwakanie = new Kwacz();
    }

    @Override
    public void Wyswietl(){
        System.out.println("Wyswietlam plaskonosa!");
    }
}
