package StacjaPogodowa;

public interface IPodmiot {
    void zarejestrujObserwatora(IObserwator o);
    void usunObserwatora(IObserwator o);
    void powiadomObserwatorow();
}
