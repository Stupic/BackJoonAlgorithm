import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Character> stack ;
        String input;
        while (!Objects.equals(input = br.readLine(), ".")) {
            stack = new Stack<>();
            String answer = "yes";
            for(int i = 0 ; i < input.length() ; i++){
                if (input.charAt(i) == '(' || input.charAt(i) == '['){
                    stack.push(input.charAt(i));
                }else if (input.charAt(i) == ')' || input.charAt(i) == ']'){
                    if (stack.isEmpty()){
                        answer = "no";
                        break;
                    }
                    char ch = stack.peek();
                    if (input.charAt(i) == ')' &&  ch == '('){
                        stack.pop();
                    }
                    else if (input.charAt(i) == ']' &&  ch == '['){
                        stack.pop();
                    }else{
                        answer = "no";
                        break;
                    }
                }
            }
            if (!stack.isEmpty()){
                answer = "no";
            }
            System.out.println(answer);
        }
        br.close();
    }
}