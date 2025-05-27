import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int n=scanner.nextInt();  // 바구니 N개
        int m=scanner.nextInt();
        int arr[]=new int[n];

        for(int i=0; i<n; i++){
            arr[i]=i+1;  // 바구니 초기화
        }

        for(int i=0; i<m; i++){   // 교환할 바구니
           int a=scanner.nextInt();
           int b=scanner.nextInt();

           int temp=arr[a-1];  // 인덱스는 0부터니까
           arr[a-1]=arr[b-1];
           arr[b-1]=temp;
        }

        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
