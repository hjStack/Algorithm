import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());
        StringBuilder sb = new StringBuilder();    // 문자열을 효율적으로 이어붙이기 위함
        Stack<Integer> stack=new Stack<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
            int a = Integer.parseInt(st.nextToken());

            switch (a){
                case 1:
                    int num=Integer.parseInt(st.nextToken());
                    stack.push(num);
                    break;
                case 2:
                   sb.append(stack.isEmpty() ? -1 : stack.pop()).append("\n");
                    break;
                case 3:
                    sb.append(stack.size()).append("\n");
                    break;
                case 4:
                    sb.append(stack.isEmpty() ? 1 : 0).append("\n");
                    break;
                default:
                    sb.append(stack.isEmpty() ? -1 : stack.peek()).append("\n");
                    // stack.peek()은 스택의 가장 위(top)에 있는 값을 꺼내보는 함수
                    break;
            }
        }

        System.out.print(sb);
    }

}
