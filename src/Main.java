import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MinMax minMax = new MinMax();
        int playerChoice = 0;
        while (playerChoice != -1){
            System.out.println("Enter a Number (or -1 to quit): ");
            playerChoice = scanner.nextInt();
            if (playerChoice != -1) minMax.addNumber(playerChoice);
        }
        if (minMax.getNumberListSize() == 0) {
            System.out.println("You did not enter any numbers!");
            exit(1);
        }else{
            System.out.println("The Minimum is "+ minMax.findMinimum());
            System.out.println("The Maximum is "+ minMax.findMaximum());
        }
    }
}