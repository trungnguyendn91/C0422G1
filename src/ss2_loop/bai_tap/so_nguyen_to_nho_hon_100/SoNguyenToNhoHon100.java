package ss2_loop.bai_tap.so_nguyen_to_nho_hon_100;

import java.util.Scanner;

public class SoNguyenToNhoHon100 {
    public static void main(String[] args) {
        while (true) {
            int count = 0;
            int Number;
            int N = 2;
            Scanner input = new Scanner(System.in);
            System.out.println("\nNhập số lượng số nguyên tố cần tìm ");
            Number = input.nextInt();
            while (count < Number) {
                int count1 = 0;
                for (int i = 2; i < N; i++) {
                    if (N % i == 0) {
                        count1++;
                    }
                }
                if (count1 == 0) {
                    System.out.print(N + " ");
                    count++;
                }
                N++;
                if (N > 100) {
                    break;
                }
            }
        }
    }
}
