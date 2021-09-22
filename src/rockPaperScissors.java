import java.util.Random;
import java.util.Scanner;

public class rockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] playerNames = new String[3];
        playerNames[2] = "draw";

        warmWelcome();

        System.out.println("Would you like to play Multiplayer or Singleplayer?");
        String gameMode = getInput();

        int scoreCountP0 = 0;
        int scoreCountP1 = 0;
        int roundCount = 1;
        int roundAmount;

        if (gameMode.equalsIgnoreCase("multiplayer")) {

            System.out.println("Player one, please input your name below:");
            playerNames[0] = getInput();
            System.out.println("Player two, please input your name below:");
            playerNames[1] = getInput();

            System.out.println("How many games would you like to play?");
            roundAmount = scanner.nextInt();

            while (roundCount <= roundAmount) {
                System.out.println("Round " + roundCount + "!");
                roundCount++;

                int resultValue = 2;
                String playerOnePick;
                String playerTwoPick;

                while (resultValue == 2) {
                    System.out.println(playerNames[0] + " take your pick! (Rock, Paper or Scissors)");
                    playerOnePick = getInput();

                    System.out.println(playerNames[1] + " take your pick! (Rock, Paper or Scissors)");
                    playerTwoPick = getInput();

                    resultValue = determineResult(playerOnePick, playerTwoPick);

                    if (resultValue == 2) {
                        System.out.println("It's a draw, go again!");
                    }

                }
                if (resultValue == 0) {
                    System.out.println(playerNames[0] + " wins!\n");
                    scoreCountP0++;
                } else if (resultValue == 1) {
                    System.out.println(playerNames[1] + " wins!\n");
                    scoreCountP1++;
                }
            }
            System.out.println("Game over, final result is");
            System.out.println(playerNames[0] + " " + scoreCountP0 + " - " + scoreCountP1 + " " + playerNames[1]);

        } else if (gameMode.equalsIgnoreCase("singleplayer")) {

            System.out.println("Player one, please input your name below:");
            playerNames[0] = scanner.nextLine();
            playerNames[1] = "Bot Jeff";

            System.out.println("How many games would you like to play?");
            roundAmount = scanner.nextInt();

            while (roundCount <= roundAmount) {
                System.out.println("Round " + roundCount + "!");
                roundCount++;

                int resultValue = 2;
                String playerOnePick;
                String playerTwoPick;

                while (resultValue == 2) {

                    System.out.println(playerNames[0] + " take your pick! (Rock, Paper or Scissors)");
                    playerOnePick = getInput();

                    playerTwoPick = botRockPaperScissors();
                    System.out.println(playerNames[1] + " picks " + playerTwoPick + "\n");
                    resultValue = determineResult(playerOnePick, playerTwoPick);
                    if (resultValue == 2) {
                        System.out.println("It's a draw, go again!");
                    }
                }

                if (resultValue == 0) {
                    System.out.println(playerNames[0] + " wins!\n");
                    scoreCountP0++;
                } else if (resultValue == 1) {
                    System.out.println(playerNames[1] + " wins!\n");
                    scoreCountP1++;
                }
            }
            System.out.println("Game over, final result is");
            System.out.println(playerNames[0] + " " + scoreCountP0 + " - " + scoreCountP1 + " " + playerNames[1]);


        }
    }

    static String botRockPaperScissors() {
        Random rand = new Random();
        int random = rand.nextInt(3);
        if (random == 0) {
            return "Rock";
        } else if (random == 1) {
            return "Paper";
        } else
            return "Scissors";
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