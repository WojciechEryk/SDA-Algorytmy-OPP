package ShapeGeometricFigure;


public class Square extends ShapeGeometricFigure.Rectangle{
    Square(){}
    Square(double side){
       super(side,side);}
    Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }

    public double getSide(){
        return getLength();
    }

    public void setSide(double side){
        setLength(side);
        setWidth(side);
    }

    @Override
    public void setWidth(double side){
        super.setWidth(side);
        super.setLength(side);
    }
}
