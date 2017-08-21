package BookAndAuthor;


import org.junit.Assert;
import org.junit.Test;

public class BookTestAndAuthor {
    Author grey = new Author("Sasha Grey", "sasha.grey@mail.com", 'f');

    @Test
    public void authorDefaultGetNameGetEmailGetGender(){       //Sprawdzenie konstruktora
        Assert.assertEquals("Sasha Grey", grey.getName());
        Assert.assertEquals("sasha.grey@mail.com", grey.getEmail());
        Assert.assertEquals(new Character('f'), grey.getGender());  //Trzeba stworzyc nowy obiekt charackter aby porownac z charem
    }
    @Test
    public void authorDefaultSetEmail(){
        grey.setEmail("dupa@dupa.pl");
        Assert.assertEquals("dupa@dupa.pl", grey.getEmail());
    }


}
