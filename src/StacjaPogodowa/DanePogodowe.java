package StacjaPogodowa;


public class DanePogodowe {

    //deklaracja zmiennych obiektowych
    public void odczytyZmiennych() {
        float temp = pobierzTemperature();
        float wilgotnosc = pobierzWilgotnosc();
        float cisnienie = pobierzCisnienie();

        warunkiBiezacaWyswietl.aktualizacja(temp, wilgotnosc, cisnienie);
        statystykaWyswietl.aktualizacja(temp, wilgotnosc, cisnienie);
        prognozaWyswietl.aktualizacja(temp, wilgotnosc, cisnienie);
    }
}
