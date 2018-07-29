import java.util.Scanner;

public class Main {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        // getting input
        int n = reader.nextInt();
        int[] array = new int[n];
        for (int i=0; i<n; i++) {
            array[i] = reader.nextInt();
        }

        // sort
        insertionSort(array, n);
    }

    // insertion sort
    private static void insertionSort(int[] array, int n) {
        for (int i=1; i<n; i++)
        {
            int key = array[i];
            int j;
            for (j=i-1; j>=0; j--)
            {
                if (key<array[j]) {
                     array[j+1] = array[j];// shift be Jolo
                }
                else {
                    break;
                }

            }
            array[j+1]=key;
            showArray(array, n);
        }
    }

    // printing the array
    private static void showArray(int[] array,int n) {
        for (int i=0; i<n; i++) {
            System.out.print(array[i]);
            System.out.print(",");
        }
        System.out.println();
    }
}
