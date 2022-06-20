package ss11_stack_and_queue.bai_tap.dao_nguoc_phan_tu_trong_mang_bang_stack;

import ss11_stack_and_queue.thuc_hanh.trien_khai_stac_su_dung_lop_linkedList.MyGenericStack;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class ReverseInteger {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        /* Khai báo các biến, nhập và kiểm tra kích thước mảng*/
        int size;
        int [] array;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size do not exceed 20");
        }while (size > 20);
        /*Nhập giá trị cho các phần tử của mảng*/
        array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.print("Enter element " + (i+1) + ":");
            array[i] = scanner.nextInt();
            i++;
        }
        /* In ra mảng đã nhập*/
        System.out.printf ("%-20s%s", "Phần tử trong mảng: ", "");
        for (int j =0 ; j< array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        System.out.printf("%-20s%s", "\nPhần tử trong stack: ", "");
        for(int j =0; j< array.length; j++){
            System.out.print( stack.push(array[j])+ "\t");
        }
        System.out.printf("%-20s%s", "\nPhần tử sau khi đảo: ", "");
        for (int j = stack.size(); j>0; j--){
            System.out.print(stack.pop()+ "\t");
        }

    }

}
