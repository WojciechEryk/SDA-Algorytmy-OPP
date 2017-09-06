package Exception_String_Tablica;

public class Main {
    public static void main(String[] args) {
        String[] tab = {"penis", "dupa"};

        for (int i = 0; i < 3; i++) {
            try {
                System.out.println(tab[i]);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Nie mam tylu slow w tablicy");
            }
        }
    }
}
