import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        // 카드의 합이 21합을 넘지 않는 한도 내에서 카드의
        // 합을 최대한 크게 만드는 게임

        // 김정인 버전의 블랙잭에서 각 카드에는 양의 정수가 쓰여 있다.

        int n=scanner.nextInt();
        int m=scanner.nextInt();

        int result[]=new int[n];
        int max=0;

        for(int i=0; i<n; i++){
            result[i]=scanner.nextInt();
        }

        // 최대한 M을 넘지 않으면서 m에 가까운 카드 3장 합
        for(int i=0; i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                for(int k=j+1; k<n; k++){
                    int sum=result[i]+result[j]+result[k];

                    if(sum <= m && sum > max){
                        max=sum;
                    }
                }
            }
        }


        System.out.println(max);

    }
}
