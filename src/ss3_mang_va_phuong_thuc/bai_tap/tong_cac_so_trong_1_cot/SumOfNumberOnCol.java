package ss3_mang_va_phuong_thuc.bai_tap.tong_cac_so_trong_1_cot;

import java.util.Scanner;

public class SumOfNumberOnCol {
    public static void show(int[][] arr) {
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " \t");
            }
            System.out.println();
        }
    }
    public static void main (String[]args) {
        int row, col;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter row: ");
        row = scanner.nextInt();
        System.out.print("Enter col: ");
        col = scanner.nextInt();
        int[][] array = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Nhập các phần tử [" + i + "," + j + "]:");
                array[i][j] = scanner.nextInt();
            }
        }
        show(array);
        int sum = 0;
        int colNumber;
        System.out.print("Nhập số cột muốn tính tổng: ");
        colNumber = scanner.nextInt();
        if (colNumber > col){
            System.out.print("Không tồn tại");
        }else {
            for (int[] ints : array) {
                for (int j = 0; j < ints.length; j++) {
                    if ((colNumber - 1) == j) {
                        sum += ints[colNumber - 1];
                    }
                }

            }
            System.out.print("Tổng các số ở cột " + colNumber + " là: " + sum);

        }

    }
}
