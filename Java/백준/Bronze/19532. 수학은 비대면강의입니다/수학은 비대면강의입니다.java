import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        int a=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());
        int c=Integer.parseInt(st.nextToken());
        int d=Integer.parseInt(st.nextToken());
        int e=Integer.parseInt(st.nextToken());
        int f=Integer.parseInt(st.nextToken());

        for(int i=-999; i<=999; i++){
            for(int j=-999; j<=999; j++){
                if(a * i + b * j == c){      // ax + by 가 c이고(x = i, y = j)
                    if(d * i + e * j == f){  // dx + ey가 f일 때(x = i, y = j)
                        System.out.println(i + " " + j + "\n");
                    }
                }
            }
        }

    }
}
