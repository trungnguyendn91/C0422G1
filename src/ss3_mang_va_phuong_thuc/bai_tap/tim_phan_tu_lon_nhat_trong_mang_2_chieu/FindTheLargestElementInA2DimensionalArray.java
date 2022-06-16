package ss3_mang_va_phuong_thuc.bai_tap.tim_phan_tu_lon_nhat_trong_mang_2_chieu;

import java.util.Scanner;

public class FindTheLargestElementInA2DimensionalArray {
    public static void show(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print( arr[i][j] + " \t");
            }
            System.out.println();
        }
    }
    public static void main (String[]args){
        int row, col;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter row: ");
        row = scanner.nextInt();
        System.out.print("Enter col: ");
        col = scanner.nextInt();
        int[][] array = new int[row][col];
        for (int i =0; i<row; i++){
            for (int j = 0; j<col; j++){
                System.out.print("Nhập các phần tử ["+i+","+j+"]:");
                array[i][j] = scanner.nextInt();
            }
        }
        show(array);
        int max = array[0][0];
        for (int i=0; i< array.length; i++){
            for (int j=0; j< array[i].length; j++){
                if (max < array[i][j]){
                    max = array[i][j];
                }
            }
        }
        System.out.println("Phần tử lớn nhất là: " + max);
    }
}

