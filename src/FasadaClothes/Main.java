package FasadaClothes;

public class Main {
    public static void main(String[] args) {
        Sandaly sand = new Sandaly();
        Skarpetki skar = new Skarpetki();
        FasadaLetniegoUbioru flu = new FasadaLetniegoUbioru(sand, skar);

        StrategiaUbioru su = new StrategiaUbioru(flu);
        su.UbieramySie();
        su.RozbieramySie();
    }
}
