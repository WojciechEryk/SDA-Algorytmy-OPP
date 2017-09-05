package Kolekcje_ArraysList;


import java.util.ArrayList;

public class PolaczenieList {
    public static void main(String[] args) {

        ArrayList list1 = new ArrayList<>();
        ArrayList list2 = new ArrayList<>();

        for (int i = 0; i <10; i++) {
            list1.add(i);
            list2.add(i+10);}


            list1.addAll(list2);
        System.out.println(list1);
    }
}
