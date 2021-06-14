import java.util.Random;
import java.util.Scanner;

public class SelectionSort {
    //Selection Sort function
    public static void sort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            //Set new minimum index every pass to i
            int min_index = i;
            //Step through array. Check element at index j -*(i + 1)*- against element at minimum index. If j is smaller, set minimum index to j
            //and swap the elements at j and minimum index
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            //Swap elements using a temporary variable
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);
    }

    //Function to print sorted array
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //Function to create and return a random array
    static int[] randomArray(int size) {
        Random rd = new Random();

        int arr[] = new int[size];

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
        int size = scanner.nextInt();

        return size;
    }

    //Main method
    //Create new instance of SelectionSort class. Call userInput and pass as parameter to sort() selectionSort
    public static void main(String args[]) {
        SelectionSort selectionSort = new SelectionSort();
        int size = userInput();
        selectionSort.sort(randomArray(size));
    }
}
