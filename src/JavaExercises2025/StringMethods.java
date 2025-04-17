package JavaExercises2025;

public class StringMethods {
    public static void main(String[] args) {

        String name = "Password";

//        int length = name.length();
//        char letter = name.charAt(11);
//        int firstIndex = name.indexOf("u");
//        int lastIndex = name.lastIndexOf("u");

        //name =  name.toLowerCase();
        //name =  name.toUpperCase();
        //name = name.trim();
        //name = name.replace("e", "u");

        //System.out.println(name);

        //isEmpty method

        /*
        if(name.isEmpty()){
            System.out.println("Your name is empty!");
        }
        else {
            System.out.println(name);
        }

        if(name.contains(" ")){
            System.out.println("Your name contains spaces.");
        }
        else {
            System.out.println("Your name doesn't contain spaces");
        }
         */
        if(name.equalsIgnoreCase("password")){
            System.out.println("Your name can't be password");
        }
        else{
            System.out.println("Hello " + name);
        }
    }
}
