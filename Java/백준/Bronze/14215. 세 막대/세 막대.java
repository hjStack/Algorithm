import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// Buffered Stream은 버퍼(내부적으로 8,192byte 크기의 배열)를 통해 한번에 읽기 또는 쓰기를 수행
// 한 문장씩 읽고 쓰는 방법

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        // 공백으로 구분된 정수 여러개 입력받기
        int a=Integer.parseInt(input[0]);
        int b=Integer.parseInt(input[1]);
        int c=Integer.parseInt(input[2]);

        // 가장 큰 둘레의 삼각형
        // 세 막대를 이용해서 넓이가 양수인 삼각형
        // 삼각형의 둘레

        // 가장 긴변  // c < a+b
        // 예를 들어 3 5 10 같은 경우는 삼각형을 만들 수 없다
        // 때문에 삼각형을 만들기 위해선 가장 긴변의 길이를 줄여야 함
        // 3 5 7은 가능

        int arr[]={a,b,c};
        Arrays.sort(arr);


        if(arr[0]+arr[1]>arr[2]){
            System.out.println(a+b+c);
        }

        else{
            System.out.println((arr[0]+arr[1]) * 2 -1);
        }
    }
}
