
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int num=scanner.nextInt();
        int sum=0;

        for(int i=1; i<=num; i++) {
            int num1=scanner.nextInt();
            int num2=scanner.nextInt();

            sum = num1+num2;

            System.out.println("Case #"+ i + ": " + num1 + " + " + num2 +" = " + sum);
        }

    }
}
