package JavaProject_Beginner_Others;
//Note: Most of the Core principles aren't applied in this program. Relearning in progress...

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    // Initialization
    double firstNumber;
    double secondNumber;
    double operationResult;
    String choiceOperation = " ";

    firstNumber = enterNumbers(scn, "Enter first number: ");
    secondNumber = enterNumbers(scn, "Enter second number: ");

    System.out.print("Choose an operation (+, -, *, /): ");
    choiceOperation = scn.next();
    boolean isValidLength = choiceOperation.length() == 1;

    // Input validation - Operators
    if(isValidLength && choiceOperation.equals("+")) {
        operationResult = firstNumber + secondNumber;
        System.out.println("\nOperation: Addition");
        System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is " + operationResult);
    }
    else if (isValidLength && choiceOperation.equals("-")){
        operationResult = firstNumber - secondNumber;
        System.out.println("\nOperation: Subtraction");
        System.out.println("The difference of " + firstNumber + " and " + secondNumber + " is " + operationResult);
    }
    else if (isValidLength && choiceOperation.equals("*")){
        operationResult = firstNumber * secondNumber;
        System.out.println("\nOperation: Multiplication");
        System.out.println("The product of " + firstNumber + " and " + secondNumber + " is " + operationResult);
    }
    else if (isValidLength && choiceOperation.equals("/")){
        if (firstNumber == 0){
            System.out.println("Invalid input: Cannot be divided by zero! Please try again");
        } else if (secondNumber == 0) {
            System.out.println("Syntax Error: The output result is infinity! Please try again");
        } else {
            operationResult = firstNumber / secondNumber;
            System.out.println("\nOperation: Division");
            System.out.println("The quotient of " + firstNumber + " and " + secondNumber + " is " + operationResult);
        }
    }
    else {
        System.out.println("Invalid input: Only one character is allowed for the operation choice. Try again.");
    }

    //Closing
    scn.close();
    }
    public static double enterNumbers (Scanner scn, String prompt){
        System.out.print(prompt);
        return scn.nextDouble();
    }
}
