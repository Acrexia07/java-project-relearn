package JavaExercises2025;

import java.util.Scanner;
public class Practiceprintf {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        //Initialization
        String name = "Mirae";
        char firstLetter = 'M';
        int age = 25;
        double height = 166.0;
        boolean isEmployed = true;

        //Take Note: The format of printf is %[flags][width][.precision][specifier-character]

        //About  specifier-character
        System.out.println("About [specifier-character]:");
        System.out.printf("Hello %s.\n", name);
        System.out.printf("The first letter of your name is %c.\n", firstLetter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("You are %.2f centimeters tall\n", height);
        System.out.printf("Employed: %b\n", isEmployed);
        System.out.println(" ");
        System.out.println("printf combinations:");
        System.out.printf("%s is %d years old and she is %.2f cm tall.\n",name ,age ,height);

        //About [.precision]

        // + = value with printf format has a plus
        // , =  comma grouping separator
        // ( = negative numbers are enclosed with ()
        // space = display a minus if negative, space if positive

        double price1 = 9.99;
        double price2 = 100.15;
        double price3 = -54.01;

        System.out.println(" ");
        System.out.println("About [.precision]:");
        System.out.printf("Positive numbers are treated like this:% .2f\n", price1);
        System.out.printf("Positive numbers are treated like this:% .2f\n", price2);
        System.out.printf("Negative number are treated like this:%( .2f\n", price3);


        //About [width]

        // 0 = padding
        // number = right justified padding
        // negative number = left justified padding

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.println(" ");
        System.out.println("About [width]:");
        System.out.printf("%04d\n", id1);
        System.out.printf("%04d\n", id2);
        System.out.printf("%04d\n", id3);
        System.out.printf("%04d\n", id4);
        System.out.println(" ");
        System.out.println("About [width] without padding just spaces only: ");
        System.out.printf("%4d\n", id1);
        System.out.printf("%4d\n", id2);
        System.out.printf("%4d\n", id3);
        System.out.printf("%4d\n", id4);

        scn.close();
    }
}
