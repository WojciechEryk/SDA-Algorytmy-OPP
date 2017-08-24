package KoszykWSklepieInternetowym;

import org.junit.Assert;
import org.junit.Test;

public class MusicCDTest {
    @Test
    public void checkGetPriceAndSetPrice() {
        MusicCD plyta = new ZdrajcaMetalu();
        plyta.setPrice(99);
        Assert.assertEquals(99, plyta.getPrice());
    }@Test
    public void checkGetProductNameAndSetProductName() {
        MusicCD plyta = new ZdrajcaMetalu();
        plyta.setProductName("NocnyKochanek");
        Assert.assertEquals("NocnyKochanek", plyta.getProductName());
    }@Test
    public void checkGetTitleAndSetTitle() {
        MusicCD plyta = new ZdrajcaMetalu();
        plyta.setTitle("Zdrajca Metalu");
        Assert.assertEquals("Zdrajca Metalu", plyta.getTittle());
    }@Test
    public void checkGetPerformerAndSetPerformer (){
        MusicCD plyta = new ZdrajcaMetalu();
        plyta.setPerformer("Nocny Kochanek");
        Assert.assertEquals("Nocny Kochanek", plyta.getPerformer());
    }
}