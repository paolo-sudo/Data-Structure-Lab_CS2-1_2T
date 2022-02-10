/* 
Paolo
CS 2-1 | Prelim - February 10, 2022
*/

import java.util.Scanner;
import java.util.Arrays;

public class prelim_paolo {
    
    public static void Array(int[] user_array){
        Scanner input = new Scanner(System.in);
        int size;
        
        System.out.println("Create the Array List");
  
        System.out.print("\nHow many elements: ");
        size = input.nextInt();
        System.out.println();
        int my_array[] = new int[size];
 
        for(int x = 0; x < size; x++){
            System.out.print("Enter element of the array: ");
            my_array[x] = input.nextInt();
        }
        System.out.print("\nYour Array List: " + Arrays.toString(my_array) + "\n");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ch, size, location, item, i, repeat=1;
        
        System.out.println("Create the Array List");
        System.out.print("How many elements: ");
        size = input.nextInt();

        int my_array[] = new int[size];
        System.out.println();
        for(int x = 0; x < size; x++){
            System.out.print("Enter element of the array: ");
            my_array[x] = input.nextInt();
        }
        System.out.print("\nYour Array List: " + Arrays.toString(my_array)+ "\n\n");
        
        while(repeat!=0){
        System.out.println("[1] Create Array List");
        System.out.println("[2] Insert in Array");
        System.out.println("[3] Delete in Array");
        System.out.println("[4] Search in Array");
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
            case 2:{ // Insertion
                int insert_array[]=new int[size+1];
                for(i=0;i<size;i++){
                    insert_array[i]=my_array[i];
                }
                System.out.print("\nEnter the location of array: ");
                location=input.nextInt();
                System.out.print("Enter the element to be inserted: ");
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
            case 3:{ // Deletion
                Scanner sc=new Scanner(System.in);
                int n;    //Array Size Declaration
                System.out.println("\nHow many elements: ");
                n=sc.nextInt();    //Array Size Initialization
                
                Integer arr[]=new Integer[n];    //Array Declaration
                System.out.println("\nEnter element of the array: ");
                for(i=0;i<n;i++)     //Array Initialization
                {
                    arr[i]=sc.nextInt();
                }
                System.out.println("\nEnter the element to be deleted: ");
                int elem = sc.nextInt();
            
            for(i = 0; i < arr.length; i++)
            {
              if(arr[i] == elem)   //If element found
              {
                // shifting elements
                for(int j = i; j < arr.length - 1; j++)
                {
                    arr[j] = arr[j+1];
                }
                break;
              }
            }
              
               System.out.println("\nHere's your new array after deletion: " );
               for(i = 0; i < arr.length-1; i++)
               {
                     System.out.print(arr[i]+ " ");
               }
               System.out.println();  
               System.out.println();  
               break;
            }

                /*
                int delete_array[]=new int[size+1];
                for(i=0;i<size;i++){
                    delete_array[i]=my_array[i];
                }
                System.out.print("\nEnter the element to be deleted: ");
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
                break;*/
                
            case 4:{ //Searching
                int searchNumber;
                System.out.print("\nEnter the element to be searched: ");
                searchNumber = input.nextInt();

                boolean found = false;
                for(i = 0;i<size;i++){
                    if (searchNumber == my_array[i]){
                    found = true;
                    break;
                    }
                    
                }
                if(found){
                    System.out.print("\n"+"Position of the item searched at index " + i + "\n\n");
                }
                else{
                    System.out.println("Sorry, we did not find your desired number. Please try again...\n");

                }
                break;
            }
        }
    }
}
}