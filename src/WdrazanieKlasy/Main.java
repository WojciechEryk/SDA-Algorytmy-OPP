package WdrazanieKlasy;

public class Main {
    public static void main(String[] args) {


        MyTime time = new MyTime(2,15,2);
        time.setMinute(26);
        System.out.printf(time.toString());
    }
}
