package ss7_abtraction_interface.thuc_hanh.interface_comparable_lop_hinh_hoc;

public class Circle {
    private double radius = 1.0;
    private String color = "white";
    private boolean filled =true;

    public Circle() {
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public Circle(double radius) {
        this.radius = radius;
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
    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Hình tròn có: " + "\n"+
                "bán kính r = " + radius/* + "\n"+
                "diện tích : " + getArea()+"\n"+
                "Chu vi: " + getPerimeter()+"\n"+
                "color: " + color +"\n"+
                ", filled=" + filled +*/
                ;
    }
}
