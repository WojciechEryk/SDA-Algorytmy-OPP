package Circle;


public class Circle {
    private double _radius = 1.0;

    public Circle(){}

    public Circle (double radius){
        _radius=radius;
    }

    public double getRadius(){return _radius;}
    public void setRadius(double radius) {
        _radius = radius;
    }
    public double getArea(){
       return Math.PI*Math.pow(_radius,2);
    }
    public double getCircumference(){
       return Math.PI*2*_radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "_radius=" + _radius + '}';
    }
}
