package JavaExercises2025;

public class NestedIfsDiscounts {
    public static void main(String[] args) {

        //Initialization
        boolean isStudent = false;
        boolean isSenior = false;
        double price =  9.99;

        if(isStudent){
            if(isSenior){
                System.out.println("You are a student. You will be discounted with 10% from your fee.");
                System.out.println("You are also a senior. You will be discounted with an additional of 20% from your fee.");
                price *= 0.7;
            }
            else {
                System.out.println("You are only a student and not a senior. You will only be discounted with 10% from your fee.");
                price *= 0.9;
            }
        }
        else {
            if(isSenior){
                System.out.println("You are only a senior and not a student. You will only be discounted with 20% from your fee.");
                price *= 0.8;
            } else {
                System.out.println("You are not a student nor a senior. You will not receive any discounts from your fee");
                price *= 1;
            }
        }

        System.out.printf("Your total fee is: $%.2f", price);
    }
}
