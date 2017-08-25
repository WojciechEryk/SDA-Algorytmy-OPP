package WdrazanieKlasy;

public class Main {
    public static void main(String[] args) {


        MyTime time = new MyTime(23,15,2);
        time.setMinute(26);
        System.out.printf(time.toString());
        time.nextHour(time);
        System.out.println();
        System.out.printf(time.toString());
    }
}
