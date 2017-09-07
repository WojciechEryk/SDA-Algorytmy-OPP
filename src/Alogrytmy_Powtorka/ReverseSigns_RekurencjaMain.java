package Alogrytmy_Powtorka;


public class ReverseSigns_RekurencjaMain {
    public static void main(String[] args) {
        String toReverse = "Dupa232Apud";
        int length = toReverse.length() - 1;

        ReverseSigns_RekurencjaCode rs = new ReverseSigns_RekurencjaCode();
        rs.reverseMaschine(length, toReverse);
    }
}
