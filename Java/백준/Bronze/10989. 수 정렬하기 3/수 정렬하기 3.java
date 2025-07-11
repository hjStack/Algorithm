import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        // 카운팅 정렬은 시간복잡도가 𝚶(𝑛) 으로 엄청난 성능을 보여주는 알고리즘
        // array 를 한 번 순회하면서 각 값이 나올 때마다 해당 값을 index로 하는 새로운 배열(counting)의 값을 1 증가시킨다.

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num=Integer.parseInt(br.readLine());
        int array[]=new int[num];

        for(int i=0; i<num; i++){
            array[i]=Integer.parseInt(br.readLine());
        }

        Arrays.sort(array);

        for(int i = 0; i < num; i++){
            sb.append(array[i]).append('\n');
        }

        System.out.println(sb);
    }
}
