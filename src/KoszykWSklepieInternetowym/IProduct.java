package KoszykWSklepieInternetowym;

public interface IProduct {
    int getPrice ();
    String getProductName();

    void setPrice(int price);
    void setProductName(String name);
}
