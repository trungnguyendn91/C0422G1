package ss1.thuc_hanh;

import java.util.Scanner;

public class ToanTu {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);// Khai bao doi tuong vowis Scanner
        System.out.println("Enter width: ");
        width = scanner.nextFloat();// Nhap chieu rong
        System.out.println("Enter height: ");
        height = scanner.nextFloat();//Nhap chieu dai
        float area = width * height;
        System.out.println("Area is: " + area);
    }
}
