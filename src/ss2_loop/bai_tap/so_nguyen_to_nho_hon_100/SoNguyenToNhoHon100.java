package ss2_loop.bai_tap.so_nguyen_to_nho_hon_100;

import java.util.Scanner;

public class SoNguyenToNhoHon100 {
    public static void main(String[] args) {
        while (true) {
            int count = 0;
            int number;
            int n = 2;
            Scanner input = new Scanner(System.in);
            System.out.print("\nNhập số lượng số nguyên tố cần tìm: ");
            number = input.nextInt();
            while (count < number) {
                int count1 = 0;
                for (int i = 2; i < n; i++) {
                    if (n % i == 0) {
                        count1++;
                    }
                }
                if (count1 == 0) {
                    System.out.print(n + " ");
                    count++;
                }
                n++;
                if (n > 100) {
                    break;
                }
            }
            if (number == 0){
                System.out.print("Chương trình kết thúc!");
                break;
            }
        }
    }
}
