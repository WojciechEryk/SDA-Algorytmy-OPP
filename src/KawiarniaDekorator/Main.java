package KawiarniaDekorator;


public class Main {

    public static void main(String[] args) {
        MocnoPalona mp = new MocnoPalona();
        Czekolada czek = new Czekolada(mp);
        BitaSmietana bs = new BitaSmietana(czek);
        MlekoSojowe ms = new MlekoSojowe(bs);

        System.out.printf("Nazwa: %s :: Koszt %.2f\n", czek.pobierzOpis(),czek.koszt());
        System.out.printf("Nazwa: %s :: Koszt %.2f\n", bs.pobierzOpis(),bs.koszt());
        System.out.printf("Nazwa: %s :: Koszt %.2f\n", ms.pobierzOpis(),ms.koszt());

    }
}
