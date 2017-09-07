package Alogrytmy_Powtorka;

public class ReverseSigns_RekurencjaCode {



    public int reverseMaschine(int length, String toReverse) {
        if (length >= 0) {
            System.out.print(toReverse.charAt(length));


            return reverseMaschine(length-1, toReverse);
        }
        return 0;
    }
}