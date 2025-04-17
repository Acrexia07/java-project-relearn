package JavaProjects_Beginner;

import java.util.Scanner;

//Note: This first project doesn't have validations for now - familiarization of syntaxes
public class CompoundInterestCalculator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        //Initialization
        double principal; // initial investment amount
        double annualInterestRate; // interest rate (in percentage)
        double compoundingFrequency; // times interest is compounded per year
        double years; // number of years the money is invested
        double finalAmount; //Total amount of compounded interest

        //Inputs
        principal = promptInterest(scn, "Enter principal amount: ");
        annualInterestRate = promptInterest(scn, "Enter the interest rate (in %): ");
        annualInterestRate /= 100;
        compoundingFrequency = promptInterest(scn, "Enter no. of times compounded per year: ");
        years = promptInterest(scn, "Enter no. of years: ");

        //Compound interest Calculation
        finalAmount = principal * (Math.pow((1 + (annualInterestRate / compoundingFrequency)),(compoundingFrequency *years)));

        //Results
        System.out.println(" ");
        System.out.println("The amount after " + years + " years is " + "$" + finalAmount);

        //Closing Scanner class
        scn.close();
    }

    public static double promptInterest (Scanner scn, String prompt){
        System.out.print(prompt);
        return scn.nextDouble();
    }
}
