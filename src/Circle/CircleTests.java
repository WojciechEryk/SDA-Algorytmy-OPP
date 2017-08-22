package Circle;


import org.junit.Assert;
import org.junit.Test;

public class CircleTests {

    @Test
    public void checkGetRadius(){
        Circle cos3 = new Circle();
        Assert.assertEquals(1, cos3.getRadius(),0.1);
    }
    @Test
    public void checkGetRadiusFromConstruction(){
        Circle cosZWymiarem = new Circle(3.0);
        Assert.assertEquals(3, cosZWymiarem.getRadius(),0.1);
    }

    @Test
    public void checkSetRadiusfordefaultConstrucition(){
        Circle cos3 = new Circle();
        cos3.setRadius(2);
        Assert.assertEquals(2, cos3.getRadius(),0.1);
    }
    @Test
    public void checkSetRadiusForNotDefaultConstruction(){
        Circle cosZWymiarem = new Circle(3.0);
        cosZWymiarem.setRadius(2);
        Assert.assertEquals(2, cosZWymiarem.getRadius(),0.1);
    }
    @Test
    public void checkGetAreaForDefaultConstruction(){
        Circle cos3 = new Circle();
        Assert.assertEquals(3.14, cos3.getArea(),0.1);
    }
    @Test
    public void checkGetAreaForNotDefaultConstruction(){
        Circle cosZWymiarem = new Circle(3.0);
        Assert.assertEquals(28.27, cosZWymiarem.getArea(),0.1);
    }
    @Test
    public void checkGetCircumFerenceForDefaultCircle(){
        Circle cos3 = new Circle();
        Assert.assertEquals(6.28, cos3.getCircumference(),0.1);
    }
    @Test
    public void checkGetCircumFerenceForNotDefaultCircle(){
        Circle cosZWymiarem = new Circle(3.0);
        Assert.assertEquals(18.85, cosZWymiarem.getCircumference(),0.1);
    }

}

