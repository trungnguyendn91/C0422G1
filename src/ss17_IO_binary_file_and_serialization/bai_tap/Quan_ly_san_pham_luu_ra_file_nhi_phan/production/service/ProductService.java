package ss12_collection_frame.bai_tap.production.service;

import ss12_collection_frame.bai_tap.production.model.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ProductService implements IService {
    Scanner scanner = new Scanner(System.in);
    private static final ArrayList<Product> productArrayList = new ArrayList<Product>();

    static {
        productArrayList.add(new Product(1, "Coca", 2000));
        productArrayList.add(new Product(5, "Sữa chua", 5000));
        productArrayList.add(new Product(3, "Vina mik", 4000));
        productArrayList.add(new Product(8, "Hảo Hảo", 1000));
        productArrayList.add(new Product(2, "Pepsi", 2000));

    }

    @Override
    public void display() {
        for (Object s : productArrayList) {
            System.out.println(s);
        }
    }

    @Override
    public void add() {
        System.out.println("nhập id san pham");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên sang pham");
        String name = scanner.nextLine();
        System.out.println("nhập gia san pham");
        int gia = Integer.parseInt(scanner.nextLine());
        Product product = new Product(id, name, gia);
        // them mới dùng add()
        productArrayList.add(product);
        display();
    }

    @Override
    public void edit() {
        display();
        System.out.println(" chon san pham can sua ");
        int edit = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productArrayList.size(); i++) {
            if (edit == productArrayList.get(i).getId()) {
                System.out.println("nhập id san pham");
                productArrayList.get(i).setId(Integer.parseInt(scanner.nextLine()));
                System.out.println("nhập tên sang pham");
                productArrayList.get(i).setName(scanner.nextLine());
                System.out.println("nhập gia san pham");
                productArrayList.get(i).setCost(Integer.parseInt(scanner.nextLine()));
                break;
            }
        }
        display();
    }

    @Override
    public void delete() {
        display();
        System.out.println(" nhap san pham can xoa");
        int delete = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productArrayList.size(); i++) {
            if (delete == productArrayList.get(i).getId()) {
                productArrayList.remove(i);
                break;
            }
        }
        display();
    }

    @Override
    public void searchByName(String name) {
        int count = 0;
        for (int i = 0; i < productArrayList.size(); i++) {
            if (name.equals(productArrayList.get(i).getName())) {
                System.out.println(" ten can tim la " + productArrayList.get(i));
                break;
            } else {
                count++;
            }
        }
        if (count > 0)
            System.out.println(" ten cua ban tim ko co");
    }

    @Override
    public void sort() {
        display();
        System.out.println("-------------------------------------------");
        productArrayList.sort(Comparator.comparing(Product::getCost));
        display();
    }
}



