import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int num=scanner.nextInt();
        int arr[]=new int[num];

        for(int i=0; i<num; i++){
            arr[i]=scanner.nextInt();
        }

        int min = arr[0];
        int max = arr[0];

        for(int i=0; i<num; i++){
            if(arr[i] > max){
                max=arr[i];
            }

            if(arr[i] < min){
                min=arr[i];
            }
        }

        System.out.println(min + " " + max);

    }
}
