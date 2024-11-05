package assignment5;

import java.util.Scanner;
import java.util.Random;

public class NumberGuess {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int num = rand.nextInt(50) + 1;

        System.out.println("Guess a number between 1 to 50");

        int guess = 0;
        while (guess != num) {
            System.out.print("Enter your number: ");
            guess = sc.nextInt();

            if (guess < num) {
                System.out.println("Your number is lower");
            } else if (guess > num) {
                System.out.println("Your number is higher");
            } else {
                System.out.println("Correct Number!");
            }
        }
    }
}
