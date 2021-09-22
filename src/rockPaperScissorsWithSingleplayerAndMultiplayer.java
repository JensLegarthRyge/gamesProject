import java.util.Random;
import java.util.Scanner;

public class rockPaperScissorsWithSingleplayerAndMultiplayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] playerNames = new String[3];
        playerNames[2] = "draw";

        warmWelcome();

        System.out.println("Would you like to play Multiplayer or Singleplayer?");
        String singleOrMulti = scanner.nextLine();

        if (singleOrMulti.equalsIgnoreCase("multiplayer")) {

            System.out.println("Player one, please input your name below:");
            playerNames[0] = scanner.nextLine();
            System.out.println("Player two, please input your name below:");
            playerNames[1] = scanner.nextLine();

            int scoreCountP0 = 0;
            int scoreCountP1 = 0;
            int roundCount = 1;

            System.out.println("How many games would you like to play?");
            int roundsPreferred = 1;
            roundsPreferred = +scanner.nextInt();

            while (roundCount < roundsPreferred) {
                System.out.println("Round " + roundCount + "!");
                roundCount++;
                System.out.println(playerNames[0] + " take your pick! (Rock, Paper or Scissors)");
                String playerOnePick = scanner.nextLine();

                System.out.println(playerNames[1] + " take your pick! (Rock, Paper or Scissors)");
                String playerTwoPick = scanner.nextLine();
                if (determineResult(playerOnePick, playerTwoPick) == 2) {
                    System.out.println("It's a draw!");
                } else if (determineResult(playerOnePick, playerTwoPick) == 0) {
                    System.out.println(playerNames[0] + " wins!\n");
                    scoreCountP0++;
                } else if (determineResult(playerOnePick, playerTwoPick) == 1) {
                    System.out.println(playerNames[1] + " wins!\n");
                    scoreCountP1++;
                }
            }
            System.out.println("Game over, final result is");
            System.out.println(playerNames[0] + " " + scoreCountP0 + " - " + scoreCountP1 + " " + playerNames[1]);

        } else if (singleOrMulti.equalsIgnoreCase("singleplayer")) {
            System.out.println("Player one, please input your name below:");
            playerNames[0] = scanner.nextLine();
            playerNames[1] = "Bot Jeff";

            int scoreCountP0 = 0;
            int scoreCountP1 = 0;
            int roundCount = 1;

            System.out.println("How many games would you like to play?");
            int roundsPreferred = 0;
            roundsPreferred = scanner.nextInt();

            while (roundCount <= roundsPreferred) {
                System.out.println("Round " + roundCount + "!");
                roundCount++;

                System.out.println(playerNames[0] + " take your pick! (Rock, Paper or Scissors)");
                String playerOnePick = getInput();

                String playerTwoPick = computerRockPaperScissors();
                System.out.println(playerNames[1] + " picks " + playerTwoPick + "\n");

                if (determineResult(playerOnePick, playerTwoPick) == 2) {
                    System.out.println("It's a draw!\n");
                } else if (determineResult(playerOnePick, playerTwoPick) == 0) {
                    System.out.println(playerNames[0] + " wins!\n");
                    scoreCountP0++;
                } else if (determineResult(playerOnePick, playerTwoPick) == 1) {
                    System.out.println(playerNames[1] + " wins!\n");
                    scoreCountP1++;
                }
            }
            System.out.println("Game over, final result is");
            System.out.println(playerNames[0] + " " + scoreCountP0 + " - " + scoreCountP1 + " " + playerNames[1]);


        }
    }


    static String computerRockPaperScissors() {
        Random rand = new Random();
        int random = rand.nextInt(3);
        if (random == 0) {
            return "Rock";
        } else if (random == 1) {
            return "Paper";
        } else if (random == 2) {
            return "Scissors";
        }
        return "null";
    }

    static void warmWelcome() {
        String breakLine = "----------------------------------------------------";
        System.out.println(breakLine);
        System.out.println("Welcome to the lovely game of Rock, Paper & Scissors");
        System.out.println(breakLine);
    }

    static int determineResult(String playerOnePick, String playerTwoPick) {
        if (playerOnePick.equalsIgnoreCase(playerTwoPick)) {
            return 2;
            //Player one wins!
        } else if (playerOnePick.equalsIgnoreCase("rock") && playerTwoPick.equalsIgnoreCase("scissors")) {
            return 0;
        } else if (playerOnePick.equalsIgnoreCase("paper") && playerTwoPick.equalsIgnoreCase("rock")) {
            return 0;
        } else if (playerOnePick.equalsIgnoreCase("scissors") && playerTwoPick.equalsIgnoreCase("paper")) {
            return 0;
            //Player two wins!
        } else if (playerTwoPick.equalsIgnoreCase("rock") && playerOnePick.equalsIgnoreCase("scissors")) {
            return 1;
        } else if (playerTwoPick.equalsIgnoreCase("paper") && playerOnePick.equalsIgnoreCase("rock")) {
            return 1;
        } else if (playerTwoPick.equalsIgnoreCase("scissors") && playerOnePick.equalsIgnoreCase("paper")) {
            return 1;
        }
        return 2;
    }

    static String getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}



