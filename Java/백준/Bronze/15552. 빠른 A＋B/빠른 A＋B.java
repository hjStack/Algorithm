import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int result=0;

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a1=Integer.parseInt(st.nextToken());
            int b1=Integer.parseInt(st.nextToken());

            sb.append(a1 + b1).append('\n'); // 결과를 StringBuilder에 저장
        }
        System.out.println(sb);
        br.close();
    }
}
