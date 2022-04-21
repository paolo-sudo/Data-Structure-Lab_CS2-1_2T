/*
Paolo D.
CS 2-1 | PT4 "Implementation Of Data Structures and Algorithm in A Computer Game"
*/

import java.util.Scanner;
import java.util.Random;

public class PT4_DSA{
    
    public static void guessingGame(){
        Random rand = new Random(); //declare random class
        Scanner scanner = new Scanner(System.in); //create scanner class to accept the input of the user

        int randomNumber = rand.nextInt(100) + 1; //variable to hold the number. +1 makes the number between 1 and 100
        //System.out.println("Random number is " + randomNumber); //for debugging, it will print the random number

        int tryCount = 0; //will record how many guesses the user have tried
        int tries = 7; //number of guesses the user is allowed to guess
        int i;
        
        System.out.println("\n\n\tWelcome to Number Guessing Game!" + 
        "\n\n\tIt demonstrates Binary Search Algorithm, and you are supposed to" +
        "\n\tguess a number within the range, and you have a total of 7 guesses." +
        "\n\n\tEnjoy the game!");

        for (i = 0; i < tries; i++) { //will repeat until it reaches the maximum tries, which is 7 guesses
            System.out.print("\n\n\tEnter your guess (1-100): "); //ask the user to guess the number
            int playerNumber = scanner.nextInt(); //accept and store the input in int
            tryCount++; //will increment every time the user guesses the wrong number

            if(playerNumber == randomNumber){ //if the users number is equal to random number 
                System.out.println("\n\n\tCorrect! You Win!"); //print if the user guessed the correct number
                System.out.println("\tIt took you " + tryCount + " guesses to guess the number\n\n"); //tryCount will print how many guesses the user have used
                break; // if the user has guessed the number end of program
            }
            else if(randomNumber > playerNumber && i != tries - 1){ //if the random number is greater than the users number and if the tries does not reach the max
                System.out.println("\n\tNope! The number is higher than " + playerNumber + ". Guess again."); //print if the users number is higher than the random number
            }
            else{
                System.out.println("\n\tNope! The number is lower than " + playerNumber + ". Guess again."); //print if the users number is lower than the random number
            }
        }
    
        if (i == tries) { //if the user have reached the maximum guesses
            System.out.println("\n\n\tOps! You already used your " + tries + " trials."); //print 
  
            System.out.println("\tThe number was " + randomNumber + "\n\n"); //print the random number 
        }
        scanner.close(); //close the scanner to not leak resources
    }
    
    public static void main(String[] args) {
        guessingGame(); //call the function
    }
}