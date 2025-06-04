import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String str=br.readLine().trim();  // 앞뒤 공백 제거
        int count=0;

        // 문자열을 공백을 기준으로 나누고, 단어의 개수를 센다

      if(!str.isEmpty()){
          String words[]=str.split("\\s+");
          count=words.length;
      }
        System.out.println(count);
    }
}
