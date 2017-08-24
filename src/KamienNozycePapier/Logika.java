package KamienNozycePapier;
import java.util.Random;
import java.util.Scanner;

public class Logika {

    public KNPEnum wyborGracza = KNPEnum.k;
    public KNPEnum wyborCPU = KNPEnum.n;
    String Decyzja = "k";
    Random rand = new Random();
    public int random;
    public int zwyciestwaGracza = 0;
    public int zwyciestwaCPU = 0;


    public void ruchGracza() {

        System.out.println("Co wybierasz: ");
        Scanner odczyt = new Scanner(System.in);
        Decyzja = odczyt.nextLine();

        if (Decyzja.equals("k")) {
            wyborGracza = KNPEnum.k;
        } else if (Decyzja.equals("n")){
            wyborGracza = KNPEnum.n;
        } else if (Decyzja.equals("p")) {
            wyborGracza = KNPEnum.p;
        } else if (Decyzja.equals("q")) {
            System.out.printf("GAME OVER\n" +
                    "Wygrałeś %d razy.\n" +
                    "Komputer wygrał %d razy.", zwyciestwaGracza, zwyciestwaCPU);
        } else {
            System.out.println("Nieprawidłowy znak! Użyk k, n lub p. Jesli chcesz wyjsć wciśnij q.");
            start();
        }
    }

    public void ruchCPU() {
        int random = rand.nextInt(3) + 1;
        if (random == 1) {
            wyborCPU = KNPEnum.k;
        } else if (random == 2) {
            wyborCPU = KNPEnum.n;
        } else {
            wyborCPU = KNPEnum.p;
        }
    }

    public void wynik(){
        System.out.printf("Twoj ruch to %s \n" +
                "Ruch CPU to %s\n" +
                "%s VS %s\n"
                , wyborGracza,wyborCPU,wyborGracza,wyborCPU);
    }


    public void rozgrywka() {

        if (wyborCPU.equals(wyborGracza)) {
            System.out.printf("Twoj ruch to %s VS %s ruch komputera.\n", wyborGracza,wyborCPU);
            System.out.println("Remis, nikt nie dostaje punktu");
            start();
        }else if(wyborCPU.equals(KNPEnum.k)&&wyborGracza.equals(KNPEnum.n)){
            wynik();
            System.out.println("Zwycięstwo Komputera!");
            zwyciestwaCPU++;
            start();
        }else if(wyborCPU.equals(KNPEnum.k)&&wyborGracza.equals(KNPEnum.p)){
            wynik();
            System.out.println("Zwycięstwo Gracza!");
            zwyciestwaGracza++;
            start();
        }else if(wyborCPU.equals(KNPEnum.n)&&wyborGracza.equals(KNPEnum.p)) {
            wynik();
            System.out.println("Zwycięstwo Komputera!");
            zwyciestwaCPU++;
            start();
        }else if(wyborCPU.equals(KNPEnum.n)&&wyborGracza.equals(KNPEnum.k)){
            wynik();
            System.out.println("Zwycięstwo Gracza!");
            zwyciestwaGracza++;
            start();
        }else if(wyborCPU.equals(KNPEnum.p)&&wyborGracza.equals(KNPEnum.k)){
            wynik();
            System.out.println("Zwycięstwo Komputera!");
            zwyciestwaCPU++;
            start();
        }else if(wyborCPU.equals(KNPEnum.p)&&wyborGracza.equals(KNPEnum.n)){
            wynik();
            System.out.println("Zwycięstwo Gracza!");
            zwyciestwaGracza++;
            start();
        }
    }

    public  void wlacz(){
        System.out.println("Gra KAMIEN NOZYCE PAPIER.\n" +
                "---------------------------\n" +
                "Podaj jeden ze znakow:\n" +
                "\nk - oznacza kamien,\n"+
                "n - oznacza nożyce,\n"+
                "p - oznacza papier,\n"+
                "q - przerwij gre.\n"
        );
        start();
    }

    public void start() {
        ruchCPU();
        ruchGracza();
        while (!Decyzja.equals("q")) {
            rozgrywka();
        }

    }
}
