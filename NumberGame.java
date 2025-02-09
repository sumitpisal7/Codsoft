import java.util.Random; 
import java.util.Scanner; 
 
public class NumberGame { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        Random random = new Random(); 
 
        System.out.println("\n\t\tWELCOME TO THE NUMBER GESSING GAME!!!"); 
 
        int score = 0; 
        boolean playAgain = true; 
 
        while (playAgain) { 
            int Number = random.nextInt(100) + 1; 
            int attempts = 1; 
            int totalattempts = 5; 
 
            System.out.println("I have selected a number between 1 and 100.\nCan you guess it?"); 
            System.out.println("You Have "+totalattempts+" Attempts !!!");
 
            while (attempts <= totalattempts) { 
                System.out.print("Enter your guess: "); 
                int Guess = sc.nextInt(); 
                sc.nextLine(); 
 
                attempts++; 
 
                if (Guess == Number) { 
                    System.out.println("\tCONGRATULATIONS!!!\nYou guessed the number " + Number + " in " + attempts + " attempts."); 
                    score++; 
                    break; 
                } else if (Guess < Number) { 
                    System.out.println("Too low! Try again."); 
                } else { 
                    System.out.println("Too high! Try again."); 
                } 
            } 
 
            if (attempts >totalattempts) { 
                System.out.println("\nSorry, you've run out of attempts.\nThe correct number was " + Number + "."); 
            } 
 
            System.out.print("Do you want to play again? (yes/no): "); 
            String playAgainInput = sc.nextLine(); 
            playAgain = playAgainInput.equalsIgnoreCase("yes"); 
        } 
 
        System.out.println("\n\tGAME OVER !\n\tYOUR SCORE : " + score); 
 
        sc.close(); 
    } 
}