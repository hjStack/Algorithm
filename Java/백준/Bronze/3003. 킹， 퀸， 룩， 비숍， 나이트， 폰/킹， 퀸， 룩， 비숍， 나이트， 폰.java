import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 체스는 총 16개의 피스를 사용하며,
        // 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성되어 있다.

        Scanner scanner=new Scanner(System.in);
        int array[]={1,1,2,2,2,8};  // 총 체스

        int piece[]=new int[6];
        for(int i=0; i<6; i++){
            piece[i]=scanner.nextInt();
        }

        for(int i=0; i<6; i++){
            System.out.print(array[i] - piece[i] + " ");
        }
    }
}
