package ss3_mang_va_phuong_thuc.thuc_hanh.array;

import java.util.Scanner;

public class TimGiaTriLonNhatTrongMang {
    public static void main(String[] args) {
        /*Khai báo biến, nhập và kiểm tra kích thước mảng.*/
        int size;
        int [] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size do not exceed 20");
        }while (size > 20);
        /* Nhập giá trị cho các phần tử */
        array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.println("Enter Element " + (i +1 ) + " :");
            array[i] = scanner.nextInt();
            i++;
        }
        /* in danh sách đã nhập */
        System.out.println("Property list: ");
        for (int j=0 ; j< array.length; j++){
            System.out.print(array[j]+ "\t");
        }
       /* Duyệt các phần tử trong mảng để tìm GTLN và vị trí*/
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++){
            if (array[j] > max){
                max = array [j];
                index = j + 1;
            }
        }
        System.out.println("\nThe largest property value in the list is " + max + " ,at position " + index);

    }
}
