package ss6_inheritance_polymorphism.bai_tap.circle_and_cylinder;

public class Circle {
    private double radius = 1.0;
    private String color = "white";

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getPerimeter(){
        return radius*2*Math.PI;
    }

    @Override
    public String toString() {
        return "Hình tròn có: " + "\n"+
                "bán kính r = " + radius + "\n"+
                "diện tích : " + getArea()+"\n"+
                "Chu vi: " + getPerimeter()+"\n"+
                "color='" + color ;
    }
}
