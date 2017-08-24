package KoszykWSklepieInternetowym;

import org.junit.Assert;
import org.junit.Test;

public class BookTest {

    @Test
    public void checkGetPriceAndSetPrice(){
        Book harry = new HarryPotter();
        harry.setPrice(20);
        Assert.assertEquals(20, harry.getPrice());
    }    @Test
    public void checkGetProductNameAndSetProductName(){
        Book harry = new HarryPotter();
        harry.setProductName("Harry Potter");
        Assert.assertEquals("Harry Potter", harry.getProductName());
    }    @Test
    public void CheckGetTitleAndSetTitle(){
        Book harry = new HarryPotter();
        harry.setTitle("Kamien Filozoficzny");
        Assert.assertEquals("Kamien Filozoficzny", harry.getTittle());
    }    @Test
    public void CheckGetAuthorAndSetAuthor(){
        Book harry = new HarryPotter();
        harry.setAuthor("J.K. Rowling");
        Assert.assertEquals("J.K. Rowling", harry.getAuthor());
    }
}
