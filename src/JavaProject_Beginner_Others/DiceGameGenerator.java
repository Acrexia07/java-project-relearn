package JavaProject_Beginner_Others;
//Note: Most of the Core principles aren't applied in this program. Relearning in progress...

import java.util.Random;

public class DiceGameGenerator {
    public static void main(String[] args) {
        Random rnd = new Random();

        // Initialization: Variable declaration
        int dice1;
        int dice2;
        int totalDice;

        //Initialization - Initial Display
        System.out.println("Welcome to the Dice Game!");

        //Process - randomization
        dice1 = randomDice(rnd);
        dice2 = randomDice(rnd);
        totalDice = dice1 + dice2;

        //Output - Random generated dice number
        System.out.println("Random First Dice: " + dice1);
        System.out.println("Random Second Dice: " + dice2);

        if (totalDice == 7  || totalDice == 11){
            System.out.printf("Your total dice is %d. You are super Lucky! 😎👌", totalDice);
        }
        else if (dice1 == dice2) {
            System.out.println("Woah 😮. It's a double! Nice 😍🙌");
        } else {
            System.out.printf("Your total dice is %d.", totalDice);
        }
    }

    public static int randomDice (Random rnd) {
        return rnd.nextInt(1, 7);
    }
}
