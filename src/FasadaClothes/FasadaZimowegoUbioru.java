package FasadaClothes;

public class FasadaZimowegoUbioru implements IUbranieNaPoreRoku {
    private Skarpetki _skarpetki;
    private Kalesony _kalesony;
    private Spodnie _spodnie;
    private ZonoBijka _zonobijka;
    private Kurtka _kurtka;
    private ButyZimowe _butyZimowe;

    public FasadaZimowegoUbioru(Skarpetki skarpetki,
                                Kalesony kalesony,
                                Spodnie spodnie,
                                ZonoBijka zonobijka,
                                Kurtka kurtka,
                                ButyZimowe butyZimowe) {

        _skarpetki = skarpetki;
        _kalesony = kalesony;
        _spodnie = spodnie;
        _zonobijka = zonobijka;
        _kurtka = kurtka;
        _butyZimowe = butyZimowe;
    }

    @Override
    public void UbierzSie() {
        _skarpetki.ubierzUbranie();
        _kalesony.ubierzUbranie();
        _spodnie.ubierzUbranie();
        _zonobijka.ubierzUbranie();
        _kurtka.ubierzUbranie();
        _butyZimowe.ubierzUbranie();
    }

    @Override
    public void RozbierzSie() {
        _skarpetki.rozbierzUbranie();
        _kalesony.rozbierzUbranie();
        _spodnie.rozbierzUbranie();
        _zonobijka.rozbierzUbranie();
        _kurtka.rozbierzUbranie();
        _butyZimowe.rozbierzUbranie();
    }
}
