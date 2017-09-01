package Point2DAndPoint3D;


import org.junit.Assert;
import org.junit.Test;

public class Point2DTest {
    @Test
    public void checkGetXForDefaultConstruction(){
        Point2D empty = new Point2D();
        Assert.assertEquals(0,empty.getX(),0.1);
    }
    @Test
    public void checkGetYForDefaultConstruction() {
        Point2D empty = new Point2D();
        Assert.assertEquals(0, empty.getY(), 0.1);
    }
    @Test
    public void checkSetXForDefaultConstruction(){
        Point2D empty = new Point2D();
        empty.setX(1);
        Assert.assertEquals(1, empty.getX(),0.1);
    }
    @Test
    public void checkSetYForDefaultConstruction(){
        Point2D empty = new Point2D();
        empty.setY(1);
        Assert.assertEquals(1, empty.getY(),0.1);
    }
    @Test
    public void checkSetXYForDefaultConstruction(){
        Point2D empty = new Point2D();
        empty.setXY(2,5);
        Assert.assertEquals(2, empty.getX(),0.1);
        Assert.assertEquals(5, empty.getY(),0.1);
    }
    @Test
    public void checkGetXAndYForDefaultConstruction(){
        Point2D empty = new Point2D();
        Assert.assertEquals(0, empty.getX(),0.1);
        Assert.assertEquals(0, empty.getY(),0.1);
    }
    @Test
    public void checkGetXYForDefaultConstruction(){
        Point2D empty = new Point2D();
        float [] tab = new float[2];
        Assert.assertArrayEquals(tab,empty.getXY(),0);
    }
    @Test
    public void checkGetAndSetForXAndYForNotDefaultConstruction(){
        Point2D notEmpty = new Point2D(24,51);
        notEmpty.setX(42);
        notEmpty.setY(15);
        Assert.assertEquals(42, notEmpty.getX(),0.1);
        Assert.assertEquals(15, notEmpty.getY(),0.1);
    }
}
