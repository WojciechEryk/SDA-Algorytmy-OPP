package Rectangle;


import com.sun.org.apache.regexp.internal.RE;

public class Rectangle {
    private float _length=1;
    private float _width=1;

    public Rectangle(){}
    public Rectangle(float length, float width){
        _length=length;
        _width=width;
    }
    public float getLength(){return _length;}
    public void setLength(float length){
        _length=length;}

    public float getWidth(){return _width;}
    public void setWidth(float width){
    _width=width;}

    public float getArea(){
        return _length*_width;
    }
    public float getPerimiter(){
        return 2*_length+2*_width;
    }
    public String toString(){
        return String.format("Rectangle[length=%f, width=%f", _length,_width);
    }

}
