package JavaExercises2025;

import java.util.Random;

//Note: Brutal Code for relearning purposes
public class RandomGenerator {
    public static void main(String[] args){
        Random rnd  = new Random();

        boolean isHead;
        int rndIntNum;
        double rndDoubleNum;

        rndIntNum = rnd.nextInt(1, 7);
        isHead = rnd.nextBoolean();
        rndDoubleNum = rnd.nextDouble();

        System.out.println("Random Coin Flip: " + (isHead ? "Heads!" : "Tails!"));
        System.out.println("Random Integer Number: " + rndIntNum);
        System.out.printf("Random Double Number: %.2f", rndDoubleNum);
    }


}
