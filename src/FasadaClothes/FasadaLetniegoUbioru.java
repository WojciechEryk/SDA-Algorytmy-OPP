package FasadaClothes;



public class FasadaLetniegoUbioru implements IUbranieNaPoreRoku {

    private Sandaly _sandaly;
    private Skarpetki _skarpetki;
    private KrotkieSpodenki _krotkieSpodenki;
    private ZonoBijka _zonoBijka;

    public FasadaLetniegoUbioru(Sandaly sandaly, Skarpetki skarpetki, KrotkieSpodenki krotkieSpodenki, ZonoBijka zonobijka) {
        _sandaly=sandaly;
        _skarpetki=skarpetki;
        _krotkieSpodenki=krotkieSpodenki;
        _zonoBijka=zonobijka;
    }

    @Override
    public void UbierzSie() {
        _skarpetki.ubierzUbranie();
        _sandaly.ubierzUbranie();
        _zonoBijka.ubierzUbranie();
        _krotkieSpodenki.ubierzUbranie();

    }

    @Override
    public void RozbierzSie() {
        _sandaly.rozbierzUbranie();
        _skarpetki.rozbierzUbranie();
        _zonoBijka.rozbierzUbranie();
        _krotkieSpodenki.rozbierzUbranie();
    }
}
