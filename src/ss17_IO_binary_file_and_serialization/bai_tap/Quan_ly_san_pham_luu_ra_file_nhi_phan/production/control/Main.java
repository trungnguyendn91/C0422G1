package ss12_collection_frame.bai_tap.production.control;

import ss12_collection_frame.bai_tap.production.service.ProductService;

import java.util.Scanner;

public class Main {

        private static ProductService productService = new ProductService();

        public static void displayMainMenu() {
            boolean flag = true;
            do {
                System.out.println("Chức năng của hệ thống " +
                        "\n 1.Add" +
                        "\n 2.Edit" +
                        "\n 3.Delete" +
                        "\n 4.Display" +
                        "\n 5.SearchName" +
                        "\n 6.SortCost" +
                        "\n 7. Exit");
                Scanner scanner = new Scanner(System.in);
                System.out.println("Chọn chức năng");
                int choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        System.out.println("chức năng thêm sản phẩm:" + "\n" +
                                "1: Thêm xe mô tô" + "\n"+
                                "2: Thêm xe tải" + "\n" +
                                "3: Thêm xe ô tô");
                        switch (choose) {
                            case 1:
                                System.out.println("Thêm xe moto");
                                productService.add();
                                break;
                            case 2:
                                System.out.println("Thêm xe tải");
                                break;
                            case 3:
                                System.out.println("Thêm xe ô tô");
                                break;
                        }

                        break;
                    case 2:
                        System.out.println("Chức năng sửa thông tin sản phẩm theo id");
                        productService.edit();
                        break;
                    case 3:
                        System.out.println("Chức năng xoá sản phẩm theo id");
                        productService.delete();
                        break;
                    case 4:
                        System.out.println("chức năng hiển thị danh sách sản phẩm");
                        productService.display();
                        break;
                    case 5:
                        System.out.println("chức năng tìm kiếm sản phẩm theo tên");
                        System.out.println(" nhap ten can tim ");
                        String name = scanner.nextLine();
                        productService.searchByName(name);
                        break;
                    case 6:
                        System.out.println("chức năng sắp xếp sản phẩm tăng dần, giảm dần theo giá");
                        productService.sort();
                        break;
                    default:
                        flag = false;
                }
            } while (flag);
        }
    }

