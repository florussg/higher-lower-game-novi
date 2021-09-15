package novi;

import novi.higherlower.HigherLowerGame;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        HigherLowerGame game = new HigherLowerGame(inputScanner);

        game.playGame();
    }
}
