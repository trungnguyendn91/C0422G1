package ss6_inheritance_polymorphism.thuc_hanh.he_cac_doi_tuong_hinh_hoc;

import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;

public class ShapeTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.15);
        System.out.println(circle);
        circle =new Circle("red", true, 3.14);
        System.out.println(circle);

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3 , 5.8);
        System.out.println(rectangle);
        rectangle = new Rectangle("orange", true, 3.2, 5.7  );
        System.out.println(rectangle);

        Square square = new Square();
        System.out.println(square);

        square = new Square(2.5);
        System.out.println(square);

        square = new Square("green", 5.8 , false);
        System.out.println(square);
    }
}
