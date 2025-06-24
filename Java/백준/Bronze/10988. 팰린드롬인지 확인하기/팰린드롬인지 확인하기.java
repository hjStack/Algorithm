import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        String writing=scanner.next();

        for(int i=0; i<writing.length()/2; i++){
            if(writing.charAt(i) != writing.charAt(writing.length()-1-i)){
                System.out.print("0");
                return;
            }
        }

        System.out.print("1");
    }
}
