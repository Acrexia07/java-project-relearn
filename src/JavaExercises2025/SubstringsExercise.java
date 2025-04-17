package JavaExercises2025;

import java.util.Scanner;

public class SubstringsExercise {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        //Initialization
        String email;
        String username;
        String domain;


        // .substring method =  is used to EXTRACT PORTION OF A STRING
        //                                  substring format: .substring(start, end)
        System.out.print("Enter your email: ");
        email = scn.nextLine();

        if (email.contains("@")){
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@") +1);

            System.out.println("Username: " + username);
            System.out.println("Domain: " + domain);
        }
        else {
            System.out.println("Email must contain '@'. Please try again!");
        }
        scn.close();
    }
}
