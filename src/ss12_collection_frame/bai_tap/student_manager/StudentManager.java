package ss5_accesmodifier_staticmethod_staticproperty.bai_tap.student_manager;

import java.util.Scanner;

public class StudentManager {
    Scanner scanner = new Scanner(System.in);
    static Student[] students = new Student[20];

    static {
        students[0] = new Student(1, "Trung", "QN", true, "chanhtv");
        students[1] = new Student(2, "Chanh", "QN", true, "chanhtv");
        students[2] = new Student(3, "Nhân", "QN", true, "chanhtv");
    }

    // CRUD
    public void display() {
        for (Student s : students) {
            if (s != null) {
                System.out.println(s);
            } else {
                continue;
            }

        }
    }

    public void add() {
        System.out.print("nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("nhập địa chỉ: ");
        String address = scanner.nextLine();
        System.out.print("nhập giới tính: ");
        boolean gender = Boolean.parseBoolean(scanner.nextLine());
        System.out.print("nhập email: ");
        String email = scanner.nextLine();
        Student student = new Student(id, name, address, gender, email);
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            }
        }
        display();
    }

    public void delete() {
    /*    Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vị trí muốn xóa");
        int value = scanner.nextInt();
        int index = 0;
        for (int i = 0; i < students.length; i++) {
            if (i == (value - 1)) {
                index = i;
            }
             for (int i = index; i < (students.length - 1); i++) {
            students[i] = students[i + 1];
        }*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên học sinh muốn xóa: ");
        String findName = scanner.nextLine();
        for (int i = 0; i < students.length; i++) {
            if(students[i] != null) {
                if (students[i].getName().equals(findName)) {
                    students[i] = null;
                }
            }
        /*    if (students[i]==null){
                students[i]= students [i+1];
                students[i+1]= null;
            }*/
        }
        display();
    }

    public void search() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên học sinh muốn tìm: ");
        String findName = scanner.nextLine();
        int index = -1;
        for (int i = 0; i < students.length; i++) {
            if (students[i]!= null){
                if (students[i].getName().equals(findName)) {
                    index = i;
                    System.out.println( students[i]);
                }
            }
        }
        if (index!= -1){
            System.out.println("Không tìm thấy");
        }
    }

    public void edit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên học sinh muốn sửa: ");
        String findName = scanner.nextLine();
        int index = -1;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getName().equals(findName)) {
                index = i;
                break;
            }
        }
        if (index!= -1){
            System.out.println("Không tìm thấy");
        }
        System.out.print("nhập lại id: ");
        students[index].setId(Integer.parseInt(scanner.nextLine()));
        System.out.print("nhập lại tên: ");
        students[index].setName(scanner.nextLine());
        System.out.print("nhập lại địa chỉ: ");
        students[index].setAddress(scanner.nextLine());
        System.out.print("nhập lại giới tính: ");
        students[index].setGender(Boolean.parseBoolean(scanner.nextLine()));
        System.out.print("nhập lại email ");
        students[index].setEmail(scanner.nextLine());
        display();

    }

}
