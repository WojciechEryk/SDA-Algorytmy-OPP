package KoszykWSklepieInternetowym;


public abstract class MusicCD implements IProduct {
    protected int _price;
    protected String _name;
    protected String _title;
    protected String _performer;

    @Override
    public int getPrice() {
        return _price;
    }

    @Override
    public String getProductName() {
        return _name;
    }

    @Override
    public void setPrice(int price) {
        _price=price;
    }

    @Override
    public void setProductName(String name) {
        _name=name;
    }
    public String getTittle(){
        return _title;
    }
    public void setTitle(String title){
        _title=title;
    }
    public String getPerformer(){
        return _performer;
    }
    public void setPerformer(String performer){
        _performer=performer;
    }
}
