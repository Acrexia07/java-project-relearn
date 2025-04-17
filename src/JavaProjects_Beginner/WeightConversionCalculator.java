    package JavaProjects_Beginner;

    import java.util.Scanner;
    //Note: Most are Brutal Code for relearning purposes - for familiarities with IFs statements
    public class WeightConversionCalculator {
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);

            // Initialization - Declaration of variables
            double initialWeight;
            double convertedWeight;
            int choice;

            // Initialization - Initial Display
            System.out.println("Weight Conversion Program");
            System.out.println("1: Convert (lbs) to (kgs)");
            System.out.println("2: Convert (kgs) to (lbs)");

            // Input and Output Process
            System.out.print("\nEnter your choice: ");
            choice = scn.nextInt();
            if (choice == 1){

                System.out.println("\nWeight conversion - (lbs) to (kgs)");
                initialWeight = enterWeight(scn, "Enter the weight in lbs: ");
                convertedWeight = initialWeight * 0.453592;
                System.out.printf("The converted weight of %.2flbs in kgs is %.2f", initialWeight , convertedWeight);

            }
            else if (choice == 2) {

                System.out.println("\nWeight conversion - (kgs) to (lbs)");
                initialWeight = enterWeight(scn, "Enter the weight in kgs: ");
                convertedWeight = initialWeight * 2.20462;
                System.out.printf("The converted weight of %.2fkgs in lbs is %.2f", initialWeight , convertedWeight);

            }
            else {
                System.out.println("Incorrect Choice input");
            }
            scn.close();
        }
        public static double enterWeight(Scanner scn, String prompt){
            System.out.print(prompt);
            return  scn.nextDouble();
        }
    }
