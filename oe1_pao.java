/*
Paolo
CS 2-1 | Outcomes Evaluation 1
*/

import java.util.Scanner;
import java.util.Arrays;

public class oe1_pao{

    public static void Array(int[] user_array){
        Scanner input = new Scanner(System.in);
        int size;
        
        System.out.println("Create the Array List");
  
        System.out.print("\nEnter the size of the array: ");
        size = input.nextInt();
        System.out.println();
        int my_array[] = new int[size];
 
        for(int x = 0; x < size; x++){
            System.out.print("Enter array element: ");
            my_array[x] = input.nextInt();
        }
        System.out.print("\nMy Array List: " + Arrays.toString(my_array) + "\n");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ch, size, location, item, i, repeat=1;
        
        System.out.println("Create the Array List");
        System.out.print("Enter the size of the array: ");
        size = input.nextInt();

        int my_array[] = new int[size];
        System.out.println();
        for(int x = 0; x < size; x++){
            System.out.print("Enter array element: ");
            my_array[x] = input.nextInt();
        }
        System.out.print("\nMy Array List: " + Arrays.toString(my_array)+ "\n\n");
        
        while(repeat!=0){
        System.out.println("[1] Create Array List");
        System.out.println("[2] Insert in Array");
        System.out.println("[3] Search in Array");
        System.out.println("[4] Delete in Array");
        System.out.println("[0] Exit");
        System.out.println();
        System.out.print("Select Operation: ");
        ch = input.nextInt();

        switch(ch){
            case 0:{
                System.out.println("\nThank you for trying the program!\n");
                repeat--;
                break;
            }
            case 1:{
                Array(my_array);
                break;
            }
            case 2:{        
                int insert_array[]=new int[size+1];
                for(i=0;i<size;i++){
                    insert_array[i]=my_array[i];
                }
                System.out.print("\nEnter the location of array: ");
                location=input.nextInt();
                System.out.print("Insert the new number in array: ");
                item=input.nextInt();
                System.out.println();

                for(i=size;i>location;i--){
                    insert_array[i]=my_array[i-1];
                }
                insert_array[location]=item;
                size++;
                System.out.print("Here's the array with the inserted new number: \n");
                for(i=0;i<size;i++){
                    System.out.print(insert_array[i] + " ");
                }
                System.out.println();
                System.out.println();
                break;
            }
            case 3:{
                int searchNumber;
                System.out.print("\nPlease enter a number to search for between your typed array list: ");
                searchNumber = input.nextInt();

                boolean found = false;
                for(i = 0;i<size;i++){
                    if (searchNumber == my_array[i]){
                    found = true;
                    break;
                    }
                    
                }
                if(found){
                    System.out.print("\n"+"We found your number at index " + i + "\n\n");
                }
                else{
                    System.out.println("Sorry, we did not find your desired number. Please try again.\n");

                }
                break;
            }
            case 4:{
                int delete_array[]=new int[size+1];
                for(i=0;i<size;i++){
                    delete_array[i]=my_array[i];
                }
                System.out.print("\nEnter the location of array you want to delete: ");
                location=input.nextInt();

                for(i=location;i>size;i++){
                    delete_array[i]=my_array[i+1];
                }
                size--;
                System.out.print("\nHere's your new array: \n");
                for(i=0;i<size;i++){
                    System.out.print(delete_array[i] + " ");
                }
                System.out.println();
                System.out.println();
                break;
            }
        }

    }
}
}