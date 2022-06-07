package ss1_introduction_to_java.bai_tap.bai_2;

import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập số tiền USD muốn đổi: ");
        double usd = scanner.nextDouble();
        double vnd = usd * 23000;
        System.out.printf("Số tiền VND là: " + vnd + " VND");

    }
}
