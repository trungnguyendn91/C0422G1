package ss5_accesmodifier_staticmethod_staticproperty.thuc_hanh;

public class StaticMethod {
    public static class Student{
        private int rollno;
        private String name;
        private static String college= "BBDIT";
        //constructor to initialize the variable
        Student(int r, String n){
            rollno = r;
            name = n;
        }
        //static method to change the value of static variable
        static void change (){
            college = "CODEGYM";
        }
        //method to display values
        void display(){
            System.out.println(rollno + " " + name + " " + college);
        }
    }
    //Xây dựng lớp TestStaticMethod,
    // trong lớp này sẽ gọi đến phương thức static thông qua lớp.
    public static class TestStaticMethod{
        public static void main(String[] args) {
            Student.change();//calling change method
            //creating object
            Student s1 = new Student(111, "Hoàng");
            Student s2 = new Student(222, "Vinh");
            Student s3 = new Student(123, "Nhân");
            //Calling display method.
            s1.display();
            s2.display();
            s3.display();
        }
    }
}
