import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int h=scanner.nextInt();
        int m=scanner.nextInt();

        int minute=60;
        int hour=24;

        m-=45;

        if(m < 0){
            m+=60;
            h-=1;
            if(h < 0){
                h=23;
            }
        }

        System.out.println(h + " " + m);
    }
}
