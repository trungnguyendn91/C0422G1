package ss4_class_and_object.bai_tap.phuong_trinh_bac_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a x 2 + b x c = 0");
        System.out.print("Nhập số a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập số b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập số c: ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c );
        System.out.println("Cho phương trình: " + quadraticEquation.disPlay());
        System.out.println("delta = " + quadraticEquation.getDiscriminant());
        if (quadraticEquation.getDiscriminant() >0){
            System.out.println("X1 = " + quadraticEquation.getRoot1()+ '\n');
            System.out.println("X2 = " + quadraticEquation.getRoot2() + "\n");
        }else if (quadraticEquation.getDiscriminant()==0){
            System.out.print("X = "+ quadraticEquation.getRoot1());
        }else {
            System.out.print("The equation has no roots");
        }
    }
}
