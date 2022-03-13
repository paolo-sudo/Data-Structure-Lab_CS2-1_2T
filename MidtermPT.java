/*
Paolo
CS 2-1 | Midterm and PT2
*/

import java.util.Scanner;

public class MidtermPT {
    //[0] infinite times
    static void my_recursion1(){
        System.out.print("Hello");
        my_recursion1();//call the function by itself
    }

    //[0] finite recursion - base case criteria
    static int ctr = 0;
    static void my_recursion2(String word){
        ctr++;
        if(ctr <= 3){
            System.out.println(" " + word);
            my_recursion2(word);
        }
    }

    //[1]Fibonacci series number
    static int f1=0, f2=1, fn=0;
    static void myFibonacci(int num){
        if(num > 0){
            fn = f1 + f2;
            f1 = f2;
            f2 = fn;
            System.out.print(" " + fn);
            myFibonacci(num-1);
        }
    }

    /* 
    //[2] Factorial of a number
    static int myFactorial2(int num){
        System.out.println(num + " x ");
        if(num == 1)
            return 1;
        else  
            return(num * myFactorial(num-1));     
    } 
    */

    //[2] Factorial of a number
    static int myFactorial(int num){
        Scanner in = new Scanner(System.in);
        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.printf("\tFactorial of %d = %d", num, factorial);
        return num;     
    }
    
    //[3] Reverse a number base 10
    static void myReverse(int num){
        if(num < 10){
            System.out.print(num);
            return;
        }else{
            System.out.print(num % 10);
            myReverse(num/10);
        }
    }

    //[4] Reversed a word
    static void myReverseWord(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("\n\tEnter a Word: ");
        String word = in.nextLine();
        word = word.trim();
        String result = ""; 
        char[] ch = word.toCharArray();  
        for (int i = ch.length - 1; i >= 0; i--) {
                result += ch[i];
            }
        System.out.println("\tReversed word: "+ result.trim()); 	
    }

    //[5] Tower of Hanoi
    //[6] Recursive Call

    public static void main(String[] args){

        int ans, ch;
        Scanner in = new Scanner(System.in);

        do{
            System.out.println("\n\n\tAPPLICATION OF RECURSION\n");
            System.out.println("\t[1] Fibonacci Series Number");
            System.out.println("\t[2] Factorial of a Number");
            System.out.println("\t[3] Reverse a Number");
            System.out.println("\t[4] Reverse a Word");
            System.out.println("\t[5] Tower of Hanoi");
            System.out.println("\t[6] Recursive Call");
            System.out.println("\t[0] System Exit");
            System.out.print("\n\tSelect your choice: ");
            ans = in.nextInt();

        switch(ans){
            case 1:{
                int num;// okay
                System.out.println("\n\n\tFibonacci Series Number");
                System.out.print("\n\tEnter a number: ");
                num = in.nextInt();
                System.out.print("\tHere's the Fibonacci result:");
                myFibonacci(num);
                break;
            }
            case 2:{
                int num;// okay
                System.out.println("\n\n\tFactorial of a Number");
                System.out.print("\n\tEnter a number: ");
                num = in.nextInt();
                //System.out.print("Here's the  result: ");
                myFactorial(num);
                break;
            }
            case 3:{
                int num;// okay
                System.out.println("\n\n\tReverse a Number");
                System.out.print("\n\tEnter a number: ");
                num = in.nextInt();
                System.out.print("\tHere's the reversed result: ");
                myReverse(num);
                break;
            }
            case 4:{
                System.out.println("\n\n\tReverse a Word"); //okay
                myReverseWord(args);
                break;
            }
            case 5:{
                System.out.println("\n\n\tTower of Hanoi");
                System.out.print("\n\tEnter a number: ");
                break;
            }
            case 6:{
                System.out.println("\n\n\tRecursive Call");
                System.out.print("\n\tEnter a number: ");
                String word = in.nextLine();
                my_recursion2(word);
                break;
            }

            case 0:{
                System.exit(0);
            }

            default:
                System.out.print("\n\tWrong input...");
        }
        
        System.out.print("\n\n\tEnter 1 to Try Again, [0 to exit]: ");
            ch = in.nextInt();
            System.out.println();
            System.out.println();
        }while(ch != 0);
        //myReverse(123456789);

        //myFibonacci(10);

        //System.out.print("\nFactorial of 5: " + myFactorial(5));
        //my_recursion2("Hello");

        /*print hello world 3x
        for(int x = 0; x < 3; x++){
            System.out.println("Hello world");
        }*/
    }
}
