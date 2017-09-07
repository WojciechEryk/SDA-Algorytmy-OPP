package Alogrytmy_Powtorka_OdwracanieTablicy;


public class ArraysReverse {

    public static void main(String[] args) {

        int[][] tab = new int[3][3];
        int[][] tab2 = new int[3][3];
        int iterator = 1;



        //Wypelnianie tablicy
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                tab[i][j]=iterator;
                iterator++;
                System.out.print(tab[i][j]+" ");
            }
            System.out.println();
        }
        //Odwracanie
        System.out.println();
        System.out.println();

        int j2 = 2;
        int i2 = 2;

        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                tab2[i][j]=tab[i2][j2];
                System.out.print(tab2[i][j]+" ");
                j2--;
            }
            System.out.println();
            i2--;
            j2=2;
        }

    }

}
