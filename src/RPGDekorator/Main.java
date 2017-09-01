package RPGDekorator;

public class Main {
    public static void main(String[] args) {

//        Bohater eryk = new Bohater("Eryk",);

        //Miecze
        DrewnianyMiecz dm = new DrewnianyMiecz();
        StalowyDragal sd = new StalowyDragal();
        SztywnaSmierc ss = new SztywnaSmierc();
        JadSkurwola js = new JadSkurwola(sd);
        Gowno go = new Gowno(js);
        RunaPeknietegoSlonca rps = new RunaPeknietegoSlonca(go);

        //Tarcze
        TarczaDrewniana td = new TarczaDrewniana();
        TarczaHerbowa th = new TarczaHerbowa();
        TarczaMigdalowa tm = new TarczaMigdalowa();
        ObicieZKutaNapletesa oZKN = new ObicieZKutaNapletesa(tm);
        RogZKutasorozca rZK = new RogZKutasorozca(oZKN);
        FutroSkurwola fs = new FutroSkurwola(rZK);

        //Plecaki
        MalyPlecak mp = new MalyPlecak();
        SredniPlecak sp = new SredniPlecak();
        DuzyPlecak dp = new DuzyPlecak();
        NaszywkaNocnegoKochanka nnk = new NaszywkaNocnegoKochanka(sp);
        DodatkowaKieszenZMoszny dkzm = new DodatkowaKieszenZMoszny(nnk);
        DodatkowePaskiZJelit dpzj = new DodatkowePaskiZJelit(dkzm);


    }
}
