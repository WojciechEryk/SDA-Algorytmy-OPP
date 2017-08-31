package Sorter;


public class SortowanieBabelkowe implements ISortowanie {

    @Override
    public int[] sortuj(int[] sortowanie) {

        for (int i =0; i<sortowanie.length;i++){
            for (int j=0; j<sortowanie.length-1;j++){
                if (sortowanie[j] > sortowanie[j+1]){
                    //SWAP
                    int temp =sortowanie[j];
                    sortowanie[j]=sortowanie[j+1];
                    sortowanie[j+1]=temp;

                }
            }
        }

        return sortowanie;
    }
}
