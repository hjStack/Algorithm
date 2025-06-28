import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int num=scanner.nextInt();
        int x[]=new int[num];
        int y[]=new int[num];

        for(int i=0; i<num; i++){
            x[i]=scanner.nextInt();
            y[i]=scanner.nextInt();
        }

        int minX = x[0], maxX = x[0];
        int minY = y[0], maxY = y[0];

        for(int i=0; i<num; i++){
            if(x[i] < minX){
                minX=x[i];
            }

            if(x[i] > maxX){
                maxX=x[i];
            }

            if(y[i] < minY){
                minY=y[i];
            }

            if(y[i] > maxY){
                maxY=y[i];
            }

        }

        int width=maxX-minX;
        int height=maxY-minY;

        System.out.println(width * height);
    }
}
