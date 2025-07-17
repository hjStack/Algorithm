import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int num=scanner.nextInt();

        System.out.println(factorial(num));
    }

    private static long factorial(int num){
        if(num <=1){
            return 1;
        }
        else{
            return num * factorial(num-1);
        }
    }
}
