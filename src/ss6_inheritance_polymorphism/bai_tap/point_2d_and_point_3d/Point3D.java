package ss6_inheritance_polymorphism.bai_tap.point_2d_and_point_3d;

public class Point3D extends Point2D {
    private float z = 0.0f;
    public Point3D(){}
    public Point3D(float x, float y, float z){
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public float[] getXYZ(){
        float[] rest = {getX(), getY(), z};
        return  rest;
    }
    public void setXYZ(float x, float y, float z){
        this.z = z;
        float [] rest ={getX(), getY(), z};
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x= " + getX() +
                ", y= " + getY() +
                ", z= " + z +
                '}';
    }
}
