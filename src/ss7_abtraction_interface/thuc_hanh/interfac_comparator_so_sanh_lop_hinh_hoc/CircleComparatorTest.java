package ss7_abtraction_interface.thuc_hanh.interfac_comparator_so_sanh_lop_hinh_hoc;
import ss7_abtraction_interface.thuc_hanh.interface_comparable_lop_hinh_hoc.Circle;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Comparator;
public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle(1.2);
        circles[2] = new Circle(4.6,"ingo",true);
        System.out.println("Pre-shorted");
        for (Circle circle:circles){
            System.out.println(circle);
        }
        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles,circleComparator);
        System.out.println("After shorted: ");
        for (Circle circle : circles){
            System.out.println(circle);
        }
    }
}
