package ss5_accesmodifier_staticmethod_staticproperty.bai_tap.access_modifier;

public class Circle {
    private double radius = 10.0;
    private String color = "red";
    public Circle(){
    }
    public Circle (double radius){
      this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return radius*radius*3.14;
    }
}
