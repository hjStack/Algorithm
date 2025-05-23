import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String arr[][]=new String[5][15];

        for(int i=0; i<5; i++){
            String x[]=scanner.next().split("");
            for(int j=0; j<x.length; j++){
                arr[i][j]=x[j];
            }
        }

        // 출력
        String result="";
        for(int i=0; i<15; i++){
            for(int j=0; j<5; j++){
                if(arr[j][i] != null){
                    result += arr[j][i];
                }
            }
        }

        System.out.println(result);
    }
}
