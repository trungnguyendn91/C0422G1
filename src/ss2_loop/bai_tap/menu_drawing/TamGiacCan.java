package ss2_loop.bai_tap.menu_drawing;

import java.util.Scanner;

public class TamGiacCan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào chiều cao hình chữ nhật: ");
        int h = input.nextInt();
        for (int i=0; i<=h; i+=2){
            for ( int j =0; j <= i; j++){
                System.out.printf("*");
            }
            System.out.println(" ");
        }
    }
}
