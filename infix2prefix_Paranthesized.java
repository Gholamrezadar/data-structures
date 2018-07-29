import java.util.Scanner;
import java.util.Stack;

public class infix2prefix_Paranthesized {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        char[] input = reader.nextLine().toCharArray();
        Stack<Integer> openBrackets = new Stack<>();
        char[] operators = new char[]{'+','-','*','/'};
        //((a+b)*c)
        for (int i=0; i<input.length; i++){
            if (input[i]=='(') {
                openBrackets.push(i);
                input[i]=' ';
            }

            if (input[i]==')') {
                input[i]=' ';
            }

            for(int j=0; j<operators.length; j++){
                if (input[i]==operators[j]) {
                    input[i] = ' ';
                    input[openBrackets.pop()] = operators[j];
                }
            }
        }

        for (int i = 0; i < input.length; i++) {
            if (input[i]!=' ')
                System.out.print(input[i]);
        }
    }
}
