package Sorter;


public final class Sorter {      //jesli nie chcemy aby ktos dziedziczyl po naszej klasie to dajemy final
    private ISortowanie _sortowanie;

    public Sorter(ISortowanie sortowanie) {
        setSortwanie(sortowanie);
    }
    public void setSortwanie(ISortowanie sortowanie){
        _sortowanie = sortowanie;
    }

    public int[] doSorting(int [] toSort){
        return _sortowanie.sortuj(toSort);
    }
}
