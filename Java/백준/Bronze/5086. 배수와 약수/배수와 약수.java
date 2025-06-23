import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while(true){

            int num1=scanner.nextInt();
            int num2=scanner.nextInt();

            if (num1 == 0 && num2 == 0) {
                break;
            }

            if (num2 % num1 == 0) {
                sb.append("factor").append("\n");
            } else if (num1 % num2 == 0) {
                sb.append("multiple").append("\n");
            } else {
                sb.append("neither").append("\n");
            }

        }

        System.out.print(sb.toString());
    }
}
