package ss6_inheritance_polymorphism.bai_tap.circle_and_cylinder;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        Circle circle1 = new Circle(2.5, "red");
        System.out.println(circle1);

        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        Cylinder cylinder1 = new Cylinder(3.7, "blue", 2.4);
        System.out.println(cylinder1);
    }
}
