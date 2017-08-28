package Sorter;


public abstract class Tablica {
    ISortowanie sortowanie;


    public void WykonajSortowanie(){
        sortowanie.sortuj();
    }
}
