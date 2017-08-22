package CircleAndPackage;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.notification.RunListener;

public class CicleAndPackageTests {
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
        //    CYLINDER TESTY //

        @Test
        public void checkDefaultConstructionForRadius(){
            Cylinder empty = new Cylinder();
            Assert.assertEquals(1,empty.getRadius(),1.0);
        }
        @Test
        public void checkDefaultConstructionForColor(){
            Cylinder empty = new Cylinder();
            Assert.assertEquals("red",empty.getColor());
        }
        @Test
        public void checkDefaultConstructionForHeight(){
            Cylinder empty = new Cylinder();
            Assert.assertEquals(1.0,empty.getHeight(),1.0);
        }
        @Test
        public void checkDefaultConstructionForArea(){
            Cylinder empty = new Cylinder();
            Assert.assertEquals(3.14,empty.getArea(),1.0);
    }
        @Test
        public void checkDefaultConstructionForVolume(){
            Cylinder empty = new Cylinder();
            Assert.assertEquals(3.14,empty.getVolume(),1.0);
    }
        @Test
        public void checkSetHeightTheBiggestCylinderConstructions(){
            Cylinder notEmpty = new Cylinder(2.0, 2.0, "red");
            notEmpty.setHeight(5);
            Assert.assertEquals(5,notEmpty.getHeight(),0.1);
        }
        @Test
    public void checkSecondConstruction(){
            Cylinder SecondConstruction = new Cylinder(2.0);
            Assert.assertEquals(2,SecondConstruction.getRadius(),0.1);
        }
    @Test
    public void checkThirdConstruction(){
        Cylinder thirdConstruction = new Cylinder(2.0, 5.0);
        Assert.assertEquals(5.0,thirdConstruction.getHeight(),0.1);
    }
    @Test
    public void checkGetValueForTheBiggestConstruction(){
        Cylinder notEmpty = new Cylinder(2.0, 2.0, "red");
        Assert.assertEquals(25, notEmpty.getVolume(),1.0);
    }
    }



