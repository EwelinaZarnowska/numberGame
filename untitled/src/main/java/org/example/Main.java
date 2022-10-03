package org.example;
 
import java.util.Random;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        System.out.println(game());
    }
 
    public static String game() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        System.out.println("Guess the number from 0 to 99");
        for (int i = 5; i > 0; i--) {
            int tires = i - 1;
            int userGuess = scanner.nextInt();
            if (randomNumber == userGuess) {
                return "You guessed it";
            } else if (randomNumber > userGuess) {
                System.out.println("Your number is GREATER than the one you are trying to guess");
                System.out.println("You have " + tires + " more tries.");
                if (tires > 0) {
                    System.out.println("Please try again");
                }
 
            } else {
                System.out.println("Your number is LOWER than the one you are trying to guess");
                System.out.println("You have " + tires + " more tries.");
                if (tires > 0) {
                    System.out.println("Please try again");
                }
            }
        }
        return "Sorry you didn't guess the number, the answer was: " + randomNumber;
    }
}
