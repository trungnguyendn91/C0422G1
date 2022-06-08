package ss2_loop.bai_tap.so_nguyen_to;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        int Number;
        int N = 2;
        System.out.println("Nhập số lượng số nguyên tố cần tìm");
         Number = input.nextInt();
         while (count<Number){
             int count1 = 0;
             for (int i = 2; i < N; i++){
                 if (N%i ==0){
                     count1++;
                 }
             }
             if(count1==0){
                 System.out.print( N + " " );
                 count++;
             }
             N++;
         }
    }
}
