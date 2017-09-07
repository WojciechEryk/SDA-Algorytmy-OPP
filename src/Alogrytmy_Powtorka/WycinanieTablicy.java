package Alogrytmy_Powtorka;


public class WycinanieTablicy {
    public static void main(String[] args) {
        int[][] tab = new int[4][4];
        int iterator = 1;

        //argumenty
        int x = 1;
        int y = 1;
        int xSize = 2;
        int ySize = 2;
        //wycieta tablica
        int [][] tab2 = new int[xSize][ySize];

        //Wypelnianie tablicy
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <4 ; j++) {
                tab[i][j]=iterator;
                iterator++;
                System.out.print(tab[i][j]+"      ");
            }
            System.out.println("\n");
    }
        System.out.println();
        System.out.println("------------------------------------");
        System.out.println();
        //Wycinanie tablicy
        for (int i = 0; i <xSize ; i++) {
            for (int j = 0; j <ySize ; j++) {
                tab2[i][j] = tab[i+x][j+y];
                System.out.print(tab2[i][j]+"      ");
            }
            System.out.println("\n");
        }
    }
}
