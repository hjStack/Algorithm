import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

       Scanner scanner=new Scanner(System.in);

       int n=scanner.nextInt();
       int k=scanner.nextInt();
       int count=0;

       //  N의 약수들 중 K번째로 작은 수를 출력
       for(int i=1; i<=n; i++){
           if(n % i == 0){
               count+=1;
               //System.out.print(i + " ");
               if(count == k){
                   System.out.println(i);
                   return;
               }
           }
       }

        // 6 3
        // 1 2 3 6
        // 3번쨰로 작은 수 출력

        System.out.println(0);

    }
}
