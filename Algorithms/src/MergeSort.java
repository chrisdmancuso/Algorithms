import java.util.MissingResourceException;
import java.util.Random;
import java.util.Scanner;

public class MergeSort {

    //Pass the array and array size
    public static void mergeSort(int[] arr, int n) {
        //If array size is less than 2, we return
        if (n < 2) {
            return;
        }
        //Determine mid point, and create sub arrays for left and right
        int mid = n / 2;
        //Size of array based on mid point
        int[] subLeft = new int[mid];
        int[] subRight = new int[n - mid];

        //Fill sub arrays
        for (int i = 0; i < mid; i++) {
            subLeft[i] = arr[i];
        }
        for (int i = mid; i < n; i++) {
            subRight[i - mid] = arr[i];
        }
        //Recursive call to sort sub arrays.
        mergeSort(subLeft, mid);
        mergeSort(subRight, n - mid);

        //Once sub arrays are sorted, merge
        merge(arr, subLeft, subRight, mid, n - mid);
    }

    //Merge sorted arrays. Pass initial array, sorted left, sorted right, size left, size right
    public static void merge(
            int[] a, int[] subLeft, int[] subRight, int left, int right) {

        //Initialize counters for loop logic
        int i = 0, j = 0, k = 0;
        //While i and j are less than left and right size respectively, check if left arr[i] is less than or equal right arr[j].
        //If true, set arr[k] = left[i] and increment both up. * If k = 0, then a[k++] checks element at 0, then increments up after.
        //So a[k++] = l[i++] during the first pass looks like a[0] = l[0], then increment up.
        while (i < left && j < right) {
            if (subLeft[i] <= subRight[j]) {
                a[k++] = subLeft[i++];
            }
            //If element in left array is greater than element in right, add element from right array to original array
            else {
                a[k++] = subRight[j++];
            }
        }
        //While i < size of left, add element from left array to original array
        while (i < left) {
            a[k++] = subLeft[i++];
        }
        //While j < size of right, add element from right array to original array
        while (j < right) {
            a[k++] = subRight[j++];
        }
    }
    void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    //Function to create and return a random array
    static int[] randomArray(int size) {
        Random rd = new Random();

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100);
        }
        return arr;
    }

    //Scanner to allow user input to determine size of random array
    static int userInput() {
        System.out.println("Enter an integer to generate an array: ");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer: ");
            scanner.nextLine();
        }

        return scanner.nextInt();
    }

    //Main method
    public static void main(String[] args) {

        MergeSort mySort = new MergeSort();
        int[] arr = randomArray(userInput());

        mergeSort(arr, arr.length);
        mySort.printArray(arr);
    }

}
