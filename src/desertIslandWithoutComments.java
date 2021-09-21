import java.util.Arrays;
import java.util.Scanner;

public class desertIslandWithoutComments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] optionsToBring = {"Knife", "Fishing net", "Box of matches", "Hammock", "Bug Spray", "Sun screen",
        "Inflatable raft", "Flashlight", "Spear", "Satellite phone"};
        int[]picks = new int[10];

        System.out.println("Which of these items would you bring on a desert island?");
        listArrayValuesNumbered(optionsToBring);

        for (int i = 0; i < 11; i++) {
            System.out.println("Please state your choice below:");
            int userChoice = scanner.nextInt();
            picks[userChoice-1]++;
        }
        System.out.println("\n"+Arrays.toString(picks));
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
