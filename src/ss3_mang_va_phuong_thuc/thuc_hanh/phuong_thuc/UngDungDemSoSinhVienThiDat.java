package ss3_mang_va_phuong_thuc.thuc_hanh.phuong_thuc;

import java.util.Scanner;

public class UngDungDemSoSinhVienThiDat {
    public static void main(String[] args) {
        /*Bước 1: Khai báo các biến, nhập và kiểm tra kích thước mảng*/
        int size;
        int [] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter size: ");
            size = scanner.nextInt();
            if (size > 30){
                System.out.print("Size over 30");
            }
        }while (size>30);
        array = new int[size];
        int i = 0;
        while (i<array.length){
            System.out.print("Nhập điể cho sinh viên " + (i+1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        int count = 0;
        System.out.print("list điểm: ");
        for (int j=0; j<array.length; j++){
            System.out.print(array[j]+ "\t");
            if (array[j]>5 && array[j] < 10){
                count++;
            }
        } System.out.print("\nSố lượng  sinh viên thi qua: " + count);
    }
}
