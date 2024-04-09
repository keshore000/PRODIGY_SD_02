import java.util.Scanner;
import java.util.Random;

public class task2 {
    public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the Limit: ");
		int n=scanner.nextInt();

	        int Number = random.nextInt(n) + 1;
        	int attempts = 0;
        
        while (true) {
            System.out.print("Guess the number within the limit ");
            int guess = scanner.nextInt();
            attempts++;
            
           
            if (guess == Number) {
                System.out.println("Congratulations! You've guessed the number " + Number + " correctly!");
                System.out.println("It took you " + attempts + " attempts to win the game.");
                break;
            }

            else if (guess > Number) {
                System.out.println("Too high! Try again.");
            }
            
            else {
                System.out.println("Too low! Try again.");
            }
        }
    }
}