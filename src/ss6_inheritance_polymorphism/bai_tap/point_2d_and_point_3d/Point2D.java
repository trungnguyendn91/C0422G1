package ss6_inheritance_polymorphism.bai_tap.point_2d_and_point_3d;

public class Point2D {
    private float x = 0.0f, y = 0.0f;
    public Point2D(){
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public float[] getXY(){
        float[] rest = {x, y};
        return rest;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x= " + x +
                ", y= " + y +
                '}';
    }
}
