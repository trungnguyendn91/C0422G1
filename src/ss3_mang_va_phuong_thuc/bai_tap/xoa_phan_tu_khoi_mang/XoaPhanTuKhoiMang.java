package ss3_mang_va_phuong_thuc.bai_tap.xoa_phan_tu_khoi_mang;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int arr [] = {2, 4, 1, 6, 5, 9, 10};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value want remove");
        int value = scanner.nextInt();
        int index = 0;
        for (int i =0; i< arr.length; i++){
            if (arr[i] == value){
                index = i;
            }
        }
        for (int i = index; i < (arr.length - 1) ; i++){
            arr[i] = arr[i+1];
        }
        for (int i =0; i < arr.length - 1; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
