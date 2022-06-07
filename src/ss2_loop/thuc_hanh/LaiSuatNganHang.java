package ss2_loop.thuc_hanh;

import java.util.Scanner;

public class LaiSuatNganHang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money ;
        int month ;
        double interestRate;
        System.out.println("Nhập số tiền gởi: ");
        money = scanner.nextDouble();
        System.out.println("Nhập số tháng: ");
        month = scanner.nextInt();
        System.out.println("Nhập lãi suất: ");
        interestRate = scanner.nextDouble();
        double totalInterest = 0;
        for (int i = 0; i < month; i++){
            totalInterest += money * (interestRate/100)/12 * month;
        }
        System.out.println("Tổn số tiền lãi: " + totalInterest);
    }
}
