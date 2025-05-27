
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int arr[]=new int[28];
        boolean check[]=new boolean[31];

        for(int i=0; i<arr.length; i++){
            arr[i]=scanner.nextInt();
            check[arr[i]]=true;
        }

        for(int i=1; i<=30; i++){
            if(!check[i]){
                System.out.println(i + "");
            }
        }
    }
}
