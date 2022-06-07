package ss2_loop.bai_tap.menu_drawing;

import java.util.Scanner;

public class TamGiacVuongTopLeft {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào chiều cao hình chữ nhật: ");
        int h = input.nextInt();
        for (int i=h; i>0; i--){
            for ( int j = i; j > 0; j--){
                System.out.printf("*");
            }
            System.out.println("");
        }
    }
}
