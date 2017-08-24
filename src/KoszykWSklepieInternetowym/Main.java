package KoszykWSklepieInternetowym;


public class Main {
    public static void main(String[] args) {
        MusicCD chineseDemocracy = new ChineseDemocracy();
        chineseDemocracy.setPrice(20);
        chineseDemocracy.setProductName("Chinese Democracy");
        chineseDemocracy.setPerformer("Guns n' Roses");
        chineseDemocracy.setTitle("Chinese Democracy");
        System.out.printf(chineseDemocracy.toString());

        System.out.println();
        MusicCD zdrajcametalu = new ZdrajcaMetalu();
        zdrajcametalu.setPrice(26);
        zdrajcametalu.setProductName("ZdrajcaMetalu");
        zdrajcametalu.setPerformer("Nocny Kochanek");
        zdrajcametalu.setTitle("Zdrajca Metalu");
        System.out.println(zdrajcametalu.toString());

        System.out.println();
        Book ksiazka = new LordsOfTheRing();
        ksiazka.setTitle("Druzyna Pierscienia");
        ksiazka.setProductName("LOTR");
        ksiazka.setPrice(9);
        ksiazka.setAuthor("J.R.R. Tolkien");
        System.out.println(ksiazka.toString());

        }
}

