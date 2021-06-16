import java.util.Random;
import java.util.Scanner;

public class BubbleSort {
    //Bubble Sort function
    public static void sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            //Check next element against element j. If smaller, swap
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        printArray(arr);
    }

    //Function to print sorted array
    static void printArray(int[] arr) {
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
    //Create new instance of BubbleSort class. Call userInput and pass as parameter to sort() bubbleSort
    public static void main(String[] args) {
        sort(randomArray(userInput()));
    }
}
