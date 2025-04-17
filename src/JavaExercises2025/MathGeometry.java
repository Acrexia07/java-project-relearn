package JavaExercises2025;

import  java.util.Scanner;

public class MathGeometry {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        //Initialization
        double radius;
        double circumference;
        double area;
        double volume;

        //Inputs for geometry calculation
        System.out.print("Enter radius: ");
        radius = scn.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI  * Math.pow(radius, 3);

        //Results
        System.out.println("The geometric calculation results of the Radius "+ radius + " is stated below:");
        System.out.printf("Circumference: %.2fm\n", circumference);
        System.out.printf("Area: %.2fm²\n", area);
        System.out.printf("Volume: %.2fm³\n", volume);

        scn.close();
    }


}
