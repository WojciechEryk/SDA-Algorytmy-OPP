package WdrazanieKlasy;

public class MyTime {
    private int _hour = 0;
    private int _minute = 0;
    private int _second = 0;

    public MyTime() {}

    public MyTime(int hour, int minute, int second) {
        _hour = hour;
        _minute = minute;
        _second = second;
    }

    public int getHour() {
        return _hour;
    }

    public int getMinute() {
        return _minute;
    }

    public int getSecond() {
        return _second;
    }

    public void setHour(int hour) {
        if (hour<24&&hour>-1) {
            _hour = hour;
        }else {
            System.out.println("Zla wartosc godzin");
        }
    }

    public void setMinute(int minute) {
        if (minute<60&&minute>-1) {
            _minute = minute;
        }else {
            System.out.println("Zla wartosc minut");
        }}

    public void setSecond(int second) {
        if (second<60&&second>-1) {
            _second = second;
        }else {
            System.out.println("Zla wartosc sekund");
        }
    }

    public String toString() {
        return String.format(_hour<10&&_hour>-1 ? "0%d/" : "%d/", _hour)
                +String.format(_minute<10&&_minute>-1 ? "0%d/" : "%d/", _minute)
                +String.format(_second<10&&_second>-1 ? "0%d" : "%d", _second);
    }

    //Dobrze wymyślone :P ale muszę to dopisać dla minut i sekund. Miłego weekendu!
    public MyTime nextHour(MyTime time){
        int next = time.getHour();
        setHour(next+1);
        return time;
    }


}