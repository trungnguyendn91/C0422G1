package ss6_inheritance_polymorphism.bai_tap.point_va_moveblepoint;

public class TestPoint {
    public static void main(String[] args) {
        Point point = new Point(5.5f,4.8f);
        System.out.println(point);

        MovablePoint movablePoint = new MovablePoint(2.2f, 2.3f,3.5f,4.8f);
        System.out.println(movablePoint);
        System.out.println(movablePoint.move());
    }
}
