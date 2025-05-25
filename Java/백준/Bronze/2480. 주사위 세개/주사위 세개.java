import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();

        if(a == b && b == c){
            System.out.println(10000 + (a * 1000));
        }

        else if(a == b && b != c){ // a == b
            System.out.println(1000 + (a) * 100);
        }

        else if(b == c && a != c){ // b==c
            System.out.println(1000 + (b) * 100);
        }

        else if(a == c && b != c){ // a == c
            System.out.println(1000 + (a) * 100);
        }

        else{ // a != b , b != c
            int max=a;
            if(b> max){
                max=b;
            }
            if(c> max){
                max=c;
            }

            System.out.println(max * 100);
        }
    }
}
