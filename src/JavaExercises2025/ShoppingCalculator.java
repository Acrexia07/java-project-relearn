package JavaExercises2025;

import java.util.Scanner;

//Note: Brutal Code for relearning purposes
public class ShoppingCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Initialization
        String itemName;
        int itemQuantity;
        double itemPrice;
        double totalPrice;

        //Shopping Cart - Inputs
        System.out.println(" ");
        System.out.print("Select an item that you like to buy: ");
        itemName = scanner.nextLine();
        System.out.print("What is the price for each?: ");
        itemPrice = scanner.nextDouble();
        System.out.print("How much?: ");
        itemQuantity = scanner.nextInt();

        //Cost calculation
        totalPrice = itemPrice * itemQuantity;

        //Shopping Cart - Result
        System.out.println(" ");
        System.out.println("You have bought " + itemQuantity + " " + itemName +"/s.");
        System.out.printf("Your total is $%.2f.", totalPrice);
        System.out.println("\nHave a nice day :)");

        //closing Scanner class
        scanner.close();
    }
}
