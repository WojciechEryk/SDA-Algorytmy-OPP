package Kolekcje_Mapy;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Mapy {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hm = new HashMap();
        hm.put(0,null);
        hm.put(1,2);


        LinkedHashMap<Integer,Integer> lhm = new LinkedHashMap<>();
        lhm.put(0,null);
        lhm.put(1,2);

        TreeMap<Integer,Integer> tm = new TreeMap<>();
        tm.put(0, null);
        tm.put(1, 2);

        System.out.println(hm);
        System.out.println(lhm);
        System.out.println(tm);

    }
}
