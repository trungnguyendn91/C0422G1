package ss2_loop.bai_tap.menu_drawing;

import java.util.Scanner;

public class MenuDrawing {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0){
            System.out.println("Menu");
            System.out.println("1. Vẽ Hình Chữ Nhật");
            System.out.println("2. Vẽ Tam Giác Cân");
            System.out.println("3. Vẽ Tam Giác Vuông ");
            System.out.println("4. Vẽ Tam Giác Vuông Với Góc Vuông Ở Trên ");
            System.out.println("0. Exit");
            System.out.println("Enter your choice");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    HinhChuNhat.main(new String[]{});
                    break;
                case 2:
                    TamGiacCan.main(new String[]{});
                    break;
                case 3:
                    TamGiacVuong.main(new String[]{});
                    break;
                case 4:
                    TamGiacVuongTopLeft.main(new String[]{});
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
