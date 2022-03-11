/*
Paolo S. Daquioag
CS 2-1 | OE5 "Improving quicksort implementation using Random selection of Pivot (with time complexity), Hybrid quicksort (Insertion)"
*/

import java.util.Random;

public class OE5_qsortRandom {

    //calculate the random numbers between high and low
    static void myRandom(int arr[], int low, int high){
        Random rand = new Random();
        int pivot = rand.nextInt(high-low)+low;

        int temp = arr[pivot];
        arr[pivot] = arr[high];
        arr[high] = temp;
    }

    static int partition(int arr[], int low, int high){
        //Pivot is randomly selected
        myRandom(arr, low, high);
        int pivot = arr[high];

        int i = (low-1); //refers to the index of smaller element
        for(int j = low; j < high; j++){
            //set the condition
            if(arr[j] < pivot){
                i++;
                //perform swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //pivot arr[high]
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    static void qsort(int arr[], int low, int high){
        if(low < high){
            //p refers to the particion index
            //that the pivot is already in the sorted position
            int p = partition(arr, low, high);

            //recursively sort elements partition after partition
            qsort(arr, low, p-1);
            qsort(arr, p+1, high);
        }
    }

    static void printArray(int arr[]){
        int n = arr.length;
        for(int x = 0; x < n; x++){
            System.out.print(arr[x] + " ");
            //System.out.println();
        }
    }

    static void Insertion_sort(int a[], int low, int high)
    {
        for (int i = low + 1; i <= high; i++) {
            for (int j = i - 1; j >= low; j--) {
                if (a[j] > a[j + 1]) {
                    // Swap
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
                else
                    break;
            }
        }
    }
 
    static void Hybrid_Quicksort(int arr[], int low, int high)
    {
        while (low < high) {
            // Check array size which we will be working is less than 10
            if (high - low < 10) {
            Insertion_sort(arr, low, high);
            break;
            }
            else {
                int pivot = partition(arr, low, high);

                //do recursion on small size

                if (pivot - low < pivot - high) {
                Hybrid_Quicksort(arr, low, pivot - 1);
                low = pivot + 1;
                }
                else {
                    Hybrid_Quicksort(arr, pivot + 1, high);
                    high = pivot - 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        
        long startTime;
        long endTime;
        long elapsedTime;
        
        int arr[] = {20,30,40,70,80,60,90,10,50};
        int n = arr.length;

        System.out.print("\nUnsorted array values: ");
        printArray(arr);

        qsort(arr, 0, n-1);

        System.out.print("\nSorted array values: ");
        printArray(arr);

        startTime = System.nanoTime();
        endTime = System.nanoTime();

        elapsedTime = endTime - startTime; 

        System.out.println("\n\nQuick Sort Elapsed Time: " + elapsedTime + " ns\n"); // To print elapsed time coplexity

        System.out.print("Hybrid Quick Sort: ");
        Hybrid_Quicksort(arr, 0, arr.length - 1); //Hybrid Quicksort
        for (int i : arr)
            System.out.print(i + " ");
            System.out.println("\n");
    }
}