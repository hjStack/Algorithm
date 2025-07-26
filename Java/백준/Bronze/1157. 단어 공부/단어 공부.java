import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String word=br.readLine();
        int arr[]=new int[26];  // 문자열을 입력받기에 앞서 빈도수를 나타내기 위한 배열 선언

        // 반복문을 돌면서 해당 문자가 어떤 문자느냐에 따라 해당 배열 원소를 증가
        for(int i=0; i<word.length(); i++){
            // 대문자일경우
            if(65 <= word.charAt(i) && word.charAt(i) <= 90){
                arr[word.charAt(i) - 65]++;  // 해당 인덱스의 값 1증가
            }

            // 소문자일경우
            else{
                arr[word.charAt(i) - 97]++;
            }
        }

        int max=-1;
        char ch='?';

        for(int i=0; i<26; i++){
            if(arr[i] > max){
                max=arr[i];
                ch=(char)(i+65);
            }
            else if(arr[i] == max){
                ch='?';
            }
        }

        System.out.println(ch);
    }
}
