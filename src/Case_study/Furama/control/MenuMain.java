package Case_study.Furama.control;

import Case_study.bai_tap_them.service.impl.MotoService;

import java.util.Scanner;

public class Menu {
    private  static MotoService motoService = new MotoService();
    public static void displayMenu(){
        boolean flag = true;
        do {
            System.out.println("Chức năng của hệ thống " +
                    "\n 1.Employee Management" +
                    "\n 2.Customer Management" +
                    "\n 3.Facility Management" +
                    "\n 4.Booking Management" +
                    "\n 5.Promotion Management " +
                    "\n 7.Exit");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Chọn chức năng");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Chọn chức năng +\n" +
                            " \"\\n 1.Display list employees\" +\n" +
                            " \"\\n 2.Add new employee\" +\n" +
                            " \"\\n 3.Edit employee\" +\n" +
                            " \"\\n 4.Return main menu\" +");
                    switch (choose) {
                        case 1:
                            System.out.println("Display list employees");
                            break;
                        case 2:
                            System.out.println("Add new employee");
                            break;
                        case 3:
                            System.out.println("Edit employee");
                            break;
                        case 4:
                            System.out.println("Return main menu");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Chọn chức năng +\n" +
                            " \"\\n 1.Display list customer\" +\n" +
                            " \"\\n 2.Add new customer\" +\n" +
                            " \"\\n 3.Edit employee\" +\n" +
                            " \"\\n 4.Return main menu\" +");
                    switch (choose) {
                        case 1:
                            System.out.println("Display list customer");
                            break;
                        case 2:
                            System.out.println("Add new customer");
                            break;
                        case 3:
                            System.out.println("Edit Customer");
                            break;
                        case 4:
                            System.out.println("Return main menu");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Chọn chức năng +\n" +
                            " \"\n 1.Display list facility\" +\n" +
                            " \"\n 2.Add new facility\" +\n" +
                            " \"\n 3.Display list facility maintenance\" +\n" +
                            " \"\n 4.Return main menu\" +");
                    switch (choose) {
                        case 1:
                            System.out.println("Display list customer");
                            break;
                        case 2:
                            System.out.println("Add new facility");
                            break;
                        case 3:
                            System.out.println("Display list facility maintenance");
                            break;
                        case 4:
                            System.out.println("Return main menu");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Chọn chức năng +\n" +
                            " \"\n 1.Add new booking\" +\n" +
                            " \"\n 2.Display list booking\" +\n" +
                            " \"\n 3.Create new contracts\" +\n" +
                            " \"\n 4.Display list contracts\" +\n" +
                            " \"\n 5.Edit contracts\" +\n" +
                            " \"\n 6.Return main menu ");
                    switch (choose) {
                        case 1:
                            System.out.println("Add new booking");
                            break;
                        case 2:
                            System.out.println("Display list booking");
                            break;
                        case 3:
                            System.out.println("Create new contracts");
                            break;
                        case 4:
                            System.out.println("Display list contracts");
                            break;
                        case 5:
                            System.out.println("Edit contracts");
                            break;
                        case 6:
                            System.out.println("Return main menu");
                            break;
                    }
                    break;
                case 5:
                    System.out.println("Chọn chức năng +\n" +
                            " \"\n 1.Display list customers use service" +
                            " \"\n 2.Display list customers get voucher" +
                            " \"\n 3.Display list facility maintenance" +
                            " \"\n 4.Return main menu" );
                    switch (choose) {
                        case 1:
                            System.out.println("Display list customers use service");
                            break;
                        case 2:
                            System.out.println("Add new facility");
                            break;
                        case 3:
                            System.out.println("Display list facility maintenance");
                            break;
                default:
                    flag = false;
            }
        } while (flag);
    }
}
