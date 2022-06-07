package ss1.thuc_hanh;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.print("Enter your weight (kilogram): ");
        weight = scanner.nextDouble();
        System.out.print("Enter your height (meter): ");
        height = scanner.nextDouble();
        bmi = weight / Math.pow(height,2);
        System.out.printf("%-20%s", bmi, "Interpretation\n");
        if (bmi <18 ){
            System.out.printf("%-20.2f%s", bmi, "Underweight ");
        }else if (bmi<25.0){
            System.out.printf("%-20.2f%s", bmi , "Normal");
        }else if (bmi <30){
            System.out.printf("%-20.2f%s", bmi ,"Overweight");
        }else {
            System.out.printf("%-20.2f%s", bmi ,"Obese");
        }
    }
}
