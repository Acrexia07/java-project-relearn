package JavaExercises2025;

import java.util.Scanner;

//Note: Brutal Code for relearning purposes
public class MadLibsPrompt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Initialization
        String name;
        String animal;
        String place;
        String noun;
        String adjective1, adjective2;
        String verb1, verb2;
        String soundFunny;
        int number;

        // Inputs
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("Enter an animal: ");
        animal = scanner.nextLine();
        System.out.print("Enter a place: ");
        place  = scanner.nextLine();
        System.out.print("Enter a plural noun: ");
        noun  = scanner.nextLine();
        System.out.print("Enter an adjective (description): ");
        adjective1  = scanner.nextLine();
        System.out.print("Enter another adjective (description): ");
        adjective2  = scanner.nextLine();
        System.out.print("Enter a verb in -ing form (action): ");
        verb1  = scanner.nextLine();
        System.out.print("Enter another verb in -ing form (action): ");
        verb2  = scanner.nextLine();
        System.out.print("Enter an onomatopoeia (funny sound): ");
        soundFunny  = scanner.nextLine();
        System.out.print("Enter a number: ");
        number  = scanner.nextInt();

        //Mad Libs prompt of the day!
        System.out.println("Today, " + name + " went to the park and saw a really " + adjective1 + " " + animal +" trying to " + verb1 + " near the " + place + ".");
        System.out.println("Out of nowhere, " + name + " counted " + number + " " + noun + " flying in the sky!");
        System.out.println("It was the most "+ adjective2 + " thing ever.");
        System.out.println("So " + name + " decided to " + verb2 + " while shouting"  + " ' " + soundFunny + " '! " );
        scanner.close();
    }
}
