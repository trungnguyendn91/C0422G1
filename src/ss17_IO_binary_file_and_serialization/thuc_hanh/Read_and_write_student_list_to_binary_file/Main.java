package ss17_IO_binary_file_and_serialization.thuc_hanh.Read_and_write_student_list_to_birary_file;

import java.io.*;
import java.util.*;

public class Main {
    public static void writeToFile(String path, List<Student> students) {
        /* tạo phương thức writeToObject(String path, List<Student> students)
         để ghi danh sách học viên hiện có vào trong file nhị phân*/
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*tạo phương thức main trong lớp Main và khai báo một danh sách học viên*/
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Huy", "DN"));
        students.add(new Student(2, "Đức", "QN"));
        students.add(new Student(3, "Vinh", "DN"));
        students.add(new Student(4, "Nhân", "DL"));
        /*Gọi phương thức writeToFile trong hàm main để ghi danh sách học viên trên ra
         file có tên là student.txt*/
        writeToFile("src/ss17_IO_binary_file_and_serialization/thuc_hanh/Read_and_write_student_list_to_birary_file/student.txt", students);
        /*Gọi phương thức readDataFromFile trong hàm main
        và hiển thị danh sách các học viên đang có trong file*/
        List<Student> studentDataFromFile = readDataFromFile("src/ss17_IO_binary_file_and_serialization/thuc_hanh/Read_and_write_student_list_to_birary_file/student.txt");
        for (Student student : studentDataFromFile) {
            System.out.println(student);
        }
    }
    /*Tạo phương thức readDataFromFile(String path)
     trong lớp Main để lấy ra danh sách học viên đang có trong file student.txt*/
    public static List<Student> readDataFromFile(String path){
        List<Student>students = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return students;
    }

}

