package ss3_mang_va_phuong_thuc.thuc_hanh.array;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String [] students ={"Tùng", "Chí", "Nhân", "Quý", "Phú", "Trung", "Nga", "My"};
        /*Khai báo biến lưu tên tìm kiếm và  gán với giá trị nhập và*/
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a name's student: ");
        String input_name = scanner.nextLine();
    /*Duyệt mảng sinh viên đã khai báo ở trên, tìm phần tử có giá trị bằng với tên đã nhập vào.
    */
        boolean isExist = false;
        for (int i =0; i< students.length; i++){
            if(students[i].equals(input_name)) {
                System.out.println("Position of the students in the list " + input_name + " is " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist){
            System.out.println("Not found " + input_name+ " in the list." );
        }
    }

}
