package Alogrytmy_Powtorka;

import java.util.Random;
import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {

        //Obiekty i zmienne

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbe: ");
        int odUzytkownika = scanner.nextInt();
        Random rand = new Random();
        System.out.println("-----------------------");

        double counterPlus = 0;
        double counterMinus = 0;
        int max = 0;
        int min = 0;

        //Logika
        System.out.print("Wyslosowane liczby: ");
        for (int i = 0; i <odUzytkownika ; i++) {
            int temp = rand.nextInt()%100;
            System.out.print(temp+", ");
            if (temp<=0){
                counterMinus++;
            }else{
                counterPlus++;
            }if(temp>max){
                max = temp;
            }if(temp<min){
                min = temp;
            }
        }
//        System.out.println("Counter Plus: " + counterPlus);
//        Liczba liczb dodatnich
//        System.out.println("Counter Minus: " + counterMinus);
//        Liczba liczb ujemnych
        System.out.println("\nMAX: "+ max);
        System.out.println("MIN: "+ min);
        System.out.println("Stosunek dodatnich do ujemnych: " + counterPlus/counterMinus);

    }
}
