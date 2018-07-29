import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        // Input
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = reader.nextInt();
        }

        //  Sort
        int count = 0;
        for (int i = 0; i <n-1; i++) {
            for (int j = n-1; j > i; j--) {
                if (A[j]<A[j-1])
                {
                    //Swap
                    int temp = A[j];
                    A[j] = A[j-1];
                    A[j-1] = temp;
                    count++;
                }

            }
        }

        //  Output
        System.out.println(count);
    }
}
