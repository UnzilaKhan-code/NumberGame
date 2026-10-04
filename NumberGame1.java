package numbergame1;

import java.util.Random;
import java.util.Scanner;

public class NumberGame1 {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int secretNumber = random.nextInt(100) + 1;
        int guess = 0;

        System.out.println("===== NUMBER GUESSING GAME =====");
        System.out.println("I have chosen a number between 1 and 100.");
        System.out.println("Try to guess it!");

        while (guess != secretNumber) {

            System.out.print("Enter your guess: ");
            guess = input.nextInt();

            if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            }
            else if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            }
            else {
                System.out.println("Correct! You won!");
            }
        }

        input.close();
    }
}