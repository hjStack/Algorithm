import java.util.Scanner;

public class Main {
    public static void bubble_sort(int[] arr){
        for(int i=0; i < arr.length-1; i++){
            for(int j=0; j < arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int num=scanner.nextInt();
        int array[]=new int[num];

        for(int i=0; i<num; i++){
            array[i]=scanner.nextInt();
        }

        bubble_sort(array);

        for(int value:array){
            System.out.println(value + " ");
        }
    }
}
