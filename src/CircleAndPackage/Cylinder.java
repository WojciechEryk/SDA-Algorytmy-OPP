package CircleAndPackage;


public class Cylinder extends Circle {
    private double _height = 1.0;

    Cylinder(){super();}           //konstruktor bez argumentowy, super odwołuję się do konstruktora pustego z circle
    Cylinder(double radius){       // konstruktor odwołuje się po typie to konstruktora w kole z samym doublem
        super(radius);}
    Cylinder (double radius, double height){
        super(radius);
        _height=height;
    }
    Cylinder(double radius, double height, String color){
        super(radius,color);
        _height=height;
    }

    public double getHeight(){return _height;}
    public void setHeight(double height){
        _height=height;
    }
    public double getVolume(){
        return getArea()*_height;
    }
}
