import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int x1=scanner.nextInt();
        int y1=scanner.nextInt();
        int x2=scanner.nextInt();
        int y2=scanner.nextInt();
        int x3=scanner.nextInt();
        int y3=scanner.nextInt();

        int x4=0, y4=0;

        // 한번만 나온 x좌표가 네번쨰 점의 x좌표가 됨
        // 축에 평행한 직사각형 때문

        // x좌표 비교
        if(x1 == x2){
            x4=x3;
        }
        else if(x1 == x3){
            x4=x2;
        }
        else{
            x4=x1;
        }

        // y좌표 비교
        if(y1 == y2){
            y4=y3;
        }
        else if(y1 == y3){
            y4=y2;
        }
        else{
            y4=y1;
        }

        System.out.println(x4 + " " + y4);

    }
}
