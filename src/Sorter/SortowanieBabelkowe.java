package Sorter;


public class SortowanieBabelkowe implements ISortowanie {

    @Override
    public int[] sortuj(int[] sortowanie) {

        for (int i =0; i<sortowanie.length;i++){
            for (int j=0; j<sortowanie.length-1;j++){
                if (sortowanie[i] <= sortowanie[j]){
                    //SWAP
                    int temp =sortowanie[i];
                    sortowanie[j]=sortowanie[i];
                    sortowanie[j]=temp;

                }
            }
        }

        return sortowanie;
    }
}
