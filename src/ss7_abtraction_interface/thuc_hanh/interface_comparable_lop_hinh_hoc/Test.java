package ss7_abtraction_interface.thuc_hanh.interface_comparable_lop_hinh_hoc;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles [1] = new ComparableCircle(2.7);
        circles [2] = new ComparableCircle(4.3, "indigo", false);

        System.out.println("Pre - sorted: ");
        for (ComparableCircle circle: circles){
            System.out.println(circle);
        }
        // sap xep
        Arrays.sort(circles);
        System.out.println("After- sorted");
        for (ComparableCircle circle : circles){
            System.out.println(circle);
        }

    }
}
