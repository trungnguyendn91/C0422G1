package ss6_inheritance_polymorphism.thuc_hanh.he_cac_doi_tuong_hinh_hoc;

public class Rectangle extends Shape {
    private double width =1.0;
    private double length = 1.0;
    public Rectangle(){
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return width* this.length;
    }
    public double getPerimeter(){
        return (width + this.length)*2;
    }

    @Override
    public String toString() {
        return "a Rectangle with width: " + getWidth() +
                " and length: " + getLength() +
                " ,which ís a subclass of " + super.toString();
    }
}
