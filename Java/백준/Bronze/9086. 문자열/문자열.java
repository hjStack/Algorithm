import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int num=scanner.nextInt();

        String str[]=new String[num];

        for(int i=0; i<num; i++){
            str[i]=scanner.next();

            System.out.print(str[i].charAt(0));
            System.out.println(str[i].charAt(str[i].length()-1));
        }
    }
}
