//package CodSoft;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    private static int MIN_RANGE=1;
    private static int MAX_RANGE=100;
    private static int MAX_ATTEMPTS=10;
    public static void main(String[] args) {
        System.out.println("Hello World");
        Random random=new Random();
        int number=random.nextInt(MAX_RANGE) + MIN_RANGE;
        Scanner sc=new Scanner(System.in);
        int attempts=0;
        System.out.println("Number Guessing Game");
        System.out.println("Guess the Number Between 1 to 100");
        System.out.println("Total Number of Attempts: "+MAX_ATTEMPTS);
        while(attempts<MAX_ATTEMPTS){
            attempts +=1;
            System.out.println("Enter your guess number:");
            int guessNumber=sc.nextInt();
            if(guessNumber==number){
                System.out.println("Congratulation!! You Guessed Correct.");
                System.out.println("Total Attempts = "+attempts+ "\nNumber or GuessNumber ="+guessNumber);
                break;
            }
            else if(guessNumber<number){
                System.out.println("Guess High...");
                System.out.println("Attempts Left ="+(MAX_ATTEMPTS-attempts));
            }
            else{
                System.out.println("Guess Low...");
                System.out.println("Attempts Left ="+(MAX_ATTEMPTS-attempts));
            }

        }
        if(attempts==MAX_ATTEMPTS){
            System.out.println("\nTry Again!!!");
        }
        sc.close();

    }
}