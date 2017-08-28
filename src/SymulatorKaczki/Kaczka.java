package SymulatorKaczki;

public abstract class Kaczka {

    IKwakanie kwakanie;
    ILatanie latanie;

    public void WykonajKwakanie() {
        kwakanie.kwacz();}

    public void WykonajLatanie() {
        latanie.lec();}

    public void Plywaj() {System.out.println("Plywu plywu");}
        public void Wyswietl() {System.out.println("Wyswietlam kaczke!");}

    public void setKwakanie (IKwakanie kwakanie) {
        this.kwakanie = kwakanie;
    }
    public void setLatanie (ILatanie latanie) {
        this.latanie = latanie;
    }


//    public void Kwacz(){
//        System.out.println("Kwa kwa");}
//    public void Lec(){
//        System.out.println("Kaczka lata");
//}
        //reszta metod dla kaczek

}
