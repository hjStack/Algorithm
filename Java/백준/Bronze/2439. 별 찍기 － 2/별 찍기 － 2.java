import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int num=scanner.nextInt();

        for(int i=1; i<=num; i++){

            for(int k=1; k<=num-i; k++){
                System.out.print(" ");
            }

            // 별 출력
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
