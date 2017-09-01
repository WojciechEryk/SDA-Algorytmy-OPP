package Rectangle;

import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {
    @Test
    public void checkDefaultConstructionForGetLength(){
        Rectangle rec = new Rectangle();
        Assert.assertEquals(1,rec.getLength(),0.1);
    }
    @Test
    public void checkDefaultConstructionForGetWidth(){
        Rectangle rec = new Rectangle();
        Assert.assertEquals(1,rec.getWidth(),0.1);
    }
    @Test
    public void checkDefaultConstructionGetPerimeter(){
        Rectangle rec = new Rectangle();
        Assert.assertEquals(4,rec.getPerimiter(),0.1);
    }
    @Test
    public void checkDefaultConstructionForGetArea(){
        Rectangle rec = new Rectangle();
        Assert.assertEquals(1,rec.getArea(),0.1);
    }
    @Test
    public void checkNotDefaultConstructionForGetLength(){
        Rectangle rec = new Rectangle(2,2);
        Assert.assertEquals(2,rec.getLength(),0.1);
    }
    @Test
    public void checkNotDefaultConstructionForGetWidth(){
        Rectangle rec = new Rectangle(2,2);
        Assert.assertEquals(2,rec.getWidth(),0.1);
    }
    @Test
    public void checkNotDefaultConstructionForGetPerimeter(){
        Rectangle rec = new Rectangle(2,2);
        Assert.assertEquals(8,rec.getPerimiter(),0.1);
    }
    @Test
    public void checkNotDefaultConstructionForGetArea(){
        Rectangle rec = new Rectangle(2,2);
        Assert.assertEquals(4,rec.getArea(),0.1);
    }

}
