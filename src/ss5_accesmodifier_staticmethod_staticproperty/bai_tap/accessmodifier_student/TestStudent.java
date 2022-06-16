package ss5_accesmodifier_staticmethod_staticproperty.bai_tap.accessmodifier_student;

public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student student2 = new Student();
        s1.setName("Nhân");
        s1.setClasses("C04");
        System.out.println(s1);
    }
}
