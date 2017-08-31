package FasadaClothes;


public class StrategiaUbioru {
    private IUbranieNaPoreRoku _ubranieNaPoreRoku;

    public StrategiaUbioru(IUbranieNaPoreRoku ubranieNaPoreRoku){
        _ubranieNaPoreRoku=ubranieNaPoreRoku;
    }

    public void UbieramySie(){
        _ubranieNaPoreRoku.UbierzSie();
    }
    public void RozbieramySie(){
        _ubranieNaPoreRoku.RozbierzSie();
    }
    public void setPoraRoku (IUbranieNaPoreRoku ubranieNaPoreRoku){
        _ubranieNaPoreRoku = ubranieNaPoreRoku;
    }
}
