import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int num=Integer.parseInt(br.readLine());
        String input[]=br.readLine().split("");
        int sum=0;

        for(int i=0; i<num; i++){
            sum += Integer.parseInt(input[i]);
        }
        System.out.println(sum);
    }
}
