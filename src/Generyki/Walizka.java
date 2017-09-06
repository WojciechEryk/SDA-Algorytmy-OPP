package Generyki;

public class Walizka<T extends Clothes & ICanFolded> {
    private T _przedmiot;

    public void setThing (T przedmiot){_przedmiot=przedmiot;}

    public T getThing(){
        return _przedmiot;
    }
    public String getThingName(){
        return _przedmiot.getName();
    }
    public String getThingDescription(){
        return _przedmiot.getDescription();
    }
    public String getThingSize(){
        return _przedmiot.getSize();
    }


}
