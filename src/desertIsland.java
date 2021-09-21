import java.util.Arrays;
import java.util.Scanner;

public class desertIsland {
    public static void main(String[] args) {
        //Create scanner for receiving user input
        Scanner scanner = new Scanner(System.in);
        //Create the options in array for picks of items to bring on desert island
        String[] optionsToBring = {"Knife", "Fishing net", "Box of matches", "Hammock", "Bug Spray", "Sun screen",
        "Inflatable raft", "Flashlight", "Spear", "Satellite phone"};
        //Create holder for picks
        int[]picks = new int[10];
        //Present the user to the task and the options
        System.out.println("Which of these items would you bring on a desert island?");
        listArrayValuesNumbered(optionsToBring);
        //Create loop which prompts the user to input a choice, receive the input and updates the holder 'picks'
        for (int i = 0; i < 11; i++) {
            System.out.println("Please state your choice below:");
            int userChoice = scanner.nextInt();
            //Takes user input and adds one to the index picked (minus one to convert from user input to corresponding index)
            picks[userChoice-1]++;
        }
        //Prints the updated holder 'picks' to the user
        System.out.println("\n"+Arrays.toString(picks));
        //Pulls most popular pick from options using the index of the biggeste value in 'picks' array
        String mostPopularPick = optionsToBring[indexOfMaxFromIntArray(picks,picks.length)];
        System.out.println("Most popular pick was: "+mostPopularPick);
        }

    static int indexOfMaxFromIntArray(int[]array,int size){
        int max=0;
        int indexOfMaxValue=0;
        for (int i = 0; i < size; i++) {
            if (max < array[i]){
                max=array[i];
                indexOfMaxValue=i;
            }
        }
        return indexOfMaxValue;
    }

    static void listArrayValuesNumbered(String[]array){
        int arrayLength = array.length;
        for (int i = 0; i < arrayLength; i++) {
            System.out.println((i+1)+". "+array[i]);
        }
    }
}
