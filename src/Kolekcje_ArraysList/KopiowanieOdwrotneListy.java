package Kolekcje_ArraysList;


import java.util.ArrayList;

public class KopiowanieOdwrotneListy {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList();

        for (int i = 0; i <10; i++) {
            list1.add(i);}

        int j = list1.size()-1;
        for (int i = 0; i <list1.size(); i++) {
            list2.add(list1.indexOf(j));
            j--;
        }
        System.out.println(list2);
    }
}
