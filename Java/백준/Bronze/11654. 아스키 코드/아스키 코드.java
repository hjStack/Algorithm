import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        char word=scan.next().charAt(0);

        System.out.println(Integer.valueOf(word));   // 문자 -> 숫자
    }

}
