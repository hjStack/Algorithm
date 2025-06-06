import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);

        // 행렬 덧셈

        int n=scanner.nextInt();
        int m=scanner.nextInt();

        int arr1[][]=new int[n][m];
        int arr2[][]=new int[n][m];
        int result[][]=new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr1[i][j]=scanner.nextInt();  // 행렬 A의 원소
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr2[i][j]=scanner.nextInt();  // 행렬 B의 원소
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                result[i][j]=arr1[i][j]+arr2[i][j];
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println("");
        }
    }
}