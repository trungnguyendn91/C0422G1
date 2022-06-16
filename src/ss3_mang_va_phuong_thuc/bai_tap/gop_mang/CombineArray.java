package ss3_mang_va_phuong_thuc.bai_tap.gop_mang;

import java.util.Scanner;

public class CombineArray {
    public static void main(String[] args) {
        int size1;
        int[] array1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a size for array 1:");
        size1 = scanner.nextInt();
        array1 = new int[size1];
        int i1 = 0;
        while (i1 < array1.length) {
            System.out.print("Enter Element " + (i1 + 1) + " :");
            array1[i1] = scanner.nextInt();
            i1++;
        }
        int size2;
        int[] array2;
        System.out.print("Enter a size for array 2:");
        size2 = scanner.nextInt();
        array2 = new int[size2];
        int i2=0;
        while (i2 < array2.length) {
            System.out.print("Enter Element " + (i2 + 1) + " :");
            array2[i2] = scanner.nextInt();
            i2++;
        }
        System.out.print("array 1: ");
        for (int j1=0 ;j1< array1.length; j1++){
            System.out.print(array1[j1]+ "\t" );
        }
        System.out.print("\narray 2: ");
        for (int j2=0 ; j2< array2.length; j2++){
            System.out.print( array2[j2]+ "\t");
        }
        System.out.print("\narray 3: ");
        int[] array3 = new int[array1.length+array2.length];
        for (int i= 0 ; i < array1.length; i++){
            array3[i] = array1 [i];
        }
        for (int i = 0; i < array2.length; i++){
            array3[size1+ i] = array2[i];
        }
        for (int i =0; i < array3.length; i++){
            System.out.print( array3[i]+"\t");
        }
    }
}
