import java.util.Random;
import java.util.Scanner;

public class rockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] playerNames = new String[3];
        playerNames[2]="draw";

        warmWelcome();
        System.out.println("Player one, please input your name below:");
        playerNames[0] = scanner.nextLine();
        System.out.println("Player two, please input your name below:");
        playerNames[1] = scanner.nextLine();

        System.out.println(playerNames[0] + " take your pick! (Rock, Paper or Scissors");
        String playerOnePick = scanner.nextLine();

        System.out.println(playerNames[1] + " take your pick! (Rock, Paper or Scissors");
        String playerTwoPick = scanner.nextLine();

        if (tempDetermineResult(playerOnePick,playerTwoPick)==2){
            System.out.println("It's a draw!");
        } else if(tempDetermineResult(playerOnePick,playerTwoPick)<2) {
            System.out.println(playerNames[tempDetermineResult(playerOnePick, playerTwoPick)] + " wins!");
        }

        int scoreCountP1 = 0;
        int scoreCountP2 = 0;

    }
    static void ComputerRockPaperScissors() {
        Random rand = new Random();
        int random = rand.nextInt(3);
        if (random == 0) {
            System.out.println("Rock");
        } else if (random == 1) {
            System.out.println("Paper");
        } else if (random == 2) {
            System.out.println("Scissors");
        }
    }

    static void warmWelcome() {
        String breakLine = "----------------------------------------------------";
        System.out.println(breakLine);
        System.out.println("Welcome to the lovely game of Rock, Paper & Scissors");
        System.out.println(breakLine);
    }

    static void determineResultRPS(String[] playerNames, String playerOnePick, String playerTwoPick) {
        if (playerOnePick.equalsIgnoreCase(playerTwoPick)) {
            System.out.println("It's a draw!😨");
            //Player one wins!
        } else if (playerOnePick.equalsIgnoreCase("rock") && playerTwoPick.equalsIgnoreCase("scissors")) {
            System.out.println(playerNames[0] + " wins!🍾");
        } else if (playerOnePick.equalsIgnoreCase("paper") && playerTwoPick.equalsIgnoreCase("rock")) {
            System.out.println(playerNames[0] + " wins!🍾");
        } else if (playerOnePick.equalsIgnoreCase("scissors") && playerTwoPick.equalsIgnoreCase("paper")) {
            System.out.println(playerNames[0] + " wins!🍾");
            //Player two wins!
        } else if (playerTwoPick.equalsIgnoreCase("rock") && playerOnePick.equalsIgnoreCase("scissors")) {
            System.out.println(playerNames[1] + " wins!🎉");
        } else if (playerTwoPick.equalsIgnoreCase("paper") && playerOnePick.equalsIgnoreCase("rock")) {
            System.out.println(playerNames[1] + " wins!🎉");
        } else if (playerTwoPick.equalsIgnoreCase("scissors") && playerOnePick.equalsIgnoreCase("paper")) {
            System.out.println(playerNames[1] + " wins!🎉");
        }
    }

    static int determineResult(String[]playerNames, String playerOnePick, String playerTwoPick){
        int playerOnePickInt;
        int playerTwoPickInt;

        if (playerOnePick.equalsIgnoreCase("rock")){
            playerOnePickInt=1;
        } else if (playerOnePick.equalsIgnoreCase("paper")){
            playerOnePickInt=2;
        } else if (playerOnePick.equalsIgnoreCase("scissors")){
            playerOnePickInt=3;
        }
        if (playerTwoPick.equalsIgnoreCase("rock")){
            playerTwoPickInt=1;
        } else if (playerTwoPick.equalsIgnoreCase("paper")){
            playerTwoPickInt=2;
        } else if (playerTwoPick.equalsIgnoreCase("scissors")){
            playerTwoPickInt=3;
        }


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

    static int tempDetermineResult(String playerOnePick, String playerTwoPick){
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
}
