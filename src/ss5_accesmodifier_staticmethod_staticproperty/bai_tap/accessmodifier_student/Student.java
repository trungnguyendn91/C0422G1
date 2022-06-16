package ss5_accesmodifier_staticmethod_staticproperty.bai_tap.accessmodifier_student;

public class Student {
    private String name = "John";
    private String classes ="C02";
    public Student(){
    }

    public Student(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student:" +
                "name='" + name + '\'' +
                ", classes='" + classes ;
    }
}
