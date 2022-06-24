package ss15_xu_li_ngoai_le_va_debug.thuc_hanh;

import javafx.scene.transform.Scale;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom(){
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sách phần tử của mảng: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nNhập số phần tử bất kỳ: ");
        int x = scanner.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số "+ x + " là " + arr[x]);
        }catch (IndexOutOfBoundsException e) {
            System.out.println("Chỉ số vượt quá giưới hạn");
        }


    }
}
