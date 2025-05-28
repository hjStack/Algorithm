import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();

        for(int i=0; i<num; i++){
            System.out.println(solve(scan.next()));
        }
    }

    public static String solve(String str){
        Stack<Character> stack=new Stack<>();

        for(int i=0; i<str.length(); i++){
            char c=str.charAt(i);

            if (c == '('){
                stack.push(c);
            }

            // 닫는 괄호일경우
            else if(stack.empty()){  // 닫는 괄호가 없을 경우 
                return "NO";
            }
            else{
                stack.pop();
            }
        }

        /*
         * 모든 검사 마치고 스택에 잔여 요소가 있으면 여는 괄호가 많은 경우는 "NO"
         * 스택이 비어있으면 온전한 수식이므로 "YES" 이다.
         */

        if (stack.empty()) {
            return "YES";
        }
        else {
            return "NO";
        }
    }
}
