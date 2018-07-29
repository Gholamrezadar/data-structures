import java.util.Scanner;
import java.util.Stack;

public class BracketsVerifier {
    public static void main(String[] args) {
        //  Input
        Scanner reader = new Scanner(System.in);
        String input  = "((()))";
        input = reader.next();

        //  Process
        Stack<String> openStack = new Stack<>();

        for( char c : input.toCharArray()) {
            if (c == '('){
                    openStack.push("(");
                }

            if (c == ')'){
                if (!openStack.empty()){
                    openStack.pop();
                }
            }
        }
        if (openStack.empty()){
            System.out.println("OK");
        }
        else {
            System.out.println("NotOK");
        }
    }
}
