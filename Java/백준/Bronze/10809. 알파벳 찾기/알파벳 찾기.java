import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int arr[]=new int[26];

        for(int i=0; i<arr.length; i++){   // -1로 초기화 과정
            arr[i]=-1;
        }

        String str=br.readLine();

        for(int i=0; i<str.length(); i++){
            char charValue=str.charAt(i);

            if(arr[charValue - 'a'] == -1){ // 아스키문자로 비교해서 배열로 저장 
                arr[charValue - 'a']=i; 
            }
        }

        for(int num:arr){
            System.out.print(num+ " ");
        }
    }
}
