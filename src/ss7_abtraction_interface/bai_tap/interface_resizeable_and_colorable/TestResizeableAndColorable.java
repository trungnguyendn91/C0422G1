package ss7_abtraction_interface.bai_tap.interface_resizeable_and_colorable;

public class TestResizeableAndColorable {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3.5,"Red", true);
        shapes[1] =  new Rectangle(3.4,5.2,"Red", true);
        shapes[2] =  new Square("Red",false, 2.5);

        System.out.println("--------------Before resize: -----------");
        System.out.println(shapes[0]);
        System.out.println(shapes[1]);
        System.out.println(shapes[2]);


        System.out.println("----------------After resize: ----------------");
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
