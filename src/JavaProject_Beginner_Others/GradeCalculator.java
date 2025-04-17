package JavaProject_Beginner_Others;
//Note: Most of the Core principles aren't applied in this program. Relearning in progress...
//Concerns: Need to apply try-catch for type mismatch. Relearning it later 😊

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Initialization
        String validateInput_isStudent;
        String studentName;
        String validateInput_Grade;
        double valueGrade;
        boolean isStudent;

        // Initialization - initial display
        System.out.println("Welcome to the Grade Evaluator!\n");

        //Input process
        //Validation: String input verification
        validateInput_isStudent = enterInput(scn, "Are you a student? (true/false): ");
        if(validateInput_isStudent.equalsIgnoreCase("true") || validateInput_isStudent.equalsIgnoreCase("false")){
            isStudent = Boolean.parseBoolean(validateInput_isStudent);

            //Validation: Student input verification
            if(isStudent) {
                studentName = enterInput(scn, "Enter your name:");

                System.out.printf("Hello %s. What is your school grade (0-100)?\n", studentName);

                //Validation: Grade input verification
                validateInput_Grade = enterInput(scn, "Grade: ");

                if(validateInput_Grade.contains("-")){
                    System.out.println("Invalid Input: Grade should not contain negative numbers! Please try again.");
                }
                else {
                    //Validation: Grade classification
                    valueGrade = Double.parseDouble(validateInput_Grade);
                    if(valueGrade >= 0 && valueGrade < 101) {
                        if(valueGrade >= 90 && valueGrade <= 100){
                            System.out.printf("Grade A: Excellent Job %s! Continue maintaining it 😍🙌", studentName);
                        }
                        else if (valueGrade >= 80 && valueGrade <= 89  ) {
                            System.out.printf("Grade B: Great Job %s! Keep it up 😎👌", studentName);
                        }
                        else if (valueGrade >= 70 && valueGrade <= 79  ) {
                            System.out.printf("Grade C: Great Job %s! Keep it up 😎👌", studentName);
                        }
                        else if (valueGrade >= 60 && valueGrade <= 69  ) {
                            System.out.printf("Grade D: You can do better %s 💪 Please review your notes, okay?👌", studentName);
                        }
                        else if (valueGrade <= 59  ) {
                            System.out.println("Grade F: Seek help from your teacher or your tutor. 😊");
                        }
                    }
                    else {
                        System.out.println("Invalid Input: Out of range! Please try again.");
                    }
                }
            }
            else {
                System.out.println("You are not a student. Closing the program...");
            }
        }
        else {
            System.out.println("Invalid Input: Enter the valid choice! Please try again");
        }
        scn.close();
    }
    public static String enterInput(Scanner scn, String prompt){
        System.out.print(prompt);
        return scn.nextLine();
    }
}
