import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int num=Integer.parseInt(br.readLine());
        String writer[]=new String[num];

        for(int i=0; i<num; i++) {
            StringTokenizer st=new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            StringBuilder sb = new StringBuilder();

            for(int j=0; j<str.length(); j++){
                char ch=str.charAt(j);

                for(int k=0; k<a; k++){
                    sb.append(ch);
                }
            }

            System.out.println(sb);
        }

    }
}
