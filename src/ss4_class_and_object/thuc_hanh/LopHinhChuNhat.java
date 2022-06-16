package ss4_class_and_object.thuc_hanh;

import java.awt.*;
import java.util.Scanner;

class Rectangle {
    /*Tạo lớp Rectangle, khai báo các thuộc tính (properties),
     định nghĩa các phương thức khởi tạo (contructors).*/
     double width , height;
     public Rectangle() {
     }
     public Rectangle(double width,double height){
             this.width= width;
             this.height = height;
         }
/*Định nghĩa các phương thức getArea(), getPerimeter(), display()*/
    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height)*2;
    }
    public String display() {
        return "width=" + width + ", height=" + height;
    }
/*Tạo class Main chứa phương thức main để thực thi chương trình*/
public static void main(String[] args) {
    /*Khai báo các biến lưu kích thước hình chữ nhật và gán giá trị*/
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter width: ");
    double width = scanner.nextDouble();
    System.out.print("Enter height: ");
    double height = scanner.nextDouble();
    /*Khởi tạo một đối tượng thuộc lớp Rectangle
    với phương thức khởi tạo chứa 2 tham số width, height*/
    Rectangle rectangle = new Rectangle(height,width);
    /*Gọi các phương thức của lớp Rectangle
    thông qua đối tượng rectangle đã tạo để hiển thị các thông số của hình chữ nhậ*/
    System.out.println("Hình chử nhật: " + rectangle.display() );
    System.out.println("Diện tích hình chử nhật: " + rectangle.getArea());
    System.out.println("Chu vi hình chử nhật: " + rectangle.getPerimeter());
}

}

