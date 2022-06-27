package Case_study.framework.control;

import Case_study.framework.service.impl.MotoService;

import java.util.Scanner;

public class Main {
    private  static MotoService motoService = new MotoService();
    public static void displayMenu(){
        boolean flag = true;
        do {
            System.out.println("Chức năng của hệ thống " +
                    "\n 1.Thêm" +
                    "\n 2.Sửa" +
                    "\n 3.Xóa" +
                    "\n 4.In ra màn hình" +
                    "\n 5.Tìm bằng biển số" +
                    "\n 7.Exit");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Chọn chức năng");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("chức năng thêm sản phẩm");
                    motoService.add();
                    break;
                case 2:
                    System.out.println("Chức năng sửa thông tin theo biển số xe");
                    motoService.edit();
                    break;
                case 3:
                    System.out.println("Chức năng xoá theo biển số");
                    motoService.delete();
                    break;
                case 4:
                    System.out.println("chức năng hiển thị danh sách ");
                    motoService.display();
                    break;
                case 5:
                    System.out.println("chức năng tìm kiếm theo biển số");
                    motoService.searchByName();
                    break;
                default:
                    flag = false;
            }
        } while (flag);
    }

}
