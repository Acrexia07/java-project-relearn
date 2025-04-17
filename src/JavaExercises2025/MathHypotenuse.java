package JavaExercises2025;

import java.util.Scanner;

public class MathHypotenuse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        double a,b,c;

        a = computeHypotenuse(scn, "Enter value for side A: ");
        b = computeHypotenuse(scn, "Enter value for side B: ");

        //Calculate Hypotenuse
        c = Math.round(Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));

        System.out.printf("The hypotenuse of side A(%.2f) and side B(%.2f) is %.2fcm", a, b, c);

        scn.close();
    }
    public static double computeHypotenuse(Scanner scn, String prompt){
        System.out.print(prompt);
        return scn.nextDouble();
    }

}
