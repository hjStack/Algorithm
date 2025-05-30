import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
public static void main(String[] args) throws IOException {

    BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb=new StringBuilder();
    int n = Integer.parseInt(bufferedReader.readLine());
    Stack<Integer> stack=new Stack<>();

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
            int num=Integer.parseInt(st.nextToken());

            if(num == 0){
                sb.append(stack.pop()).append("\n");
            }
            else{
                sb.append(stack.push(num)).append("\n");
            }
        }
        // 3을 넣고 0을만나면 빼고 4를 넣고 0을 만나면 뺌

    int sum=0;
    for(int num:stack){
        sum += num;
    }

    System.out.println(sum);
    }
}