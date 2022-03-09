/*
Paolo
CS 2-1 | OE4
*/

import java.util.Arrays;
import java.util.Scanner;

public class quicksort2 {

    //partion function; 
    static int my_partition(int arr[], int start, int end) {
        int pivot = arr[end];
        int i = (start-1);

        for(int j = start; j <= end; j++){
            //if current element arr[j] < the pivot
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = temp;
        return(i + 1);
    }
    // quick sort function
    static void my_quickSort(int[] arr,int s,int e){
        if(s < e){
            int p = my_partition(arr, s, e);
            my_quickSort(arr, s, p - 1);
            my_quickSort(arr, p + 1, e);
        }
    }

    // Function to read user input
    public static void main(String[] args) {
        Scanner s = new Scanner((System.in));
        int size;
        System.out.print("\nEnter the size of the array: ");
        size = s.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter array elements: ");
        int i;
        for (i = 0; i < arr.length; i++) {
           arr[i] = s.nextInt();    
        }
        System.out.print("\nThe initial array is: ");
        System.out.println(Arrays.toString(arr));
        my_quickSort(arr, 0, arr.length-1);
        System.out.print("The sorted array is: ");
        System.out.println (Arrays.toString(arr));

        int min = arr[0];
        int max = arr[size-1];

            if (arr[0] < min) {
                min = arr[i];
            }
            if (arr[size-1] > max) {
                max = arr[size-1];
            }
        
        System.out.println("\nMin: " + min);
        System.out.println("Max: " + max);
        System.out.println();
    }
}