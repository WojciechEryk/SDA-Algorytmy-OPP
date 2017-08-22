package Point2DAndPoint3D;


public class Point2D {
    private float _x=0;
    private float _y=0;

    //Constructions//

    public Point2D(){}
    public Point2D(float x, float y){
        _x=x;
        _y=y;
    }

    //Methods//

    public float getX(){return _x;}
    public void setX(float x){
        _x=x;}
    public float getY(){return _y;}
    public void setY(float y){
        _y=y;}

    public void setXY(float x, float y){
        _x=x;
        _y=y;}

    public float[] getXY(){                     //Trzeba zwrócić tablice dwóch floatów
        float[]tab = new float[]{_x,_y};
        return tab;
    }
    @Override
    public String toString(){
        return String.format("x=%f,y=%f", _x,_y);
    }
}
