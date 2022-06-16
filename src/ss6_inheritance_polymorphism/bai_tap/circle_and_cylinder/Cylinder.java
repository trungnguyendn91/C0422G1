package ss6_inheritance_polymorphism.bai_tap.circle_and_cylinder;

public class Cylinder extends Circle {
    private double high;
    public Cylinder(){
    }
    public Cylinder(double radius, String color, double high){
        super(radius,color);
        this.high=high;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }
    public double getVolume(){
        return getRadius()*getRadius()*high*Math.PI;
    }

    @Override
    public String toString() {
        return "Hình trụ có: " + "\n"+
                "bán kính r = " + getRadius() + "\n"+
                "diện tích : " + getArea()+"\n"+
                "Chu vi: " + getPerimeter()+"\n"+
                "Thể tích: "+ getVolume()+"\n"+
                "color: " + getColor();
    }
}
