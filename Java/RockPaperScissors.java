package rockpaperscissors;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        String playerChoice = scanner.next();

        if (playerChoice.equals("rock")) {
            System.out.println("Sorry, but the computer chose paper");
        } else if (playerChoice.equals("paper")) {
            System.out.println("Sorry, but the computer chose scissors");
        } else {
            System.out.println("Sorry, but the computer chose rock");
        }
        scanner.close();
    }
}
