package ss6_inheritance_polymorphism.bai_tap.point_va_moveblepoint;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f, ySpeed = 0.0f;
    public MovablePoint(){}

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        return new float[]{xSpeed,ySpeed};
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint move(){
        setX(getX()+xSpeed);
        setY(getY()+ySpeed);
        return this;
    }

    @Override
    public String toString() {
        String res = String.format("(x= %f , y= %f), Speed= (xSpeed= %f, ySpeed= %f)",
                getX(), getY(),getXSpeed(), getYSpeed());
        return res;
    }
}
