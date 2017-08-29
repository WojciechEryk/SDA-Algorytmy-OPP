package StacjaPogodowa;

public interface IPodmiot {
    void zarejestrujObserwatora(Object o);
    void usunObserwatora(Object o);
    void powiadomObserwatorow();
}
