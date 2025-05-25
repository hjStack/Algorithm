import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int num=scanner.nextInt();
        int result=0;

        for(int i=0; i<num; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            result = a + b;
            System.out.println(result);
        }

    }
}
