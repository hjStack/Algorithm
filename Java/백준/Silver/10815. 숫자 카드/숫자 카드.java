import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int num,num1;
    static int[] arr;

    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        num=Integer.parseInt(br.readLine());  // 상근이가 가지고 있는 숫자 카드의 개수
        arr=new int[num];
        StringTokenizer st=new StringTokenizer(br.readLine()," ");  // 여러개 입력받을때

        for(int i=0; i<num; i++){
            arr[i]=Integer.parseInt(st.nextToken());  // 숫자 카드에 적혀있는 정수
        }

        Arrays.sort(arr); // 오름차순 정렬

        num1=Integer.parseInt(br.readLine());  // 상근이가 가지고 있는 숫자 카드인지 아닌지 구해야 할 M개의 정수
        st=new StringTokenizer(br.readLine()," ");

        for(int i=0; i<num1; i++){
            int n= Integer.parseInt(st.nextToken());
            if (binarySearch(n)) {
                bw.write("1 ");
            } else {
                bw.write("0 ");
            }
        }

        bw.flush();
        bw.close();
        br.close();

    }

    static boolean binarySearch(int target){

        int left=0;
        int right=num-1;

        while(left <= right){
            int midIndex=(left+right)/2;
            int mid=arr[midIndex];

            if(target > mid){
                 left=midIndex+1;
            }

            else if(target < mid){
                right=midIndex-1;
            }

            else{
                return true;
            }
        }

        return false;
    }
}
