import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());

        // Map은 리스트나 배열처럼 순차적으로 해당 요소의 값을 구하지 않고 키를 통해 값을 얻는다
        // 키는 중복이 불가능하고 동일한 키 값으로 값을 넣을시 최근에 넣은 값이 적용된다
        //  HashMap은 해싱 (Hashing)을 사용하기 때문에 많은 양의 데이터를 빠르게 검색할 수 있다는 특징

        HashMap<String,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(br.readLine(),0);  // key는 n개의 문자열, value는 0
        }

        int count=0;
        for(int i=0; i<m; i++){
           if(map.containsKey(br.readLine())){  // m개의 문자열이 key에 있는지 확인
               count++;
           }

        }

        System.out.println(count);

    }
}
