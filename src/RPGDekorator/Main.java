package RPGDekorator;

public class Main {
    public static void main(String[] args) {
        DrewnianyMiecz dm = new DrewnianyMiecz();
        StalowyDragal sd = new StalowyDragal();
        StalowyDragal sd2 = new StalowyDragal();
        SztywnaSmierc ss = new SztywnaSmierc();

        JadSkurwola js = new JadSkurwola(dm);
        Gowno go = new Gowno(sd);
        RunaPeknietegoSlonca rps = new RunaPeknietegoSlonca(ss);
        JadSkurwola js2 = new JadSkurwola(sd2);
        Gowno go2 = new Gowno(js2);
        RunaPeknietegoSlonca rps2 = new RunaPeknietegoSlonca(go2);



        System.out.printf("Miecz: %s :: Wartość ataku %.2f\n", js.pobierzOpis(),js.atak());
        System.out.printf("Miecz: %s :: Wartość ataku %.2f\n", go.pobierzOpis(),go.atak());
        System.out.printf("Miecz: %s :: Wartość ataku %.2f\n", rps.pobierzOpis(),rps.atak());
        System.out.printf("Miecz: %s :: Wartość ataku %.2f\n", rps2.pobierzOpis(),rps2.atak());
        System.out.println("----------------------------------------\n");


    }
}
