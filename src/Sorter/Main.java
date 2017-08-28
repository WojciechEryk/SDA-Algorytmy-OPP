package Sorter;

public class Main {
    public static void main(String[] args) {

        Sorter sorter = new Sorter(new SortowanieBabelkowe());
        int [] tabToSort = {2,6,7,3,2,9,1};
        int[]sorted = sorter.doSorting(tabToSort);

        //
        for (int element :sorted) {
            System.out.println(element);
        }

    }
}
