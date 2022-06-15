package ss7_abtraction_interface.bai_tap.interface_resizeable;

public class TestResizeable {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] =  new Rectangle();
        shapes[2] =  new Square();

        System.out.println("Before resize: ");
        System.out.println(new Circle(3.5,"Red", true));
        System.out.println(new Rectangle(3.4,5.2,"Red", true));
        System.out.println(new Square("Red",true, 2.5));


        System.out.println("After resize: ");
        for (Shape shape : shapes){
            if (shape instanceof Circle){
                ((Circle) shape).resize(Math.random()*100);
                System.out.println(shape);
            } else if (shape instanceof Rectangle){
                ((Rectangle) shape).resize(Math.random()*100);
                System.out.println(shape);
            }else if (shape instanceof Square){
                ((Square) shape).resize(Math.random()*100);
                ((Square) shape).howToColor();
                System.out.println(shape);
            }
        }

    }
}
