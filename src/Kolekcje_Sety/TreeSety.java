package Kolekcje_Sety;


import java.util.TreeSet;

public class TreeSety {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>();
        TreeSet<String> ts2 = new TreeSet<String>();
        ts.add("Stefan");
        ts.add("Andrzej");
        ts.add("Jas");
        ts.add("Alojzy");
        ts.add("Torpeda");


        ts2.addAll(ts);
        ts2.add("Kuba");
        ts2.remove("Jas");
        ts2.remove("Andrzej");


        ts.retainAll(ts2);//nadpisuje na ts tylko elementy wpsole obu setow

        for (String s :ts) {
            System.out.println(s);}

        TreeSet<Integer> ts3 = new TreeSet();
        ts3.add(1);
        ts3.add(1);
        ts3.add(1);
        ts3.add(9);
        Integer zzz = ts3.ceiling(2);
        System.out.println(zzz);

    }
}
