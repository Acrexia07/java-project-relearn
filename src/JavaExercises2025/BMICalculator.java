package JavaExercises2025;

import  java.util.Scanner;

//Note: Brutal Code for relearning purposes
public class BMICalculator {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);

        //initialization
        String fullName;
        int age;
        double height = 0;
        double weight = 0;
        double bmiResult = 0;

        //Personal Information - Demographic
        System.out.print("Enter your name: ");
        fullName = scanner.nextLine();
        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        //Personal Information - BMI inputs
        System.out.print("Enter your weight (kg): ");
        weight = scanner.nextDouble();
        System.out.print("Enter your height (m): ");
        height = scanner.nextDouble();

        //Processing
        bmiResult = weight / (height * height); //calculate BMI

        //Outputs
        System.out.println(" ");
        System.out.println("Name: "+ fullName);
        System.out.println("Age: " + age);
        System.out.printf("BMI result: %.2f kg/m²", bmiResult); //BMI result formatted

        //Closing the scanner object
        scanner.close();
    }
}
