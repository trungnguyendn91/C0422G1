package ss3_mang_va_phuong_thuc.bai_tap.tong_so_duong_cheo_trong_ma_tran_vuong;

import java.util.Scanner;

public class SumOfNumberOnSquareMatrix {
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
        for (int i = 0; i< array.length; i++){
            for (int j =0; j< array[i].length; j++){
                if (i == j){
                    sum += array[i][j];
                }
            }
        }
        System.out.print("tổng đường chéo là: " + sum);
    }
}
