package DniTygodniaEnum;

public enum DniTygodniaEnum {
    Poniedziałek(1, "wtorek"),
    Wtorek(2,"środa"),
    Sroda(3, "czwartek"),
    Czwartek(4, "piątek"),
    Piątek(5, "sobota"),
    Sobota(6, "niedziela"),
    Niedziela(7, "poniedziałek");

    private final int nrDnia;

    DniTygodniaEnum(int numerek) {
        nrDnia = numerek;
    }

    DniTygodniaEnum(int numerek, String nastepnik) {
        nrDnia = numerek;
    }

    int getNrDnia() {
        return nrDnia;
    }
}

class DniTygodnia {
    public static void main(String[] args) {
        for (DniTygodniaEnum dzien : DniTygodniaEnum.values()) {
            System.out.printf("%s: %d dzień tygodnia. Następny dzień to %s.\n", dzien, dzien.getNrDnia());
        }
    }
}