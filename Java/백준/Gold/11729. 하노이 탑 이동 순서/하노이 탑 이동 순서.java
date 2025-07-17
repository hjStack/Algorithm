import java.util.Scanner;

public class Main{

    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        // 하노이 탑의 가장 큰 규칙은 작은 원판 위에 큰 원판이 올 수 없음
        // 즉 A 에서 B로 가는 것을 Hanoi 함수라고 한다면, n-1 개만큼 반복한다는 의미다.
        //즉, 이동 횟수는 Hanoi(n-1) 이다.
        
        int num=scanner.nextInt();
        sb.append((int) (Math.pow(2, num) - 1)).append('\n');

        hanoi(num,1,2,3);
        System.out.println(sb);
    }

    private static void hanoi(int n,int start,int mid,int to){
        if(n == 1){
            sb.append(start + " " + to + "\n");
            return;
        }

        hanoi(n-1,start,to,mid);
        sb.append(start + " " + to + "\n");
        hanoi(n-1,mid,start,to);
    }
}
