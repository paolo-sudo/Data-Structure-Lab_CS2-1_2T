/* 
Paolo D
CS 2-1
Outcomes Evaluation 2
*/

import java.util.Scanner;
import java.util.Arrays;

public class oe2_pao {

    static void Array1(int[] user_array){
        Scanner input = new Scanner(System.in);
        int size;

        System.out.println("Create the Array List and Let the Program Sort it!");
  
        System.out.print("\nHow many numbers you want your array to have: ");
        size = input.nextInt();
        System.out.println();
        int my_array[] = new int[size];
        for(int x = 0; x < size; x++){
            System.out.print("Enter the number: ");
            my_array[x] = input.nextInt();
        }
        System.out.print("\nMy Array List: " + Arrays.toString(my_array) + "\n");
        System.out.println();
    }

    static void bubbleSort(int[] array1){
        
        int ctr = array1.length;
        int temp = 0;

        for(int x = 0; x < ctr; x++){
            for(int y = 1; y < (ctr-x); y++){
                System.out.print("\nElements [" + array1[y-1] + "] [" + array1[y] + "]");

                if(array1[y-1] > array1[y]){
                    //swapping technique
                    temp = array1[y-1];
                    array1[y-1] = array1[y];
                    array1[y] = temp;
                }
            }
        }
    }

    static void insertionSort(int array2[]){
        int ctr = array2.length;
        int temp = 0;

        for(int x = 1; x < ctr; x++){
            int k = array2[x]; // k = value to insert
            int y = x - 1; // y = hole position

            while((y > -1) && (array2[y] > k)){
                array2[y+1] = array2[y];
                y--;
            }
            array2[y+1] = k;
        }
        for(int x = 0; x < ctr; x++){
            for(int y = 1; y < (ctr-x); y++){
                System.out.print("\nElements [" + array2[y-1] + "] [" + array2[y] + "]");

                if(array2[y-1] > array2[y]){
                    //swapping technique
                    temp = array2[y-1];
                    array2[y-1] = array2[y];
                    array2[y] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ch, size, repeat=1;

        //int b_array[] = {14,33,27,35,10};
        //int i_array[] = {14,33,27,10,35,19,42,44};

        System.out.println("\nCreate the Array List and Let the Program Sort it!");
        System.out.print("How many numbers you want your array to have: ");
        size = input.nextInt();

        int my_array[] = new int[size];
        System.out.println();
        for(int x = 0; x < size; x++){
            System.out.print("Enter the number: ");
            my_array[x] = input.nextInt();
        }
        System.out.print("\nYour Array List: " + Arrays.toString(my_array)+ "\n\n");
        
        while(repeat!=0){
        System.out.println("[1] Create Array List");
        System.out.println("[2] Insertion Sort");
        System.out.println("[3] Bubble Sort");
        System.out.println("[4] Show My Array");
        System.out.println("[0] Exit Sort");
        System.out.println();
        System.out.print("Select Operation: ");
        ch = input.nextInt();

        switch(ch){
            case 0:{
                System.out.println("\nThank you for trying the sorting program! Come back again!\n");
                repeat--;
                break;
            }
            case 1:{
                Array1(my_array);
                System.out.println();
                break;
            }
            case 2:{
                System.out.print("\nHere's your array lists: ");
                System.out.print(Arrays.toString(my_array));
                System.out.println("\nHere's your unsorted array: ");

                for(int x = 0; x < size; x++){
                    System.out.print(" " + my_array[x]);
                }
                System.out.println("");
                //call function
                //bubbleSort(b_array);
                insertionSort(my_array);

                System.out.println("\n\n Here's your sorted array: ");
                for(int x = 0; x < size; x++){
                    System.out.print(" " + my_array[x]);
                }
                System.out.println("\n");
                break;   
            }
            case 3:{
                System.out.print("\nHere's your array lists: ");
                System.out.print(Arrays.toString(my_array));
                System.out.println("\nHere's your unsorted array: ");

                for(int x = 0; x < size; x++){
                    System.out.print(" " + my_array[x]);
                }
                System.out.println("");
                //call function
                bubbleSort(my_array);
                //insertionSort(my_array);

                System.out.println("\n\nHere's your sorted array: ");
                for(int x = 0; x < size; x++){
                    System.out.print(" " + my_array[x]);
                }
                System.out.println("\n");
                break;
            }
            case 4:{
                System.out.print("\nHere's your array lists: ");
                System.out.print(Arrays.toString(my_array));
                System.out.println("\n");
                break;
            }
        }     

        /*
        System.out.println("Unsorted array: ");

        for(int x = 0; x < size; x++){
            System.out.print(" " + my_array[x]);
        }
        System.out.println("");
        //call function
        //bubbleSort(b_array);
        insertionSort(my_array);

        System.out.println("\nSorted array: ");
        for(int x = 0; x < size; x++){
            System.out.print(" " + my_array[x]);
        }
        */
    }
}
}