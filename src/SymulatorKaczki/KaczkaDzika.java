package SymulatorKaczki;


public class KaczkaDzika extends Kaczka {
    public KaczkaDzika() {
        kwakanie = new Kwacz();
        latanie = new LatamBoMamSkrzydla();
    }

    @Override
    public void Wyswietl() {
        System.out.println("Wyswietlam dzika kaczke");
    }

}
