package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberComputer = random.nextInt(100);
        System.out.println("Guess the number from 0 to 99");

        int numberUser;
        int numberTrials = 0;
        int numberTrials2 = 5;
        do {
            numberTrials++;
            numberTrials2--;
            System.out.print("Enter number: ");
            numberUser = scanner.nextInt();

            if (numberUser < numberComputer) {
                System.out.println("Your number is GREATER than the one you are trying to guess. You have " + numberTrials2 + " more tries.");
        }   else if (numberUser > numberComputer) {
                System.out.println("Your number is LOWER than the one you are trying to guess. You have " + numberTrials2 + " more tries.");
            } else {
                System.out.println("You guessed it!");
            }
        } while (numberTrials < 5); System.out.println("Sorry you didn't guess the number, the answer was: " + numberComputer);

    }


}

