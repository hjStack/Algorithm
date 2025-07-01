import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();

        // 3킬로, 5킬로가 있음

        if(num == 4 || num ==7){
            System.out.println(-1);
        }

        else if(num % 5 == 0){
            System.out.println(num/5);
        }

        else if(num % 5 == 1 || num % 5 == 3){
            System.out.println((num/5)+1);
        }

        else if(num % 5 == 2 || num % 5 == 4){
            System.out.println((num/5)+2);
        }
    }
}
