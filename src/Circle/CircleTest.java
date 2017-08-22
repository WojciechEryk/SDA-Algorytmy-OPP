package Circle;


import org.junit.Assert;
import org.junit.Test;

public class CircleTest {
    Circle podstawowy = new Circle();

@Test
    public void checkGetRadius(){
    Assert.assertEquals(1.0, podstawowy.getRadius(),0.1);
}


}
