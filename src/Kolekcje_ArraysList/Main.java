package Kolekcje_ArraysList;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int [] tab = new int [10];
        Integer [] tabInt = new Integer[10];

        for (int i = 0;  i <10;  i++) {
            tab[i]=i;}
        for (int i = 0;  i <10;  i++) {
            tabInt[i]=i;}

        List list1 = Arrays.asList(tab);
        List list2 = Arrays.asList(tabInt);

        for (int i :tab) {
            System.out.print(i+", ");
        }

        System.out.println("\n"+list2);






    }
}
