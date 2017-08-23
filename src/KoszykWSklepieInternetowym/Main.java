package KoszykWSklepieInternetowym;


public class Main {
    public static void main(String[] args) {
        MusicCD chineseDemocracy = new ChineseDemocracy();

        chineseDemocracy.setPrice(20);
        chineseDemocracy.setProductName("Chinese Democracy");
        chineseDemocracy.setPerformer("Guns n' Roses");
        chineseDemocracy.setTitle("Chinese Democracy");
        System.out.println(chineseDemocracy.getProductName());
        System.out.println(chineseDemocracy.getPrice());
        System.out.println(chineseDemocracy.getTittle());
        System.out.println(chineseDemocracy.getPerformer());

        MusicCD zdrajcametalu = new ZdrajcaMetalu();
        System.out.println();

        zdrajcametalu.setPrice(26);
        zdrajcametalu.setProductName("ZdrajcaMetalu");
        zdrajcametalu.setPerformer("Nocny Kochanek");
        zdrajcametalu.setTitle("Zdrajca Metalu");
        System.out.println(zdrajcametalu.getProductName());
        System.out.println(zdrajcametalu.getPrice());
        System.out.println(zdrajcametalu.getTittle());
        System.out.println(zdrajcametalu.getPerformer());
        }
}

