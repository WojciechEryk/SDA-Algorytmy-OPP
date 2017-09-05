package Kolekcje_ArraysList;


import java.util.ArrayList;

public class KopiowanieListy {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList();

        for (int i = 0; i <10; i++) {
            list1.add(i);}

        for (int i = 0; i <10; i++) {
            list2.add(list1.indexOf(i));
        }
        System.out.println(list2);
    }
}
