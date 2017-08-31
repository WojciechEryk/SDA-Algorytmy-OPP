package FasadaClothes;



public class FasadaLetniegoUbioru implements IUbranieNaPoreRoku {

    private Sandaly _sandaly;
    private Skarpetki _skarpetki;

    public FasadaLetniegoUbioru(Sandaly sandaly, Skarpetki skarpetki) {
        _sandaly=sandaly;
        _skarpetki=skarpetki;
    }

    @Override
    public void UbierzSie() {
        _skarpetki.ubierzUbranie();
        _sandaly.ubierzUbranie();

    }

    @Override
    public void RozbierzSie() {
        _sandaly.rozbierzUbranie();
        _skarpetki.rozbierzUbranie();
    }
}
