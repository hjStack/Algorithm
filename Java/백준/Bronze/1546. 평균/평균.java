import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        // 점수 조작 프로그램
        // 자기 점수 중에 최댓값  = M

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        int array[]=new int[num];
        int max=0;
        StringTokenizer st=new StringTokenizer(br.readLine());

        for(int i=0; i<num; i++){
            array[i]=Integer.parseInt(st.nextToken());

            if(array[i] > max){
                max=array[i];
            }
        }

        double result=0;

        for(int i=0; i<num; i++){
            result += (double) array[i]/max*100;
        }

        System.out.println(result/num);

    }
}
