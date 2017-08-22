package Point2DAndPoint3D;


public class Point3D extends Point2D {
    private float _z = 0;

    Point3D() {
    }

    Point3D(float x, float y, float z) {
        super(x, y);
        _z = z;
    }

    public float getZ() {
        return _z;
    }

    public void setZ(float z) {
        _z = z;
    }

    public void setXYZ(float x, float y, float z) {
        setXY(x, y);
        setZ(z);
    }

    public float[] getXYZ() {
        float[] tabXYZ = new float[]{getX(), getY(), _z};
        return tabXYZ;
    }
    @Override
    public String toString() {
        return String.format("(%s,z=%f)", super.toString(), _z);
    }
}
