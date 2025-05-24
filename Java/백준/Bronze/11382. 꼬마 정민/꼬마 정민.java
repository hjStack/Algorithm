import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        long arr[]=new long[3];
        long sum=0;
        for(int i=0; i<arr.length; i++){
            arr[i]=scanner.nextLong();
            sum += arr[i];
        }

        System.out.println(sum);
    }
}
