package novi.higherlower;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class HigherLowerGame {

    private Scanner inputScanner;
    private boolean gameIsRunning;

    public HigherLowerGame(Scanner inputScanner) {
        this.inputScanner = inputScanner;
    }

    public void playGame() {
        gameIsRunning = true;
        int maxNumber = 100;
        int minNumber = 0;

        // Here you should generate the number to guess

        Random numberToGuess = new Random();
        int theNumber = numberToGuess.nextInt(maxNumber);
//        System.out.println("The random number is " + theNumber);

        // Het zetten van het aantal gespeelde beurten op 0

        int numberOfGamesPlayed = minNumber;

        // Start

        while (gameIsRunning) {

            numberOfGamesPlayed++;

            System.out.println("Make a guess");

            try {

                var input = inputScanner.nextLine();
                System.out.printf("You typed: %s\n", input);
                int inputInt = Integer.parseInt(input);

                // Read if the input is between the 0 or 100
                if (inputInt < minNumber || inputInt > maxNumber) {
                    System.out.println("You did not enter a number between 0 and 100");
                    continue;

                } else {

                    // Check if the guess is correct, if so end the game
                    if (inputInt < theNumber) {
                        System.out.println("Your choosen input is lower then the number you are looking for");
                    } else if (inputInt > theNumber) {
                        System.out.println("Your choosen input is higher then the number you are looking for");
                    } else if (inputInt == theNumber) {
                        System.out.println("You are a winner!");
                        System.out.println("You needed " + numberOfGamesPlayed + " times to guess the correct number!");
                        System.out.println("The game will end. Goodbye.");
                        gameIsRunning = false;
                    } else {
                        System.out.println("Something went wrong");
                    }
                }

            } catch (NumberFormatException a) {
                System.out.println("You have not entered a number or whole number");


            }
        }
    }
}



