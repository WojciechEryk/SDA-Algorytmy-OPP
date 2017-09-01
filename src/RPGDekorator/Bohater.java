package RPGDekorator;

public class Bohater {
    private String _imie;
    private Miecz _miecz;
    private Tarcza _tarcza;
    private Plecak _plecak;


    public Bohater(String imie, Miecz miecz, Tarcza tarcza, Plecak plecak) {
                _imie = imie;
                _miecz = miecz;
                _tarcza = tarcza;
                _plecak = plecak;
        opisBohatera(_imie,_miecz,_tarcza,_plecak);
    }

    public void opisBohatera(String imie, Miecz miecz, Tarcza tarcza, Plecak plecak){
        System.out.println("Bohater o imieniu " + imie);
        System.out.println("----------------------------------------\n");
        System.out.println("Ekwpiunek: \n");
        System.out.printf("Miecz: %s :: Wartość ataku %.2f.\n", miecz.pobierzOpis(),miecz.atak());
        System.out.printf("Tarcza: %s :: Wartość obrony %.2f.\n", tarcza.pobierzOpis(),tarcza.obrona());
        System.out.printf("Plecak: %s :: Pojemność: %.2f.\n", plecak.pobierzOpis(),plecak.pojemnosc());
    }
}
