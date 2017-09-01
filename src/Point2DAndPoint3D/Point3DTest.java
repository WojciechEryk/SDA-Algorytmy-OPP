package Point2DAndPoint3D;

import org.junit.Assert;
import org.junit.Test;

public class Point3DTest {
    @Test
    public void checkGetAndSetForZForDefaultCounstruction(){
        Point3D punk = new Point3D();
        punk.setZ(1);
        Assert.assertEquals(1, punk.getZ(),0.1);
    }
    @Test
    public void checkGetAndSetForXForDefaultCounstruction(){
        Point3D punk = new Point3D();
        punk.setX(1);
        Assert.assertEquals(1, punk.getX(),0.1);
    }
    @Test
    public void checkGetAndSetForYForDefaultCounstruction(){
        Point3D punk = new Point3D();
        punk.setY(1);
        Assert.assertEquals(1, punk.getY(),0.1);
    }
    @Test
    public void checkNotDefaultConstruction(){
        Point3D punkNotEmpty = new Point3D(2,3,4);
        Assert.assertEquals(2, punkNotEmpty.getX(),0.1);
        Assert.assertEquals(3, punkNotEmpty.getY(),0.1);
        Assert.assertEquals(4, punkNotEmpty.getZ(),0.1);
    }
    @Test
    public void checkGetXYZfornotDefaultConstruction(){
        Point3D punkNotEmpty = new Point3D(2,3,4);
        float [] tab = {2,3,4};
        Assert.assertArrayEquals(tab,punkNotEmpty.getXYZ(),0);
    }

}
