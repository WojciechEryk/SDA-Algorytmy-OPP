package FasadaClothes;

public class Main {
    public static void main(String[] args) {
        Sandaly sand = new Sandaly();
        Skarpetki skar = new Skarpetki();
        ZonoBijka zono = new ZonoBijka();
        KrotkieSpodenki krSpod = new KrotkieSpodenki();
        ButyZimowe butyZimowe = new ButyZimowe();
        Kalesony kale = new Kalesony();
        Spodnie spo = new Spodnie();
        Kurtka kur = new Kurtka();
        FasadaZimowegoUbioru fzs = new FasadaZimowegoUbioru(skar, kale,spo,zono,kur,butyZimowe);
        FasadaLetniegoUbioru flu = new FasadaLetniegoUbioru(sand, skar, krSpod, zono);

        StrategiaUbioru su = new StrategiaUbioru(flu);
        su.UbieramySie();
        su.RozbieramySie();

        su.setPoraRoku(fzs);
        su.UbieramySie();
        su.RozbieramySie();


    }
}
