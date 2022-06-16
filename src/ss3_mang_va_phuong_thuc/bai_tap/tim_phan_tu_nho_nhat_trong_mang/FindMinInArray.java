package ss3_mang_va_phuong_thuc.bai_tap.tim_phan_tu_nho_nhat_trong_mang;

import java.util.Scanner;

public class FindMinInArray {
    public static void main(String[] args) {
        int size;
        int []arr;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size: ");
        size = scanner.nextInt();
        arr = new int[size];
        int i =0;
        while (i < arr.length){
            System.out.print("Nhâp phần tử  " + (i+1) + " :");
            arr[i]= scanner.nextInt();
            i++;
        }
        System.out.print("Array: ");
        for (int j =0; j< arr.length; j++){
            System.out.print(arr[j] + "\t");
        }
        int min = arr[0];
        for (int j =0; j< arr.length; j++){
            if (min > arr[j]){
                min = arr[j];

            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + min);
    }
}
