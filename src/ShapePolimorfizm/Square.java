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

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("A Square with side=")
                .append(getSide())
                .append(" wchich is a subclass of ")
                .append(getClass());
        return sb.toString();
    }
}
