import java.util.*;

public class HanoiTowers {

    //Tower Ha (Stack)
    public static Stack<Integer> From = new Stack();
    public static Stack<Integer> Aux = new Stack();
    public static Stack<Integer> To = new Stack();

    //Mile Avval(Start) = A
    //Mile Dovvom(Komaki) = C
    //Mile Sevvom(End) = B
    public static void Hanoi(int n,Stack<Integer> A,Stack<Integer> B,Stack<Integer> C)
    {
        if (n==1) { // Disk Koochike
            B.push(A.pop()); // Enteghal az A be B
            ShowTowers(From,Aux,To);
            return;
        }
        Hanoi(n-1, A, C, B);
        B.push(A.pop()); // Enteghal az A be B
        ShowTowers(From,Aux,To);
        Hanoi(n-1, C, B, A);
    }

    //Sum of Values of a List
    public static int Sum(Stack<Integer> A){
        int sum = 0;
        for (int item : A){
            sum+= item;
        }
        return sum;
    }

    // Print kardan-e Har marhale
    public static void ShowTowers(Stack<Integer> A,Stack<Integer> B,Stack<Integer> C) {
        System.out.println(Sum(A)+" "+Sum(C)+" "+Sum(B));
    }

    // Por kardan Tower A (initialize)
    public static void fillBars(int n){
        for (int i = n; i > 0; i--) {
            From.push(i);
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        fillBars(n);
        ShowTowers(From,Aux,To);
        Hanoi(n,From,Aux,To);
    }
}
