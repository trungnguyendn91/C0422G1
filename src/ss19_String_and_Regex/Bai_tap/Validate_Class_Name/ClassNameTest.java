package ss19_String_and_Regex.Bai_tap.Validate_Account;

public class ClassNameTest {
    private static ClassNameExample classNameExample;
    public static final String[] validClassName = new String[]{"123abc_", "_abc123", "______", "123456","abcdefgh"};
    public static final String[] invalidClassName = new String[]{".@", "12345", "1234_", "abcde"};

    public static void main(String[] args) {
        classNameExample= new ClassNameExample();
        for (String className: validClassName) {
            boolean isValid = classNameExample.validate(className);
            System.out.println("Class Name is: " + className + " is valid "+ isValid);
        }
        for (String className:invalidClassName) {
            boolean isValid = classNameExample.validate(className);
            System.out.println("Class Name is: " + className + " is valid "+ isValid);
        }
    }
}
