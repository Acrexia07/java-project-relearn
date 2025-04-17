package JavaProject_Beginner_Others;
//Note: Most of the Core principles aren't applied in this program. Relearning in progress...

import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Initialization
        double weight;
        double height;
        double resultBMI;
        boolean isValidInputs;

        // Input Process
        weight = enterBMI(scn, "Enter weight (kg): ");
        height = enterBMI(scn, "Enter height (m): ");
        isValidInputs = weight >= 0 && height >= 0;

        //Process - BMI Calculation
        if (weight == 0 || height == 0){
            System.out.println("Invalid Input: Input must not contain any zero! Please try again.");
        }
        else if (!isValidInputs) {
            System.out.println("Invalid inputs: Input must not contain any negative numbers! Please try again.");
        } else {
            resultBMI = weight / Math.pow(height, 2);
            System.out.printf("\nYour BMI result is %.2f kg/m²\n", resultBMI);
            if ( resultBMI > 30.0 ) {
                System.out.println("You are in the obese category");
            }
            else if ( resultBMI < 29.9 && resultBMI >= 25 ) {
                System.out.println("You are in the over weight category");
            }
            else if ( resultBMI < 24.9 && resultBMI >= 18.5 ) {
                System.out.println("You are in the normal weight category");
            }
            else if ( resultBMI < 18.5 ) {
                System.out.println("You are in the under weight category");
            }
        }

        // Closing
        scn.close();
    }
    public static double enterBMI (Scanner scn, String prompt){
        System.out.print(prompt);
        return scn.nextDouble();
    }
}
