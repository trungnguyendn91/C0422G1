package ss3_mang_va_phuong_thuc.thuc_hanh.phuong_thuc;

import java.util.Scanner;

public class ChuongTrinhChuyenDoiNhietDo {
    /*Sử dụng vòng lặp do/while và cấu trúc lựa chọn switch/case
    để hiển in ra menu lựa chọn cho người dùng.*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;
        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter Fahrenheit: ");
                    fahrenheit = input.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Enter Celsius");
                    celsius = input.nextDouble();
                    System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(celsius));
                    break;
                case 0:
                    System.exit(0);
            }
        }while (choice!=0);
    }
    public static double fahrenheitToCelsius (double fahrenheit){
        double celsius = (5.0 /9 )*(fahrenheit - 32);
        return  celsius;
    }
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0/5)*(celsius +32);
        return fahrenheit;
    }

}
