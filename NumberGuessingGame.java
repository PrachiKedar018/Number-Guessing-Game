import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame
{
    public static void main(String[] args)
    {
        Random r = new Random();
        int randomNumber = r.nextInt(100)+1;
        //System.out.println("Random Number is "+ randomNumber);
        int tryCount = 0;
        while(true)
        {
            System.out.println("enter your number(1-100)");
            Scanner scanner = new Scanner(System.in);
            int playerGuess = scanner.nextInt();
            int c = tryCount++;
            if(playerGuess == randomNumber)
            {
                System.out.println("\ncorrect! you Win\n");
                System.out.println("Number of attempts :"+c);
                int score = 10- c;
           		System.out.println("Your Score : "+score);
                int points = 10 - c;
                System.out.println(" Points : "+points);
            }
            else if(randomNumber < playerGuess)
            {
                System.out.println("\nNope! The Entered Number is High Guess The Lower Number\n");
            }
            else
            {
                System.out.println("\nNope! The entered Number Is Low Guess The Higher Number \n");
            }

        }

    }

}
