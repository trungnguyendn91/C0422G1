package ss6_inheritance_polymorphism.bai_tap.point_va_moveblepoint;

public class Point {
    private float x = 0.0f, y = 0.0f;
    public Point(){}

    public Point(float x, float y) {
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
        float[] res = {x ,y};
        return res;
    }
    public void setXY(){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x= " + x +
                ", y= " + y +
                '}';
    }
}