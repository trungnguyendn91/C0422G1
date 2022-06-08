package ss2_loop.bai_tap.menu_drawing;

import java.util.Scanner;

public class HinhThoiRong {
    public static void main(String[] args) {
        for (int i=1; i<6; i++) {
            for (int j = 1; j <= 10; j++) {
               if (j== (6-i)|| j==(5 + i) ){
                   System.out.print(i);
               }else {
                   System.out.print(" ");
               }
            }
            System.out.println();
        }
        for (int i=4; i>0; i--) {
            for (int j = 1; j <10; j++) {
                if (j== (6-i)|| j==(5 + i) ){
                    System.out.print(i);
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
