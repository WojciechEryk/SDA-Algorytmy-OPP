package Circle;


import org.junit.Assert;
import org.junit.Test;

public class CircleTest {
    Circle cos3 = new Circle();

@Test
    public void checkGetRadius(){
    Assert.assertEquals(1, cos3.getRadius());
}
}
