import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        for(int i=2; i<num; i++){
            while (num % i ==0){
                System.out.println(i);
                num/=i;
            }
        }

        // 모든 수를 나눠보면서 나머지가 0일경우 그 값을 출력
        if(num != 1) {
            System.out.println(num);
        }

    }
}
