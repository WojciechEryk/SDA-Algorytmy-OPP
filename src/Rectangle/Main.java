package Rectangle;

public class Main {

    public static void main(String[] args) {
        Rectangle podstawowy = new Rectangle();
        podstawowy.setLength(10);
        podstawowy.setWidth(3);
        System.out.println(podstawowy.getArea());
        System.out.println(podstawowy.getPerimiter());
        System.out.println(podstawowy.toString());
    }
}

