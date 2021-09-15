package novi;

import novi.higherlower.HigherLowerGame;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        HigherLowerGame game = new HigherLowerGame(inputScanner);

        System.out.println("Welcome to the higher and lower game");


        game.playGame();
    }
}
