import java.util.Scanner;

public class Main{
    public static void main(String[] args)  {

        Scanner scanner=new Scanner(System.in);

        String str=scanner.next();
        int num=scanner.nextInt();

        char charValue=str.charAt(num-1);
        System.out.println(charValue);
    }
}
