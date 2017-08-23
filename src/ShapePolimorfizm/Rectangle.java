package ShapePolimorfizm;

public class Rectangle extends Shape{
    protected double _width = 1.0;
    protected double _length = 1.0;


    //Konstruktory//
    Rectangle (){};
    Rectangle (double width, double length){
        _length=length;
        _width=width;}
    Rectangle (double width, double length, String color, boolean filled){
        super(color,filled);
        _length=length;
        _width=width;}

    public double getLength(){return _length;}
    public void setLength(double length){
        _length=length;}

    public double getWidth(){return _width;}
    public void setWidth(double width){
        _width=width;}

    public double getArea(){
        return _length*_width;
    }

    @Override
    public double getPermiter() {
        return _length*2+_width*2;
    }

    public double getPerimiter(){
        return 2*_length+2*_width;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("A Rectangle with length = ")
                .append(_length)
                .append(" and ")
                .append("with width = ")
                .append(_width)
                .append(", which is a subclass of ")
                .append(super.toString());
        return sb.toString();
    }
}
