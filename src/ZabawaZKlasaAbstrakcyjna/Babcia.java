package ZabawaZKlasaAbstrakcyjna;


public class Babcia extends Emeryt {
    @Override
    public void krzyczNaDzieci() {

        System.out.printf("Zostaw ziemniaki, a zjedz mięso!\n");
    }

    @Override
    void walczOMiejsceWAutobusie() {
        System.out.printf("Uderzam torbą przez łeb\n");
    }

    @Override
    public void upieczSzarlotka() {
        System.out.printf("Super szarlotka");
    }
}
