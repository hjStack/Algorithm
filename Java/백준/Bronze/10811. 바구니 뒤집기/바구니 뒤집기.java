import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        // 바구니를 N개 가지고 있음
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st=new StringTokenizer(bufferedReader.readLine());
        // StringTokenizer 클래스는 문자열을 구분자를 이용하여 분리할 때 사용할 수 있습니다.

        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        int array[]=new int[n];

        for(int i=0; i<array.length; i++){
            array[i]=i+1;
        }

        for(int j=0; j<m; j++){
            st = new StringTokenizer(bufferedReader.readLine());
            int a=Integer.parseInt(st.nextToken())-1;
            int b=Integer.parseInt(st.nextToken())-1;

            while (a < b) {
              int temp=array[a];
              array[a]=array[b];
              array[b]=temp;
              a++;
              b--;
            }
        }

        for(int k = 0; k < array.length; k++){
            bw.write(array[k] + " ");
        }

        bw.flush();

    }
}
