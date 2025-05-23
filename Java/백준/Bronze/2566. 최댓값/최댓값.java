import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int arr[][]=new int[10][10];
        Scanner scanner=new Scanner(System.in);
        int max=-1;
        int maxRow = 0;
        int maxCol = 0;

        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                arr[i][j]=scanner.nextInt();
            }
        }

        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(arr[i][j] > max){
                    max=arr[i][j];
                    maxRow=i;
                    maxCol=j;
                }
            }
        }

        System.out.println(max);
        System.out.println((maxRow+1)+" " +(maxCol+1));
    }
}
